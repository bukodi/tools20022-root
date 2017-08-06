package com.tools20022.repository;

import com.tools20022.core.repo.ReflectionBasedRepository;
import com.tools20022.metamodel.StandardMetamodel2013;

public class GeneratedRepository extends ReflectionBasedRepository {

	private GeneratedRepository() {
		super(StandardMetamodel2013.metamodel());
	}
}