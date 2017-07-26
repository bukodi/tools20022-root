package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DemandTypeCode;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.UndertakingDocument;

/**
 * Document signed by the beneficiary demanding payment under a demand guarantee
 * or standby letter of credit.
 */
public class Demand {

	private Undertaking Undertaking;
	private ISODateTime SubmissionDateTime;
	private CurrencyAndAmount DemandAmount;
	private DemandTypeCode Type;
	private CurrencyAndAmount TotalClaimAmount;
	private PaymentObligation Payment;
	private UndertakingDocument AssociatedDocument;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public ISODateTime getSubmissionDateTime() {
		return SubmissionDateTime;
	}

	public void setSubmissionDateTime(ISODateTime SubmissionDateTime) {
		this.SubmissionDateTime = SubmissionDateTime;
	}

	public CurrencyAndAmount getDemandAmount() {
		return DemandAmount;
	}

	public void setDemandAmount(CurrencyAndAmount DemandAmount) {
		this.DemandAmount = DemandAmount;
	}

	public DemandTypeCode getType() {
		return Type;
	}

	public void setType(DemandTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getTotalClaimAmount() {
		return TotalClaimAmount;
	}

	public void setTotalClaimAmount(CurrencyAndAmount TotalClaimAmount) {
		this.TotalClaimAmount = TotalClaimAmount;
	}

	public PaymentObligation getPayment() {
		return Payment;
	}

	public void setPayment(PaymentObligation Payment) {
		this.Payment = Payment;
	}

	public UndertakingDocument getAssociatedDocument() {
		return AssociatedDocument;
	}

	public void setAssociatedDocument(UndertakingDocument AssociatedDocument) {
		this.AssociatedDocument = AssociatedDocument;
	}
}