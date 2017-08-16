package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.IndividualPayment;
import com.tools20022.repository.dict.entity.Cheque;

/**
 * Payment made by drawing a cheque in order to settle a debt.
 */
public class ChequePayment extends IndividualPayment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Cheque Cheque;

	public Cheque getCheque() {
		return Cheque;
	}

	public void setCheque(Cheque Cheque) {
		this.Cheque = Cheque;
	}
}