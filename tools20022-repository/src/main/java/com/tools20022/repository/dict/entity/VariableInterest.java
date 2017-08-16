package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.entity.Index;
import com.tools20022.repository.dict.entity.YieldCalculation;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.LifeCalculation;
import com.tools20022.repository.dict.entity.DurationCalculation;

/**
 * Specifies the estimated interest rate and the parameters used for determining
 * its value.
 */
public class VariableInterest extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private FrequencyCode VariableRateChangeFrequency;
	private ISODateTime FixingDate;
	private InterestCalculation InterestCalculation;
	private ISODateTime ReportingDate;
	private ISODateTime ResetDate;
	private Max16Text Arrears;
	private Index Index;
	private YieldCalculation YieldCalculation;
	private Security BenchmarkReference;
	private PercentageRate EstimatedInterestRate;
	private ISODateTime VariableRateValueDate;
	private LifeCalculation LifeCalculation;
	private DurationCalculation DurationCalculation;

	public FrequencyCode getVariableRateChangeFrequency() {
		return VariableRateChangeFrequency;
	}

	public void setVariableRateChangeFrequency(
			FrequencyCode VariableRateChangeFrequency) {
		this.VariableRateChangeFrequency = VariableRateChangeFrequency;
	}

	public ISODateTime getFixingDate() {
		return FixingDate;
	}

	public void setFixingDate(ISODateTime FixingDate) {
		this.FixingDate = FixingDate;
	}

	public InterestCalculation getInterestCalculation() {
		return InterestCalculation;
	}

	public void setInterestCalculation(InterestCalculation InterestCalculation) {
		this.InterestCalculation = InterestCalculation;
	}

	public ISODateTime getReportingDate() {
		return ReportingDate;
	}

	public void setReportingDate(ISODateTime ReportingDate) {
		this.ReportingDate = ReportingDate;
	}

	public ISODateTime getResetDate() {
		return ResetDate;
	}

	public void setResetDate(ISODateTime ResetDate) {
		this.ResetDate = ResetDate;
	}

	public Max16Text getArrears() {
		return Arrears;
	}

	public void setArrears(Max16Text Arrears) {
		this.Arrears = Arrears;
	}

	public Index getIndex() {
		return Index;
	}

	public void setIndex(Index Index) {
		this.Index = Index;
	}

	public YieldCalculation getYieldCalculation() {
		return YieldCalculation;
	}

	public void setYieldCalculation(YieldCalculation YieldCalculation) {
		this.YieldCalculation = YieldCalculation;
	}

	public Security getBenchmarkReference() {
		return BenchmarkReference;
	}

	public void setBenchmarkReference(Security BenchmarkReference) {
		this.BenchmarkReference = BenchmarkReference;
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

	public LifeCalculation getLifeCalculation() {
		return LifeCalculation;
	}

	public void setLifeCalculation(LifeCalculation LifeCalculation) {
		this.LifeCalculation = LifeCalculation;
	}

	public DurationCalculation getDurationCalculation() {
		return DurationCalculation;
	}

	public void setDurationCalculation(DurationCalculation DurationCalculation) {
		this.DurationCalculation = DurationCalculation;
	}
}