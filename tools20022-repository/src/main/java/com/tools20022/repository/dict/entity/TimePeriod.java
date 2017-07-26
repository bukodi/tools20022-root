package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SystemAvailability;
import com.tools20022.repository.dict.datatype.ISOTime;

/**
 * Particular time span specified between a start time and an end time. The time
 * period cannot exceed 24 hours.
 */
public class TimePeriod {

	private SystemAvailability SystemAvailability;
	private ISOTime FromTime;
	private ISOTime ToTime;

	public SystemAvailability getSystemAvailability() {
		return SystemAvailability;
	}

	public void setSystemAvailability(SystemAvailability SystemAvailability) {
		this.SystemAvailability = SystemAvailability;
	}

	public ISOTime getFromTime() {
		return FromTime;
	}

	public void setFromTime(ISOTime FromTime) {
		this.FromTime = FromTime;
	}

	public ISOTime getToTime() {
		return ToTime;
	}

	public void setToTime(ISOTime ToTime) {
		this.ToTime = ToTime;
	}
}