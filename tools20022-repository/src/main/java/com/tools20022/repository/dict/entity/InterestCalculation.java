package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.InterestComputationMethodCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.codeset.InterestRateTypeCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.CalculationMethodCode;
import com.tools20022.repository.dict.entity.VariableInterest;
import com.tools20022.repository.dict.codeset.InterestCode;
import com.tools20022.repository.dict.entity.AmountRange;
import com.tools20022.repository.dict.codeset.InterestMethodCode;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.Debt;
import com.tools20022.repository.dict.entity.Spread;
import com.tools20022.repository.dict.entity.InterestManagement;

/**
 * Set of parameters used to calculate an interest amount.
 */
public class InterestCalculation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InterestComputationMethodCode DayCountBasis;
	private PercentageRate Rate;
	private Interest Interest;
	private InterestRateTypeCode RateType;
	private DateTimePeriod InterestPeriod;
	private PercentageRate RelatedIndex;
	private ISODateTime InterestAccrualDate;
	private CalculationMethodCode CalculationMethod;
	private VariableInterest VariableInterest;
	private InterestCode InterestType;
	private AmountRange RateValidityRange;
	private InterestMethodCode InterestMethod;
	private FrequencyCode CalculationFrequency;
	private ISODate CalculationDate;
	private Charges Charges;
	private Debt DebtInstrument;
	private Spread Spread;
	private FrequencyCode PaymentFrequency;
	private InterestManagement RelatedInterestManagement;

	public InterestComputationMethodCode getDayCountBasis() {
		return DayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethodCode DayCountBasis) {
		this.DayCountBasis = DayCountBasis;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public InterestRateTypeCode getRateType() {
		return RateType;
	}

	public void setRateType(InterestRateTypeCode RateType) {
		this.RateType = RateType;
	}

	public DateTimePeriod getInterestPeriod() {
		return InterestPeriod;
	}

	public void setInterestPeriod(DateTimePeriod InterestPeriod) {
		this.InterestPeriod = InterestPeriod;
	}

	public PercentageRate getRelatedIndex() {
		return RelatedIndex;
	}

	public void setRelatedIndex(PercentageRate RelatedIndex) {
		this.RelatedIndex = RelatedIndex;
	}

	public ISODateTime getInterestAccrualDate() {
		return InterestAccrualDate;
	}

	public void setInterestAccrualDate(ISODateTime InterestAccrualDate) {
		this.InterestAccrualDate = InterestAccrualDate;
	}

	public CalculationMethodCode getCalculationMethod() {
		return CalculationMethod;
	}

	public void setCalculationMethod(CalculationMethodCode CalculationMethod) {
		this.CalculationMethod = CalculationMethod;
	}

	public VariableInterest getVariableInterest() {
		return VariableInterest;
	}

	public void setVariableInterest(VariableInterest VariableInterest) {
		this.VariableInterest = VariableInterest;
	}

	public InterestCode getInterestType() {
		return InterestType;
	}

	public void setInterestType(InterestCode InterestType) {
		this.InterestType = InterestType;
	}

	public AmountRange getRateValidityRange() {
		return RateValidityRange;
	}

	public void setRateValidityRange(AmountRange RateValidityRange) {
		this.RateValidityRange = RateValidityRange;
	}

	public InterestMethodCode getInterestMethod() {
		return InterestMethod;
	}

	public void setInterestMethod(InterestMethodCode InterestMethod) {
		this.InterestMethod = InterestMethod;
	}

	public FrequencyCode getCalculationFrequency() {
		return CalculationFrequency;
	}

	public void setCalculationFrequency(FrequencyCode CalculationFrequency) {
		this.CalculationFrequency = CalculationFrequency;
	}

	public ISODate getCalculationDate() {
		return CalculationDate;
	}

	public void setCalculationDate(ISODate CalculationDate) {
		this.CalculationDate = CalculationDate;
	}

	public Charges getCharges() {
		return Charges;
	}

	public void setCharges(Charges Charges) {
		this.Charges = Charges;
	}

	public Debt getDebtInstrument() {
		return DebtInstrument;
	}

	public void setDebtInstrument(Debt DebtInstrument) {
		this.DebtInstrument = DebtInstrument;
	}

	public Spread getSpread() {
		return Spread;
	}

	public void setSpread(Spread Spread) {
		this.Spread = Spread;
	}

	public FrequencyCode getPaymentFrequency() {
		return PaymentFrequency;
	}

	public void setPaymentFrequency(FrequencyCode PaymentFrequency) {
		this.PaymentFrequency = PaymentFrequency;
	}

	public InterestManagement getRelatedInterestManagement() {
		return RelatedInterestManagement;
	}

	public void setRelatedInterestManagement(
			InterestManagement RelatedInterestManagement) {
		this.RelatedInterestManagement = RelatedInterestManagement;
	}
}