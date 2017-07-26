package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.IndividualPayment;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max15NumericText;
import com.tools20022.repository.dict.entity.BankingTransaction;

/**
 * Amount of money representing a value paid by a debtor to an agent bank.
 */
public class CashDeposit extends IndividualPayment {

	private CurrencyAndAmount NoteDenomination;
	private Max15NumericText NumberOfNotes;
	private CurrencyAndAmount DepositAmount;
	private BankingTransaction RelatedBankingTransaction;

	public CurrencyAndAmount getNoteDenomination() {
		return NoteDenomination;
	}

	public void setNoteDenomination(CurrencyAndAmount NoteDenomination) {
		this.NoteDenomination = NoteDenomination;
	}

	public Max15NumericText getNumberOfNotes() {
		return NumberOfNotes;
	}

	public void setNumberOfNotes(Max15NumericText NumberOfNotes) {
		this.NumberOfNotes = NumberOfNotes;
	}

	public CurrencyAndAmount getDepositAmount() {
		return DepositAmount;
	}

	public void setDepositAmount(CurrencyAndAmount DepositAmount) {
		this.DepositAmount = DepositAmount;
	}

	public BankingTransaction getRelatedBankingTransaction() {
		return RelatedBankingTransaction;
	}

	public void setRelatedBankingTransaction(
			BankingTransaction RelatedBankingTransaction) {
		this.RelatedBankingTransaction = RelatedBankingTransaction;
	}
}