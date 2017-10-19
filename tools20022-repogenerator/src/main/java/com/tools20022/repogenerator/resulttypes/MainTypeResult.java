package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.JavaClassSource;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class MainTypeResult extends GenerationResult{

	public JavaClassSource structSrc;
	public JavaClassSource beanSrc;

	public MainTypeResult(GenerationContext<?> ctx, StructuredName baseName) {
		super(ctx, baseName);
	}

	@Override
	public void flush() {
		ctx.saveSourceFile(structSrc);
		if( beanSrc != null ) {
			ctx.saveSourceFile(beanSrc);
		}
	}

	@Override
	public String getJavaFQN() {
		String fqn = baseName.getPackage() + "." + baseName.getCompilationUnit() + "_";
		fqn += baseName.getNestedTypeName() != null ? "." + baseName.getNestedTypeName(): "";
		fqn += baseName.getMemberName() != null ? "." + baseName.getMemberName() : "";
		return fqn;
	}
	
	@Override
	public String getJavaBeanFQN() {
		String fqn = baseName.getPackage() + "." + baseName.getCompilationUnit() + "";
		fqn += baseName.getNestedTypeName() != null ? "." + baseName.getNestedTypeName(): "";
		fqn += baseName.getMemberName() != null ? "." + baseName.getMemberName() : "";
		return fqn;
	}
	
	
}
