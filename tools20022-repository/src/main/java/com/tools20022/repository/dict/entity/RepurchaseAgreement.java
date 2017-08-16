package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.entity.PaymentObligation;

/**
 * Sale of securities together with an agreement for the seller to buy back the
 * securities at a later date. A repo is equivalent to a spot sale combined with
 * a forward contract. For the seller of the security it is a repo; for the
 * buyer of the security it is a reverse repurchase agreement.
 */
public class RepurchaseAgreement extends SecuritiesFinancing
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