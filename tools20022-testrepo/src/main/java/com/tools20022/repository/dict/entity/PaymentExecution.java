package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 */
public class PaymentExecution {

	private ISODateTime CreationDate;

	public ISODateTime getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(ISODateTime CreationDate) {
		this.CreationDate = CreationDate;
	}
}