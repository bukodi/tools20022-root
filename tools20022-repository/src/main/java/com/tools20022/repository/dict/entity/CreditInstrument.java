package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.PaymentMethodCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Specifies the instrument to be used for the credit of a payment.
 */
public class CreditInstrument extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Payment RelatedPayment;
	private PaymentMethodCode Method;
	private Max35Text CreditInstrumentIdentification;
	private CurrencyAndAmount NetAmount;
	private ISODateTime Deadline;

	public Payment getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(Payment RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}

	public PaymentMethodCode getMethod() {
		return Method;
	}

	public void setMethod(PaymentMethodCode Method) {
		this.Method = Method;
	}

	public Max35Text getCreditInstrumentIdentification() {
		return CreditInstrumentIdentification;
	}

	public void setCreditInstrumentIdentification(
			Max35Text CreditInstrumentIdentification) {
		this.CreditInstrumentIdentification = CreditInstrumentIdentification;
	}

	public CurrencyAndAmount getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(CurrencyAndAmount NetAmount) {
		this.NetAmount = NetAmount;
	}

	public ISODateTime getDeadline() {
		return Deadline;
	}

	public void setDeadline(ISODateTime Deadline) {
		this.Deadline = Deadline;
	}
}