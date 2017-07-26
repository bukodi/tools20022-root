package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CurrencyOption;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.BaseOneRate;

/**
 * Specifies the amount of a premium on a currency option together with its
 * calculation method.
 */
public class PremiumCalculation {

	private CurrencyOption Option;
	private PercentageRate PercentageOfCallAmount;
	private PercentageRate PercentageOfPutAmount;
	private BaseOneRate PointsOfCallAmount;
	private BaseOneRate PointsOfPutAmount;

	public CurrencyOption getOption() {
		return Option;
	}

	public void setOption(CurrencyOption Option) {
		this.Option = Option;
	}

	public PercentageRate getPercentageOfCallAmount() {
		return PercentageOfCallAmount;
	}

	public void setPercentageOfCallAmount(PercentageRate PercentageOfCallAmount) {
		this.PercentageOfCallAmount = PercentageOfCallAmount;
	}

	public PercentageRate getPercentageOfPutAmount() {
		return PercentageOfPutAmount;
	}

	public void setPercentageOfPutAmount(PercentageRate PercentageOfPutAmount) {
		this.PercentageOfPutAmount = PercentageOfPutAmount;
	}

	public BaseOneRate getPointsOfCallAmount() {
		return PointsOfCallAmount;
	}

	public void setPointsOfCallAmount(BaseOneRate PointsOfCallAmount) {
		this.PointsOfCallAmount = PointsOfCallAmount;
	}

	public BaseOneRate getPointsOfPutAmount() {
		return PointsOfPutAmount;
	}

	public void setPointsOfPutAmount(BaseOneRate PointsOfPutAmount) {
		this.PointsOfPutAmount = PointsOfPutAmount;
	}
}