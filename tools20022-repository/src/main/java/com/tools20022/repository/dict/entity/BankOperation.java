package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CashAccountService;
import com.tools20022.repository.dict.entity.OperationThreshold;
import com.tools20022.repository.dict.entity.BankTransaction;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Operation on a bank account. It may be limited in time, amount or type of
 * operation.
 */
public class BankOperation extends CashAccountService
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private OperationThreshold OperationThreshold;
	private BankTransaction OperationType;
	private DateTimePeriod ApplicablePeriod;

	public OperationThreshold getOperationThreshold() {
		return OperationThreshold;
	}

	public void setOperationThreshold(OperationThreshold OperationThreshold) {
		this.OperationThreshold = OperationThreshold;
	}

	public BankTransaction getOperationType() {
		return OperationType;
	}

	public void setOperationType(BankTransaction OperationType) {
		this.OperationType = OperationType;
	}

	public DateTimePeriod getApplicablePeriod() {
		return ApplicablePeriod;
	}

	public void setApplicablePeriod(DateTimePeriod ApplicablePeriod) {
		this.ApplicablePeriod = ApplicablePeriod;
	}
}