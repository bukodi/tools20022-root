package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.InvestmentFund;

/**
 * Specifies roles played by a party that are linked to the handling of
 * investment funds but not related to a specific process.
 */
public class InvestmentFundPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Account Account;
	private InvestmentFund InvestmentFund;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public InvestmentFund getInvestmentFund() {
		return InvestmentFund;
	}

	public void setInvestmentFund(InvestmentFund InvestmentFund) {
		this.InvestmentFund = InvestmentFund;
	}
}