package com.tools20022.generators;

public abstract class GenerationResult<M,B> {
	
	public final GenerationContext<M,B> ctx;

	
	protected GenerationResult( GenerationContext<M,B> ctx) {
		this.ctx = ctx;
	}
	
	public abstract void flush();
	
}
