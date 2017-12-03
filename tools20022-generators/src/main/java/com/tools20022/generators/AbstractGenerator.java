package com.tools20022.generators;

public abstract class AbstractGenerator<M,B> {
	
	protected final GenerationContext<M, B> ctx; 

	protected AbstractGenerator( GenerationContext<M, B> ctx ) {
		this.ctx = ctx;
	}

	public abstract StructuredName getStructuredName( B modelBean );

	public abstract void prepare( M model, ProgressMonitor monitor );

	public abstract void generate( M model, ProgressMonitor monitor );
}
