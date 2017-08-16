package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Relates a percentage to a period of time.
 */
public class PercentageAndPeriod extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DateTimePeriod Period;
	private PercentageRate Percentage;

	public DateTimePeriod getPeriod() {
		return Period;
	}

	public void setPeriod(DateTimePeriod Period) {
		this.Period = Period;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}
}