package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.Payment;

/**
 * Role played by a party in the context of a payment.
 */
public class PaymentPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccount CashAccount;
	private Payment Payment;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}
}