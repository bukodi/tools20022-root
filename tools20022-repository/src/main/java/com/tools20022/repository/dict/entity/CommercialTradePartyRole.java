package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.CommercialTrade;

/**
 * Role played by a party in the context of a trade.
 */
public class CommercialTradePartyRole extends TradePartyRole {

	private CommercialTrade CommercialTrade;

	public CommercialTrade getCommercialTrade() {
		return CommercialTrade;
	}

	public void setCommercialTrade(CommercialTrade CommercialTrade) {
		this.CommercialTrade = CommercialTrade;
	}
}