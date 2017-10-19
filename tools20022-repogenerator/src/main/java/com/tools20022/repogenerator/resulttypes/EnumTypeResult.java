package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.JavaEnumSource;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class EnumTypeResult extends GenerationResult {

	public JavaEnumSource structSrc;

	public EnumTypeResult(GenerationContext<?> ctx, StructuredName baseName) {
		super(ctx, baseName);
	}

	@Override
	public void flush() {
		ctx.saveSourceFile(structSrc);		
	}

	@Override
	public String getJavaFQN() {
		String fqn = baseName.getPackage() + "." + baseName.getCompilationUnit() ;
		fqn += baseName.getNestedTypeName() != null ? "." + baseName.getNestedTypeName(): "";
		fqn += baseName.getMemberName() != null ? "." + baseName.getMemberName() : "";
		return fqn;
	}

}
