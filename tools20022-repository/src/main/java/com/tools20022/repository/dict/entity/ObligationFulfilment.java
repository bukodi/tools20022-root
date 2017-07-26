package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Obligation;

/**
 * Processes by which an obligation is extinguished fully or partially.
 */
public class ObligationFulfilment {

	private ISODate Date;
	private Obligation ObligationOffset;
	private Obligation ResultingObligation;

	public ISODate getDate() {
		return Date;
	}

	public void setDate(ISODate Date) {
		this.Date = Date;
	}

	public Obligation getObligationOffset() {
		return ObligationOffset;
	}

	public void setObligationOffset(Obligation ObligationOffset) {
		this.ObligationOffset = ObligationOffset;
	}

	public Obligation getResultingObligation() {
		return ResultingObligation;
	}

	public void setResultingObligation(Obligation ResultingObligation) {
		this.ResultingObligation = ResultingObligation;
	}
}