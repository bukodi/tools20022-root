package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Provides statistical information on the number of movements and their value
 * for a particular account.
 */
public class AccountReportedMovement {

	private CurrencyAndAmount MonthlyPaymentValue;
	private CurrencyAndAmount MonthlyReceivedValue;
	private Max35Text MonthlyTransactionNumber;
	private CurrencyAndAmount AverageBalance;
	private CashAccount ReportedCashAccount;

	public CurrencyAndAmount getMonthlyPaymentValue() {
		return MonthlyPaymentValue;
	}

	public void setMonthlyPaymentValue(CurrencyAndAmount MonthlyPaymentValue) {
		this.MonthlyPaymentValue = MonthlyPaymentValue;
	}

	public CurrencyAndAmount getMonthlyReceivedValue() {
		return MonthlyReceivedValue;
	}

	public void setMonthlyReceivedValue(CurrencyAndAmount MonthlyReceivedValue) {
		this.MonthlyReceivedValue = MonthlyReceivedValue;
	}

	public Max35Text getMonthlyTransactionNumber() {
		return MonthlyTransactionNumber;
	}

	public void setMonthlyTransactionNumber(Max35Text MonthlyTransactionNumber) {
		this.MonthlyTransactionNumber = MonthlyTransactionNumber;
	}

	public CurrencyAndAmount getAverageBalance() {
		return AverageBalance;
	}

	public void setAverageBalance(CurrencyAndAmount AverageBalance) {
		this.AverageBalance = AverageBalance;
	}

	public CashAccount getReportedCashAccount() {
		return ReportedCashAccount;
	}

	public void setReportedCashAccount(CashAccount ReportedCashAccount) {
		this.ReportedCashAccount = ReportedCashAccount;
	}
}