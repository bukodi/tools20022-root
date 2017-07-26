package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.PaymentObligation;

/**
 * Role played by a party in the context of a payment obligation.
 */
public class PaymentObligationPartyRole extends Role {

	private PaymentObligation PaymentObligation;

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}
}