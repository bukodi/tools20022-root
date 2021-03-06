package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.RuntimePropertyAware;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMRepositoryType;

public class PropertyResult extends MemberResult {

	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;
	public MethodSource<JavaClassSource> beanWithSrc;
	
	public final StringJoiner staticFieldInitializerBody;

	PropertyResult(MainTypeResult containerGen, MMConstruct mmBean) {		
		super(containerGen, mmBean);
		if( ! (mmBean instanceof RuntimePropertyAware) )
			throw new RuntimeException(mmBean.getName() + " isn't an instance of " + RuntimePropertyAware.class.getName());		
		
		MMRepositoryType propertyMMType = mmBean.getMemberType();
		String propertyType = ctx.getStructuredName(propertyMMType).getFullName();
		
		boolean isBasetype = mmBean.getMemberType() instanceof MMDataType; 
		boolean isMultiple = mmBean.getMaxOccurs().orElse(100) > 1; 
		boolean isOptional = mmBean.getMinOccurs().orElse(0) == 0;


		{
			String fieldName = baseName.getMemberName().substring(0, 1).toLowerCase() + baseName.getMemberName().substring(1);
			fieldName = RoasterHelper.convertToJavaName(fieldName);
			beanFieldSrc = containerGen.src.addField().setName(fieldName);
			beanFieldSrc.setProtected();
			if( isMultiple )
				beanFieldSrc.setType(List.class.getName() + "<" + propertyType + ">");
			else
				beanFieldSrc.setType(propertyType);
		}

		containerGen.src.addImport(propertyType);
		String wrappedtype; 
		if( isMultiple )
			wrappedtype = List.class.getName() + "<" + propertyType + ">";
		else if( isOptional )
			wrappedtype = Optional.class.getName() + "<" + propertyType + ">";
		else
			wrappedtype = propertyType;
		{
			// TODO: support isXXX() for boolean type
			beanGetterSrc = containerGen.src.addMethod().setName("get" + baseName.getMemberName());
			beanGetterSrc.setPublic();
			beanGetterSrc.setReturnType(wrappedtype);
			if( isMultiple ) {
				beanGetterSrc.setBody( 
						"return " + beanFieldSrc.getName() + " == null ? "
								+ beanFieldSrc.getName() + " = new " + ArrayList.class.getName() + "<>() : "
								+ beanFieldSrc.getName() + " ;");
			} else if ( isOptional ) { 
				beanGetterSrc.setBody( 
						"return " + Optional.class.getName() + ".ofNullable( " + beanFieldSrc.getName() + ");");
			} else {
				beanGetterSrc.setBody("return " + beanFieldSrc.getName() + ";");				
			}
		}
		{
			// TODO: support isXXX() for boolean type
			beanSetterSrc = containerGen.src.addMethod().setName("set" + baseName.getMemberName());
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
			staticFieldSrc = containerGen.src.addField().setName("mm" + baseName.getMemberName());
			staticFieldSrc.setPublic().setStatic(true).setFinal(true);
			staticFieldSrc.setType(mmBean.getMetamodel().getBeanClass().getName() + "<" + containerGen.src.getName()+ "," + beanGetterSrc.getReturnType().getQualifiedNameWithGenerics() +">");
			
			String initPrefix = "new " + mmBean.getMetamodel().getBeanClass().getName() + "<" + containerGen.src.getName()+ "," + beanGetterSrc.getReturnType().getQualifiedNameWithGenerics() +">" + "(){{";
			String initSuffix = "}\n";
			
			initSuffix+= "@" + Override.class.getName() + "\n"; 
			initSuffix+= "public " + beanGetterSrc.getReturnType().getQualifiedNameWithGenerics() + " getValue(" +  containerGen.src.getName()+ " obj) {\n";
			initSuffix+= "  return obj." + beanGetterSrc.getName() + "();\n";
			initSuffix+= "}\n";						

			initSuffix+= "@" + Override.class.getName() + "\n"; 
			initSuffix+= "public void setValue(" +  containerGen.src.getName()+ " obj, " + beanGetterSrc.getReturnType().getQualifiedNameWithGenerics() + " value ) {\n";
			if( isOptional && !isMultiple ) {
				initSuffix+= "  obj." + beanSetterSrc.getName() + "( value.orElse(null) );\n";
			} else {
				initSuffix+= "  obj." + beanSetterSrc.getName() + "( value );\n";				
			}
			initSuffix+= "}\n";						
			
			
			initSuffix += "};";
			staticFieldInitializerBody = new StringJoiner("\n", initPrefix, initSuffix);

			// TODO:
			//createJavaDoc(staticFieldSrc, mmBean);
		}
		
	}

	@Override
	public void flush() {
		for (AttrResult attrGen : attrGens) {
			staticFieldInitializerBody.add( attrGen.initializationSource );
		}
		staticFieldSrc.setLiteralInitializer(staticFieldInitializerBody.toString());

		if (!ctx.isSkipDocGeneration()) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
		}
	}

}
