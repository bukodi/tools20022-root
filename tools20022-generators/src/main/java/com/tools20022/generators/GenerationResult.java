package com.tools20022.generators;

import java.util.StringJoiner;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;

public abstract class GenerationResult {
	
	public final GenerationContext<?> ctx;

	
	protected GenerationResult( GenerationContext<?> ctx) {
		this.ctx = ctx;
	}
	
	public abstract void flush();
	
}
