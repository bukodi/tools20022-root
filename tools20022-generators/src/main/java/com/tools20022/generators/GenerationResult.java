package com.tools20022.generators;

public abstract class GenerationResult {
	
	public final GenerationContext<?> ctx;
	public final StructuredName baseName;
	
	protected GenerationResult( GenerationContext<?> ctx, StructuredName baseName ) {
		this.ctx = ctx;
		this.baseName = baseName;
	}
	
	public abstract void flush();
	
	public abstract String getJavaFQN();

	public String getJavaBeanFQN() {
		return null;
	}
}
