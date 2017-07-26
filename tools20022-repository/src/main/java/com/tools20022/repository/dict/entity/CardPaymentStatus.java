package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.RejectReasonCode;
import com.tools20022.repository.dict.codeset.FailureReasonCode;
import com.tools20022.repository.dict.entity.CardPayment;

/**
 * Status of a payment by card.
 */
public class CardPaymentStatus extends Status {

	private RejectReasonCode RejectionReason;
	private FailureReasonCode FailureReason;
	private CardPayment CardPayment;

	public RejectReasonCode getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectReasonCode RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public FailureReasonCode getFailureReason() {
		return FailureReason;
	}

	public void setFailureReason(FailureReasonCode FailureReason) {
		this.FailureReason = FailureReason;
	}

	public CardPayment getCardPayment() {
		return CardPayment;
	}

	public void setCardPayment(CardPayment CardPayment) {
		this.CardPayment = CardPayment;
	}
}