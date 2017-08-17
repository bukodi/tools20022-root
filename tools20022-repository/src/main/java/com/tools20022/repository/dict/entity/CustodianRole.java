package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.entity.InvestmentFund;

/**
 * The party that safekeeps and administers assets on behalf of the owner.
 */
public class CustodianRole extends SecuritiesPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InvestmentFund InvestmentFund;

	public InvestmentFund getInvestmentFund() {
		return InvestmentFund;
	}

	public void setInvestmentFund(InvestmentFund InvestmentFund) {
		this.InvestmentFund = InvestmentFund;
	}
}