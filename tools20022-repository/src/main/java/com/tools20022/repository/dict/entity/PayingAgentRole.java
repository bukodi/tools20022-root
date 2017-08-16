package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Additional party appointed to distribute payment or securities on behalf of
 * the issuer.
 */
public class PayingAgentRole extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount CommissionAmount;

	public CurrencyAndAmount getCommissionAmount() {
		return CommissionAmount;
	}

	public void setCommissionAmount(CurrencyAndAmount CommissionAmount) {
		this.CommissionAmount = CommissionAmount;
	}
}