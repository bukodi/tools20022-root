package com.tools20022.repogenerator.resulttypes;

import java.util.StringJoiner;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class SubTypeResult extends GenerationResult {

	public FieldSource<JavaClassSource> structSrc;
	public StringJoiner structConstructorBody = new StringJoiner(";\n");
	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;

	public SubTypeResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		String fieldinitializer = "new " + mmBean.getMetamodel().getBeanClass().getName() + "()";
		fieldinitializer += "{{" + mmObjectInitBlock.toString() + "}};";
		structSrc.setLiteralInitializer(fieldinitializer);		
	}

}
