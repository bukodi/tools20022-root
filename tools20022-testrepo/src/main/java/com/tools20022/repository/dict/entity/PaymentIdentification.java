package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Specifies the different identifications associated with a payment
 * transaction.
 */
public class PaymentIdentification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text ExecutionIdentification;

	public Max35Text getExecutionIdentification() {
		return ExecutionIdentification;
	}

	public void setExecutionIdentification(Max35Text ExecutionIdentification) {
		this.ExecutionIdentification = ExecutionIdentification;
	}
}