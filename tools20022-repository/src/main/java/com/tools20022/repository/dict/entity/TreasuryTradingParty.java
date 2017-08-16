package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TreasuryTradePartyRole;
import com.tools20022.repository.dict.entity.InvestmentFund;

/**
 * Party that negotiates and executes treasury transactions on its behalf or on
 * behalf of another party.
 */
public class TreasuryTradingParty extends TreasuryTradePartyRole
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