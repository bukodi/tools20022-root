package com.tools20022.repogenerator.resulttypes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.RuntimePropertyAware;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMRepositoryType;

public class PropertyResult extends StaticFieldResult {

	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;
	public MethodSource<JavaClassSource> beanWithSrc;

	PropertyResult(MainTypeResult containerGen, MMConstruct mmBean, StructuredName name) {
		super(containerGen, mmBean, name);
		
		
		MMRepositoryType propertyMMType = mmBean.getMemberType();
		String propertyType = ctx.getStructuredName(propertyMMType).getFullName();
		
		boolean isBasetype = mmBean.getMemberType() instanceof MMDataType; 
		boolean isMultiple = mmBean.getMaxOccurs().orElse(100) > 1; 
		boolean isOptional = mmBean.getMinOccurs().orElse(0) == 0;


		{
			String fieldName = name.getMemberName().substring(0, 1).toLowerCase() + name.getMemberName().substring(1);
			fieldName = RoasterHelper.convertToJavaName(fieldName);
			beanFieldSrc = containerGen.src.addField().setName(fieldName);
			beanFieldSrc.setProtected();
			if( isMultiple )
				beanFieldSrc.setType(List.class.getName() + "<" + propertyType + ">");
			else
				beanFieldSrc.setType(propertyType);
		}

		String wrappedtype; 
		if( isMultiple )
			wrappedtype = List.class.getName() + "<" + propertyType + ">";
		else if( isOptional )
			wrappedtype = Optional.class.getName() + "<" + propertyType + ">";
		else
			wrappedtype = propertyType;
		{
			// TODO: support isXXX() for boolean type
			beanGetterSrc = containerGen.src.addMethod().setName("get" + name.getMemberName());
			beanGetterSrc.setPublic();
			beanGetterSrc.setReturnType(wrappedtype);
			if( isMultiple ) {
				beanGetterSrc.setBody( 
						"return " + beanFieldSrc.getName() + " == null ? "
								+ beanFieldSrc.getName() + " = new " + ArrayList.class.getName() + "<>() : "
								+ beanFieldSrc.getName() + " ;");
			} else if ( isOptional ) { 
				beanGetterSrc.setBody( 
						"return " + beanFieldSrc.getName() + " == null ? "
								+ Optional.class.getName() + ".empty() : "
								+ Optional.class.getName() + ".of( " + beanFieldSrc.getName() + ") ;");
			} else {
				beanGetterSrc.setBody("return " + beanFieldSrc.getName() + ";");				
			}
		}
		{
			// TODO: support isXXX() for boolean type
			beanSetterSrc = containerGen.src.addMethod().setName("set" + name.getMemberName());
			beanSetterSrc.setPublic();
			beanSetterSrc.setReturnType(containerGen.src.getName());
			if( isMultiple ) {
				beanSetterSrc.addParameter(List.class.getName() + "<" + propertyType + ">", beanFieldSrc.getName());				
				beanSetterSrc.setBody("this." + beanFieldSrc.getName() + " = "  
						+ Objects.class.getName() + ".requireNonNull(" 
						+ beanFieldSrc.getName() + ");\n"
						+ "return this;");
			} else if ( isOptional ) {
				beanSetterSrc.addParameter(propertyType, beanFieldSrc.getName());				
				beanSetterSrc.setBody("this." + beanFieldSrc.getName() + " = " + beanFieldSrc.getName() + ";\n"
						+ "return this;");				
			} else {				
				beanSetterSrc.addParameter(propertyType, beanFieldSrc.getName());				
				beanSetterSrc.setBody(""
						+ "this." + beanFieldSrc.getName() + " = "
						+ Objects.class.getName() + ".requireNonNull(" 
						+ beanFieldSrc.getName() + ");\n"
						+ "return this;");
			}
		}
		{
			staticFieldSrc = containerGen.src.addField().setName("mm" + name.getMemberName());
			staticFieldSrc.setPublic().setStatic(true).setFinal(true);
			staticFieldSrc.setType(mmBean.getMetamodel().getBeanClass());
			
			// TODO:
			//createJavaDoc(staticFieldSrc, mmBean);
		}
		
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
