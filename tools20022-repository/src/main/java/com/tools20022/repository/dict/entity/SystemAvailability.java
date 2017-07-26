package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TimePeriod;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.SystemClosureInformation;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * information about the periods of activity and non-activity of a system.
 */
public class SystemAvailability {

	private TimePeriod AvailableSessionPeriod;
	private System System;
	private SystemClosureInformation ClosureInformation;
	private ISODate Date;
	private DateTimePeriod ClosurePeriod;

	public TimePeriod getAvailableSessionPeriod() {
		return AvailableSessionPeriod;
	}

	public void setAvailableSessionPeriod(TimePeriod AvailableSessionPeriod) {
		this.AvailableSessionPeriod = AvailableSessionPeriod;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public SystemClosureInformation getClosureInformation() {
		return ClosureInformation;
	}

	public void setClosureInformation(
			SystemClosureInformation ClosureInformation) {
		this.ClosureInformation = ClosureInformation;
	}

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}

	public DateTimePeriod getClosurePeriod() {
		return ClosurePeriod;
	}

	public void setClosurePeriod(DateTimePeriod ClosurePeriod) {
		this.ClosurePeriod = ClosurePeriod;
	}
}