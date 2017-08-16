package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Role played by a party in the context of a trade.
 */
public class CommercialTradePartyRole extends TradePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CommercialTrade CommercialTrade;

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}