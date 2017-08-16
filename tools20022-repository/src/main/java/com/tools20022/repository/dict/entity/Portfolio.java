package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.PortfolioValuation;
import com.tools20022.repository.dict.entity.PortfolioTransfer;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.PortfolioBenchmark;
import com.tools20022.repository.dict.entity.InvestmentPlan;
import com.tools20022.repository.dict.entity.InvestmentAccount;

/**
 * Wrapper for a specific product or a specific sub-product owned by a set of
 * beneficial owners.
 */
public class Portfolio extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PortfolioValuation Valuation;
	private PortfolioTransfer Transfer;
	private Asset AssetDescription;
	private Max350Text Name;
	private Max35Text Identification;
	private PortfolioStrategy Strategy;
	private PortfolioBenchmark Benchmark;
	private InvestmentPlan InvestmentPlan;
	private InvestmentAccount Account;

	public PortfolioValuation getValuation() {
		return Valuation;
	}

	public void setValuation(PortfolioValuation Valuation) {
		this.Valuation = Valuation;
	}

	public PortfolioTransfer getTransfer() {
		return Transfer;
	}

	public void setTransfer(PortfolioTransfer Transfer) {
		this.Transfer = Transfer;
	}

	public Asset getAssetDescription() {
		return AssetDescription;
	}

	public void setAssetDescription(Asset AssetDescription) {
		this.AssetDescription = AssetDescription;
	}

	public Max350Text getName() {
		return Name;
	}

	public void setName(Max350Text Name) {
		this.Name = Name;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public PortfolioStrategy getStrategy() {
		return Strategy;
	}

	public void setStrategy(PortfolioStrategy Strategy) {
		this.Strategy = Strategy;
	}

	public PortfolioBenchmark getBenchmark() {
		return Benchmark;
	}

	public void setBenchmark(PortfolioBenchmark Benchmark) {
		this.Benchmark = Benchmark;
	}

	public InvestmentPlan getInvestmentPlan() {
		return InvestmentPlan;
	}

	public void setInvestmentPlan(InvestmentPlan InvestmentPlan) {
		this.InvestmentPlan = InvestmentPlan;
	}

	public InvestmentAccount getAccount() {
		return Account;
	}

	public void setAccount(InvestmentAccount Account) {
		this.Account = Account;
	}
}