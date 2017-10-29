package com.tools20022.generators;

public abstract class GenerationResult {
	
	public final GenerationContext<?> ctx;

	
	protected GenerationResult( GenerationContext<?> ctx) {
		this.ctx = ctx;
	}
	
	public abstract void flush();
	
}
