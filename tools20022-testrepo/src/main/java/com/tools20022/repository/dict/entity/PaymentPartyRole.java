package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Role played by a party in the context of a payment.
 */
public class PaymentPartyRole {

	private CashAccount CashAccount;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}
}