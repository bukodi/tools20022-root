package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.InvoiceFinancingAgreement;

/**
 * Transfer by one party to a third party of its receivables.
 */
public class Assignment extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PaymentObligation PaymentObligation;
	private InvoiceFinancingAgreement FinancingAgreement;

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public InvoiceFinancingAgreement getFinancingAgreement() {
		return FinancingAgreement;
	}

	public void setFinancingAgreement(
			InvoiceFinancingAgreement FinancingAgreement) {
		this.FinancingAgreement = FinancingAgreement;
	}
}