package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Relates an amount to a period of time.
 */
public class AmountAndPeriod extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DateTimePeriod Period;
	private CurrencyAndAmount Amount;

	public DateTimePeriod getPeriod() {
		return Period;
	}

	public void setPeriod(DateTimePeriod Period) {
		this.Period = Period;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}
}