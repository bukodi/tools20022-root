package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jboss.forge.roaster.ParserException;
import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.RuntimeInstanceAware;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.repogenerator.RawRepository;

public class EnumTypeResult extends MainTypeResult {
	
	public MethodSource<JavaClassSource> valueOfMethod;
	public List<EnumConstantResult> enumConstants = new ArrayList<>(); 
	

	public EnumTypeResult(GenerationContext<RawRepository,MMModelEntity> ctx, MMCodeSet mmBean) {
		super(ctx, mmBean);
	}
	
	public EnumConstantResult addConstant( MMCode mmCode) {
		EnumConstantResult newCode = new EnumConstantResult(this, mmCode);
		enumConstants.add(newCode);
		return newCode;
	}


	@Override
	public void flush() {
		{
			String init = "mmObject_lazy.compareAndSet(null, new " + mmBean.getMetamodel().getBeanClass().getName()
					+ "(){{\n";
			for(AttrResult attrGen : attrGens ) {
				init += attrGen.initializationSource + "\n";
			}
			init += "}\n";
			if( mmBean instanceof RuntimeInstanceAware ) {
				init+= "@" + Override.class.getName() + "\n";
				init+= "public Class<?> getInstanceClass() {\n";
				init+= "  return "+ src.getName()+".class;\n";
				init+= "}\n";
			}
			
			init += "});";
			init += "return mmObject_lazy.get();";
			try {
				mmObjectMethod.setBody(init);				
			} catch ( ParserException pe ) {
				System.err.println( init );
				throw pe;
			}
		}
		if( ! ctx.isSkipDocGeneration() ){
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(src, attrsJavadoc);
		}
		
		{
			FieldSource<JavaClassSource> codeNamesMapField = src.addField().setName("codesByName");
			codeNamesMapField.setFinal(true).setStatic(true).setPrivate();
			codeNamesMapField.setType(LinkedHashMap.class.getName() + "<" + String.class.getName() + ", " + src.getName() + ">");
			codeNamesMapField.setLiteralInitializer(" new " + LinkedHashMap.class.getName() + "<>();");
			
			String bodyTxt = "";
			for( EnumConstantResult code : enumConstants ) {
				String line = codeNamesMapField.getName() + ".put( " ;
				line += code.staticFieldSrc.getName() + ".getCodeName().get(), "; 
				line += code.staticFieldSrc.getName() + " );";
				bodyTxt += line + "\n";
			}
			RoasterHelper.setStaticInitializer(src, bodyTxt);

			valueOfMethod = src.addMethod();
			valueOfMethod.setName("valueOf").setPublic().setStatic(true);
			valueOfMethod.addParameter(String.class, "codeName");
			valueOfMethod.setReturnType(src);
			valueOfMethod.setBody("return " + codeNamesMapField.getName() + ".get( codeName );" );

			MethodSource<JavaClassSource> valuesMethod = src.addMethod();
			valuesMethod.setName("values").setPublic().setStatic(true);
			valuesMethod.setReturnType(src.getName() + "[]");
			String body =  src.getName() + "[] values = new " + src.getName() + "[" + codeNamesMapField.getName() + ".size()];\n";
			body +=  "return " + codeNamesMapField.getName() + ".values().toArray(values);";
			valuesMethod.setBody(body );
		}
		
		{
			JavaClassSource xmlAdapter = src.addNestedType(JavaClassSource.class);
			xmlAdapter.setName("InternalXmlAdapter");
			xmlAdapter.setProtected().setStatic(true);
			xmlAdapter.setSuperType(XmlAdapter.class.getName() + "<" + String.class.getName() + ", " + src.getName() + ">");
			
			MethodSource<JavaClassSource> unmarshal = xmlAdapter.addMethod().setName("unmarshal");
			unmarshal.setPublic().addAnnotation(Override.class);
			unmarshal.setReturnType(src);
			//unmarshall.addParameter(gen.src, "value");
			unmarshal.addParameter(String.class, "codeName");
			unmarshal.setBody("return valueOf( codeName );");

			MethodSource<JavaClassSource> marshal = xmlAdapter.addMethod().setName("marshal");
			marshal.setPublic().addAnnotation(Override.class);
			marshal.setReturnType(String.class);
			marshal.addParameter(src.getName(), "codeObj");
			marshal.setBody("return codeObj.getCodeName().orElse(null);");
			
			AnnotationSource<JavaClassSource> jaxbAnnot = src.addAnnotation(XmlJavaTypeAdapter.class);
			jaxbAnnot.setLiteralValue("value", src.getQualifiedName() + ".InternalXmlAdapter.class");

		}

		
		
		ctx.saveSourceFile(src, dontModifyImports);
	}

}
