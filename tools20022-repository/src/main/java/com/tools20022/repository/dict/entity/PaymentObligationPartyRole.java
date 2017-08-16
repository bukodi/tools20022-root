package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.PaymentObligation;

/**
 * Role played by a party in the context of a payment obligation.
 */
public class PaymentObligationPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PaymentObligation PaymentObligation;

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}
}