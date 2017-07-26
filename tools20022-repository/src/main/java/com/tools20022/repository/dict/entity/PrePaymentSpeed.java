package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.PrePaymentSpeedCode;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Specifies the type and rate of prepayment speed of the fixed income
 * instrument.
 */
public class PrePaymentSpeed {

	private PrePaymentSpeedCode Type;
	private PercentageRate Rate;

	public PrePaymentSpeedCode getType() {
		return Type;
	}

	public void setType(PrePaymentSpeedCode Type) {
		this.Type = Type;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}
}