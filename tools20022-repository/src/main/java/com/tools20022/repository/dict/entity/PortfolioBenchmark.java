package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Index;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.Max350Text;

/**
 * Security or other price against which the performance of the portfolio is
 * evaluated.
 */
public class PortfolioBenchmark {

	private Index Index;
	private Portfolio Portfolio;
	private PercentageRate BenchmarkWeight;
	private PercentageRate MaximumDeviation;
	private PercentageRate MinimumDeviation;
	private DateTimePeriod EffectivePeriod;
	private Max350Text Description;

	public Index getIndex() {
		return Index;
	}

	public void setIndex(Index Index) {
		this.Index = Index;
	}

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public PercentageRate getBenchmarkWeight() {
		return BenchmarkWeight;
	}

	public void setBenchmarkWeight(PercentageRate BenchmarkWeight) {
		this.BenchmarkWeight = BenchmarkWeight;
	}

	public PercentageRate getMaximumDeviation() {
		return MaximumDeviation;
	}

	public void setMaximumDeviation(PercentageRate MaximumDeviation) {
		this.MaximumDeviation = MaximumDeviation;
	}

	public PercentageRate getMinimumDeviation() {
		return MinimumDeviation;
	}

	public void setMinimumDeviation(PercentageRate MinimumDeviation) {
		this.MinimumDeviation = MinimumDeviation;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}
}