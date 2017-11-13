package com.tools20022.core.metamodel;

public interface BeanAware {

	default Class<?> getBeanClass() {
		throw new RuntimeException("Should override in concrate classes!");
	}
	
}
