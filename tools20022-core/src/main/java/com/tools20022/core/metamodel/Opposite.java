package com.tools20022.core.metamodel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.tools20022.metamodel.MMModelEntity;

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD,ElementType.METHOD})
public @interface Opposite {
	Class<? extends MMModelEntity> bean();
	String attribute();
}
