package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.AnalyticsValue;
import com.tools20022.repository.dict.codeset.CalculationTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Characteristics related to the analytics.
 */
public class AnalyticsCalculation {

	private SecuritiesPricing SecuritiesPricing;
	private AnalyticsValue Value;
	private CalculationTypeCode CalculationType;
	private ISODateTime ValueDate;
	private DateTimePeriod ValuePeriod;
	private PercentageRate EstimatedInterestRate;
	private ISODateTime VariableRateValueDate;

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}

	public AnalyticsValue getValue() {
		return Value;
	}

	public void setValue(AnalyticsValue Value) {
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

	public PercentageRate getEstimatedInterestRate() {
		return EstimatedInterestRate;
	}

	public void setEstimatedInterestRate(PercentageRate EstimatedInterestRate) {
		this.EstimatedInterestRate = EstimatedInterestRate;
	}

	public ISODateTime getVariableRateValueDate() {
		return VariableRateValueDate;
	}

	public void setVariableRateValueDate(ISODateTime VariableRateValueDate) {
		this.VariableRateValueDate = VariableRateValueDate;
	}
}