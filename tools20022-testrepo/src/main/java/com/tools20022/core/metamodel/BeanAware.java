package com.tools20022.core.metamodel;

public interface BeanAware<T> {

	default Class<T> getBeanClass() {
		throw new RuntimeException("Should override in concrate classes!");
	}
	
}
