package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public class SubTypeResult extends GenerationResult {

	public FieldSource<JavaClassSource> structSrc;
	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;

	public SubTypeResult(GenerationContext<?> ctx, StructuredName baseName) {
		super(ctx, baseName);
	}

	@Override
	public void flush() {
		// Nothing to do		
	}

	@Override
	public String getJavaFQN() {
		String fqn = baseName.getPackage() + "." + baseName.getCompilationUnit() + "_";
		fqn += baseName.getNestedTypeName() != null ? "." + baseName.getNestedTypeName(): "";
		fqn += baseName.getMemberName() != null ? "." + baseName.getMemberName() : "";
		return fqn;
	}

}
