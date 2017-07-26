package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.TimeUnitCode;
import com.tools20022.repository.dict.entity.Future;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Timing characteristics of the maturity of the future.
 */
public class FutureRule {

	private TimeUnitCode TimeType;
	private Future RelatedFutureInstrument;
	private Number MaximumTimeToMaturity;
	private Number MinimumTimeToMaturity;
	private PercentageRate BaseInterestRate;

	public TimeUnitCode getTimeType() {
		return TimeType;
	}

	public void setTimeType(TimeUnitCode TimeType) {
		this.TimeType = TimeType;
	}

	public Future getRelatedFutureInstrument() {
		return RelatedFutureInstrument;
	}

	public void setRelatedFutureInstrument(Future RelatedFutureInstrument) {
		this.RelatedFutureInstrument = RelatedFutureInstrument;
	}

	public Number getMaximumTimeToMaturity() {
		return MaximumTimeToMaturity;
	}

	public void setMaximumTimeToMaturity(Number MaximumTimeToMaturity) {
		this.MaximumTimeToMaturity = MaximumTimeToMaturity;
	}

	public Number getMinimumTimeToMaturity() {
		return MinimumTimeToMaturity;
	}

	public void setMinimumTimeToMaturity(Number MinimumTimeToMaturity) {
		this.MinimumTimeToMaturity = MinimumTimeToMaturity;
	}

	public PercentageRate getBaseInterestRate() {
		return BaseInterestRate;
	}

	public void setBaseInterestRate(PercentageRate BaseInterestRate) {
		this.BaseInterestRate = BaseInterestRate;
	}
}