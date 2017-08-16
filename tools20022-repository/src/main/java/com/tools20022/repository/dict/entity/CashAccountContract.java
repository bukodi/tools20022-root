package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.CashAccountMandate;

/**
 * Account contract established between the organisation or the group to which
 * the organisation belongs, and the account servicer.
 */
public class CashAccountContract extends AccountContract
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashAccount CashAccount;
	private CashAccount TransferCashAccount;
	private CashAccountService Services;
	private PaymentObligation BalanceTransfer;
	private CashAccountMandate CashAccountMandate;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public CashAccount getTransferCashAccount() {
		return TransferCashAccount;
	}

	public void setTransferCashAccount(CashAccount TransferCashAccount) {
		this.TransferCashAccount = TransferCashAccount;
	}

	public CashAccountService getServices() {
		return Services;
	}

	public void setServices(CashAccountService Services) {
		this.Services = Services;
	}

	public PaymentObligation getBalanceTransfer() {
		return BalanceTransfer;
	}

	public void setBalanceTransfer(PaymentObligation BalanceTransfer) {
		this.BalanceTransfer = BalanceTransfer;
	}

	public CashAccountMandate getCashAccountMandate() {
		return CashAccountMandate;
	}

	public void setCashAccountMandate(CashAccountMandate CashAccountMandate) {
		this.CashAccountMandate = CashAccountMandate;
	}
}