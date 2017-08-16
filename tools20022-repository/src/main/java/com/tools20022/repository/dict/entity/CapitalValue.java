package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Capital;

/**
 * Value of the capital.
 */
public class CapitalValue extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Capital Capital;

	public Capital getCapital() {
		return Capital;
	}

	public void setCapital(Capital Capital) {
		this.Capital = Capital;
	}
}