package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Additional information on the definition of the strategy.
 */
public class PortfolioStrategyDefinition {

	private PortfolioStrategy Strategy;
	private Max350Text Name;
	private Max350Text Description;
	private DateTimePeriod EffectivePeriod;

	public PortfolioStrategy getStrategy() {
		return Strategy;
	}

	public void setStrategy(PortfolioStrategy Strategy) {
		this.Strategy = Strategy;
	}

	public Max350Text getName() {
		return Name;
	}

	public void setName(Max350Text Name) {
		this.Name = Name;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}
}