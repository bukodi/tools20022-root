package com.tools20022.repogenerator.resulttypes;

import java.lang.reflect.Method;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.RuntimePropertyAware;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;

public class PropertyResult extends StaticFieldResult {

	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;

	PropertyResult(MainTypeResult containerGen, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(containerGen, mmBean, baseName);
	}

	@Override
	public void flush() {
		String init = "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{";
		for (AttrResult attrGen : attrGens) {
			init += attrGen.initializationSource + "\n";
		}
		init += "}\n";
		if( mmBean instanceof RuntimePropertyAware ) {
			beanGetterSrc.getOrigin().addImport(Method.class);
			init+= "public " + Method.class.getSimpleName() + " getGetterMethod() {\n";
			init+= "  try {\n";
			init+= "    return "+ beanGetterSrc.getOrigin().getName()+".class.getMethod(\"" + beanGetterSrc.getName()+ "\", new Class[]{} );\n";
			init+= "  } catch (NoSuchMethodException e) {	throw new RuntimeException(e);}\n"; 
			init+= "}\n";
			
			// TODO: Add getSetterMethod()
		}
		
		init += "};";
		staticFieldSrc.setLiteralInitializer(init);

		if (!ctx.isSkipDocGeneration()) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
		}
	}

}
