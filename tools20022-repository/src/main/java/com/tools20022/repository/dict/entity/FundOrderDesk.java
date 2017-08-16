package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundPartyRole;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.InvestmentAccount;

/**
 * Principal entity appointed by the fund to which orders should be submitted.
 */
public class FundOrderDesk extends InvestmentFundPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private YesNoIndicator MainFundOrderDeskIndicator;
	private InvestmentAccount MainFundOrderDeskAccount;

	public YesNoIndicator getMainFundOrderDeskIndicator() {
		return MainFundOrderDeskIndicator;
	}

	public void setMainFundOrderDeskIndicator(
			YesNoIndicator MainFundOrderDeskIndicator) {
		this.MainFundOrderDeskIndicator = MainFundOrderDeskIndicator;
	}

	public InvestmentAccount getMainFundOrderDeskAccount() {
		return MainFundOrderDeskAccount;
	}

	public void setMainFundOrderDeskAccount(
			InvestmentAccount MainFundOrderDeskAccount) {
		this.MainFundOrderDeskAccount = MainFundOrderDeskAccount;
	}
}