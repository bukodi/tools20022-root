package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.SystemEventTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.System;

/**
 * Detailed information about an event occurring on a system, whether planned,
 * for example, cut-off time for a specific type of eligible transfer, or
 * unplanned, for example, an unsolicited failure, as stipulated in the
 * specifications of the system.
 */
public class SystemEventInformation {

	private SystemEventTypeCode Type;
	private ISODateTime Time;
	private System System;

	public SystemEventTypeCode getType() {
		return Type;
	}

	public void setType(SystemEventTypeCode Type) {
		this.Type = Type;
	}

	public ISODateTime getTime() {
		return Time;
	}

	public void setTime(ISODateTime Time) {
		this.Time = Time;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}
}