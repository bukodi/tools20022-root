package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CreditInstrument;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.BankingTransaction;

/**
 * Amount of money representing a value paid by an agent bank to a creditor.
 */
public class CashDelivery extends CreditInstrument
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount CashAmount;
	private BankingTransaction RelatedBankingTransaction;

	public ActiveCurrencyAndAmount getCashAmount() {
		return CashAmount;
	}

	public void setCashAmount(ActiveCurrencyAndAmount CashAmount) {
		this.CashAmount = CashAmount;
	}

	public BankingTransaction getRelatedBankingTransaction() {
		return RelatedBankingTransaction;
	}

	public void setRelatedBankingTransaction(
			BankingTransaction RelatedBankingTransaction) {
		this.RelatedBankingTransaction = RelatedBankingTransaction;
	}
}