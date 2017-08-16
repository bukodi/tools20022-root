package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.InvestmentFund;

/**
 * Group of investment funds under the same fund management company.
 */
public class InvestmentFundFamily extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max350Text FundFamilyName;
	private InvestmentFund InvestmentFund;

	public Max350Text getFundFamilyName() {
		return FundFamilyName;
	}

	public void setFundFamilyName(Max350Text FundFamilyName) {
		this.FundFamilyName = FundFamilyName;
	}

	public InvestmentFund getInvestmentFund() {
		return InvestmentFund;
	}

	public void setInvestmentFund(InvestmentFund InvestmentFund) {
		this.InvestmentFund = InvestmentFund;
	}
}