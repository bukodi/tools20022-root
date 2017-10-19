package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.generators.GenerationResult;

public class SubTypeResult extends GenerationResult {

	public FieldSource<JavaClassSource> structSrc;
	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;

}
