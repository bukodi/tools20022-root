package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.BankOperation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Threshold related to a bank account operation.
 */
public class OperationThreshold extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private BankOperation BankOperation;
	private CurrencyAndAmount MininumAmountPerTransaction;
	private CurrencyAndAmount MaximumAmount;

	public BankOperation getBankOperation() {
		return BankOperation;
	}

	public void setBankOperation(BankOperation BankOperation) {
		this.BankOperation = BankOperation;
	}

	public CurrencyAndAmount getMininumAmountPerTransaction() {
		return MininumAmountPerTransaction;
	}

	public void setMininumAmountPerTransaction(
			CurrencyAndAmount MininumAmountPerTransaction) {
		this.MininumAmountPerTransaction = MininumAmountPerTransaction;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return MaximumAmount;
	}

	public void setMaximumAmount(CurrencyAndAmount MaximumAmount) {
		this.MaximumAmount = MaximumAmount;
	}
}