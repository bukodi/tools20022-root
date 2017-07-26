package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.SystemAvailability;
import com.tools20022.repository.dict.codeset.SystemClosureReasonCode;

/**
 * Information about inactivity of a system.
 */
public class SystemClosureInformation {

	private DateTimePeriod Period;
	private SystemAvailability SystemAvailability;
	private SystemClosureReasonCode ClosureReason;

	public DateTimePeriod getPeriod() {
		return Period;
	}

	public void setPeriod(DateTimePeriod Period) {
		this.Period = Period;
	}

	public SystemAvailability getSystemAvailability() {
		return SystemAvailability;
	}

	public void setSystemAvailability(SystemAvailability SystemAvailability) {
		this.SystemAvailability = SystemAvailability;
	}

	public SystemClosureReasonCode getClosureReason() {
		return ClosureReason;
	}

	public void setClosureReason(SystemClosureReasonCode ClosureReason) {
		this.ClosureReason = ClosureReason;
	}
}