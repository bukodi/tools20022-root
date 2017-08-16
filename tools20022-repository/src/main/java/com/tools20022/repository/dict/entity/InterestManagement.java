package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.entity.FinancialTransaction;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.PaymentObligation;

/**
 * Management of interest which consists into calculating the interest,
 * requesting its payment or distributing the interest proceeds.
 */
public class InterestManagement extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InterestCalculation InterestCalculation;
	private FinancialTransaction FinancialTransaction;
	private Interest Interest;
	private PaymentObligation PaymentObligation;

	public InterestCalculation getInterestCalculation() {
		return InterestCalculation;
	}

	public void setInterestCalculation(InterestCalculation InterestCalculation) {
		this.InterestCalculation = InterestCalculation;
	}

	public FinancialTransaction getFinancialTransaction() {
		return FinancialTransaction;
	}

	public void setFinancialTransaction(
			FinancialTransaction FinancialTransaction) {
		this.FinancialTransaction = FinancialTransaction;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}
}