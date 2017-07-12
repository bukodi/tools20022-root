package com.tools20022.generators;

import org.jboss.forge.roaster.model.source.JavaSource;

public abstract class GenerationResult {
	
	public static <T extends JavaSource<?>> JavaResult<T> fromJavaSource( T src ) {
		return new JavaResult<>(src);
	}
	
	public static class JavaResult<T extends JavaSource<?>>  extends GenerationResult {
		public final T src;
		
		private JavaResult(T src) {
			this.src = src;
		}
	}
}
