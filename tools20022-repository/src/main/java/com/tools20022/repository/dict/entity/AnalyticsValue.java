package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.AnalyticsCalculation;

/**
 * Value given to a price analytic.
 */
public class AnalyticsValue extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount Amount;
	private PercentageRate Rate;
	private Number NumberOfYears;
	private AnalyticsCalculation AnalyticsCalculation;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public Number getNumberOfYears() {
		return NumberOfYears;
	}

	public void setNumberOfYears(Number NumberOfYears) {
		this.NumberOfYears = NumberOfYears;
	}

	public AnalyticsCalculation getAnalyticsCalculation() {
		return AnalyticsCalculation;
	}

	public void setAnalyticsCalculation(
			AnalyticsCalculation AnalyticsCalculation) {
		this.AnalyticsCalculation = AnalyticsCalculation;
	}
}