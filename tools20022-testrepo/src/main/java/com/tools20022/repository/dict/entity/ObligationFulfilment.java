package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Processes by which an obligation is extinguished fully or partially.
 */
public class ObligationFulfilment extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODate Date;

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}
}