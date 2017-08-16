package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.codeset.PaymentTimeCode;
import com.tools20022.repository.dict.entity.RegisteredContract;
import com.tools20022.repository.dict.entity.Loan;

/**
 * Specifies the payment terms of the obligation.
 */
public class PaymentTerms extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount Amount;
	private PercentageRate Percentage;
	private DateTimePeriod PaymentPeriod;
	private PaymentObligation RelatedPaymentObligation;
	private PaymentTimeCode PaymentTime;
	private RegisteredContract RelatedPaymentScheduleType;
	private Loan RelatedLoan;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}

	public DateTimePeriod getPaymentPeriod() {
		return PaymentPeriod;
	}

	public void setPaymentPeriod(DateTimePeriod PaymentPeriod) {
		this.PaymentPeriod = PaymentPeriod;
	}

	public PaymentObligation getRelatedPaymentObligation() {
		return RelatedPaymentObligation;
	}

	public void setRelatedPaymentObligation(
			PaymentObligation RelatedPaymentObligation) {
		this.RelatedPaymentObligation = RelatedPaymentObligation;
	}

	public PaymentTimeCode getPaymentTime() {
		return PaymentTime;
	}

	public void setPaymentTime(PaymentTimeCode PaymentTime) {
		this.PaymentTime = PaymentTime;
	}

	public RegisteredContract getRelatedPaymentScheduleType() {
		return RelatedPaymentScheduleType;
	}

	public void setRelatedPaymentScheduleType(
			RegisteredContract RelatedPaymentScheduleType) {
		this.RelatedPaymentScheduleType = RelatedPaymentScheduleType;
	}

	public Loan getRelatedLoan() {
		return RelatedLoan;
	}

	public void setRelatedLoan(Loan RelatedLoan) {
		this.RelatedLoan = RelatedLoan;
	}
}