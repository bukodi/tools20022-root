package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.EnumConstantSource;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class EnumConstantResult extends GenerationResult{

	public EnumConstantSource enumConstantSrc;

	public EnumConstantResult(GenerationContext<?> ctx, StructuredName baseName) {
		super(ctx, baseName);
	}

	@Override
	public void flush() {
		// Nothing
	}
	
	@Override
	public String getJavaFQN() {
		String fqn = baseName.getPackage() + "." + baseName.getCompilationUnit() ;
		fqn += baseName.getNestedTypeName() != null ? "." + baseName.getNestedTypeName(): "";
		fqn += baseName.getMemberName() != null ? "." + baseName.getMemberName() : "";
		return fqn;
	}

	
}
