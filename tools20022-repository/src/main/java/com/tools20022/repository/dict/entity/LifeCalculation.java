package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.VariableInterest;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.CalculationTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Estimate of the number of terms to maturity, taking the possibility of early
 * payments into account.
 */
public class LifeCalculation {

	private SecuritiesPricing SecuritiesPricing;
	private VariableInterest VariableInterest;
	private Number Years;
	private CalculationTypeCode CalculationType;
	private ISODateTime ValueDate;
	private DateTimePeriod ValuePeriod;

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}

	public VariableInterest getVariableInterest() {
		return VariableInterest;
	}

	public void setVariableInterest(VariableInterest VariableInterest) {
		this.VariableInterest = VariableInterest;
	}

	public Number getYears() {
		return Years;
	}

	public void setYears(Number Years) {
		this.Years = Years;
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
}