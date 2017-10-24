package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.EnumConstantSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class EnumConstantResult extends GenerationResult{

	public EnumConstantSource enumConstantSrc;

	public EnumConstantResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		String fieldinitializer = "new " + mmBean.getMetamodel().getBeanClass().getName() + "()";
		fieldinitializer += "{{" + mmObjectInitBlock.toString() + "}}";
		enumConstantSrc.setConstructorArguments(fieldinitializer);
	}
	
}
