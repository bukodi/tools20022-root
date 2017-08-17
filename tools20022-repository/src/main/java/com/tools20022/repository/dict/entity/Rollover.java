package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;

/**
 * Process whereby a financial instrument is reinvested at maturity.
 */
public class Rollover extends ObligationFulfilment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesSettlement SecuritiesSettlement;

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}
}