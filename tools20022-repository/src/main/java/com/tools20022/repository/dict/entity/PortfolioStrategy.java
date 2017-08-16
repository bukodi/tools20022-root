package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.codeset.DistributionPolicyCode;
import com.tools20022.repository.dict.datatype.Max2000Text;
import com.tools20022.repository.dict.entity.PortfolioStrategyDefinition;

/**
 * Rough allocation of the portfolio.
 */
public class PortfolioStrategy extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Portfolio Portfolio;
	private YesNoIndicator InclusionIndicator;
	private CurrencyAndAmount MinimumInvestmentAmount;
	private PercentageRate MinimumInvestmentRate;
	private CurrencyAndAmount MaximumInvestmentAmount;
	private PercentageRate MaximumInvestmentRate;
	private DateTimePeriod EffectivePeriod;
	private DistributionPolicyCode DistributionPolicy;
	private Max2000Text Description;
	private PortfolioStrategyDefinition Definition;

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public YesNoIndicator getInclusionIndicator() {
		return InclusionIndicator;
	}

	public void setInclusionIndicator(YesNoIndicator InclusionIndicator) {
		this.InclusionIndicator = InclusionIndicator;
	}

	public CurrencyAndAmount getMinimumInvestmentAmount() {
		return MinimumInvestmentAmount;
	}

	public void setMinimumInvestmentAmount(
			CurrencyAndAmount MinimumInvestmentAmount) {
		this.MinimumInvestmentAmount = MinimumInvestmentAmount;
	}

	public PercentageRate getMinimumInvestmentRate() {
		return MinimumInvestmentRate;
	}

	public void setMinimumInvestmentRate(PercentageRate MinimumInvestmentRate) {
		this.MinimumInvestmentRate = MinimumInvestmentRate;
	}

	public CurrencyAndAmount getMaximumInvestmentAmount() {
		return MaximumInvestmentAmount;
	}

	public void setMaximumInvestmentAmount(
			CurrencyAndAmount MaximumInvestmentAmount) {
		this.MaximumInvestmentAmount = MaximumInvestmentAmount;
	}

	public PercentageRate getMaximumInvestmentRate() {
		return MaximumInvestmentRate;
	}

	public void setMaximumInvestmentRate(PercentageRate MaximumInvestmentRate) {
		this.MaximumInvestmentRate = MaximumInvestmentRate;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public DistributionPolicyCode getDistributionPolicy() {
		return DistributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicyCode DistributionPolicy) {
		this.DistributionPolicy = DistributionPolicy;
	}

	public Max2000Text getDescription() {
		return Description;
	}

	public void setDescription(Max2000Text Description) {
		this.Description = Description;
	}

	public PortfolioStrategyDefinition getDefinition() {
		return Definition;
	}

	public void setDefinition(PortfolioStrategyDefinition Definition) {
		this.Definition = Definition;
	}
}