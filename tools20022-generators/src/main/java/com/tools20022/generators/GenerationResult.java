package com.tools20022.generators;

import java.util.StringJoiner;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;

public abstract class GenerationResult {
	
	public final GenerationContext<?> ctx;
	public final GeneratedMetamodelBean mmBean;
	public final StructuredName baseName;

	public StringJoiner mmObjectInitBlock = new StringJoiner("\n");

	
	protected GenerationResult( GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName ) {
		this.ctx = ctx;
		this.mmBean = mmBean;
		this.baseName = baseName;
	}
	
	public abstract void flush();
	
	public void addMMAttributeInit( String attrInitExpression ) {
		mmObjectInitBlock.add(attrInitExpression);
	}


}
