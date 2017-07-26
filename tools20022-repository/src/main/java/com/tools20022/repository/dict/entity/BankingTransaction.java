package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.FinancialTransaction;
import com.tools20022.repository.dict.entity.CashDelivery;
import com.tools20022.repository.dict.entity.CashDeposit;

/**
 * Transaction executed by the client of a financial institution from/to the
 * account serviced by the financial institution, such as mortgage payment.
 */
public class BankingTransaction {

	private PaymentObligation PaymentObligation;
	private FinancialTransaction FinancialTransaction;
	private CashDelivery CashDelivery;
	private CashDeposit CashDeposit;

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public FinancialTransaction getFinancialTransaction() {
		return FinancialTransaction;
	}

	public void setFinancialTransaction(
			FinancialTransaction FinancialTransaction) {
		this.FinancialTransaction = FinancialTransaction;
	}

	public CashDelivery getCashDelivery() {
		return CashDelivery;
	}

	public void setCashDelivery(CashDelivery CashDelivery) {
		this.CashDelivery = CashDelivery;
	}

	public CashDeposit getCashDeposit() {
		return CashDeposit;
	}

	public void setCashDeposit(CashDeposit CashDeposit) {
		this.CashDeposit = CashDeposit;
	}
}