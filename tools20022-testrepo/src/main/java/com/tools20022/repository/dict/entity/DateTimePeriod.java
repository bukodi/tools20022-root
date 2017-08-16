package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Time span defined by a start date and time, and an end date and time.
 */
public class DateTimePeriod extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime FromDateTime;
	private ISODateTime ToDateTime;
	private Number NumberOfDays;

	public ISODateTime getFromDateTime() {
		return FromDateTime;
	}

	public void setFromDateTime(ISODateTime FromDateTime) {
		this.FromDateTime = FromDateTime;
	}

	public ISODateTime getToDateTime() {
		return ToDateTime;
	}

	public void setToDateTime(ISODateTime ToDateTime) {
		this.ToDateTime = ToDateTime;
	}

	public Number getNumberOfDays() {
		return NumberOfDays;
	}

	public void setNumberOfDays(Number NumberOfDays) {
		this.NumberOfDays = NumberOfDays;
	}
}