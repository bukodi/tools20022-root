package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.CalculationTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.RateAndAmount;
import com.tools20022.repository.dict.entity.VariableInterest;

/**
 * Characteristics related to the yield.
 */
public class YieldCalculation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesPricing RedemptionPrice;
	private PercentageRate Value;
	private CalculationTypeCode CalculationType;
	private ISODateTime ValueDate;
	private DateTimePeriod ValuePeriod;
	private ISODateTime YieldCalculationDate;
	private RateAndAmount YieldRange;
	private VariableInterest VariableInterest;

	public SecuritiesPricing getRedemptionPrice() {
		return RedemptionPrice;
	}

	public void setRedemptionPrice(SecuritiesPricing RedemptionPrice) {
		this.RedemptionPrice = RedemptionPrice;
	}

	public PercentageRate getValue() {
		return Value;
	}

	public void setValue(PercentageRate Value) {
		this.Value = Value;
	}

	public CalculationTypeCode getCalculationType() {
		return CalculationType;
	}

	public void setCalculationType(CalculationTypeCode CalculationType) {
		this.CalculationType = CalculationType;
	}

	public ISODateTime getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODateTime ValueDate) {
		this.ValueDate = ValueDate;
	}

	public DateTimePeriod getValuePeriod() {
		return ValuePeriod;
	}

	public void setValuePeriod(DateTimePeriod ValuePeriod) {
		this.ValuePeriod = ValuePeriod;
	}

	public ISODateTime getYieldCalculationDate() {
		return YieldCalculationDate;
	}

	public void setYieldCalculationDate(ISODateTime YieldCalculationDate) {
		this.YieldCalculationDate = YieldCalculationDate;
	}

	public RateAndAmount getYieldRange() {
		return YieldRange;
	}

	public void setYieldRange(RateAndAmount YieldRange) {
		this.YieldRange = YieldRange;
	}

	public VariableInterest getVariableInterest() {
		return VariableInterest;
	}

	public void setVariableInterest(VariableInterest VariableInterest) {
		this.VariableInterest = VariableInterest;
	}
}