package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.TreasuryTrade;

/**
 * Role played by a party in the context of a treasury trade.
 */
public class TreasuryTradePartyRole extends TradePartyRole {

	private TreasuryTrade TreasuryTrade;

	public TreasuryTrade getTreasuryTrade() {
		return TreasuryTrade;
	}

	public void setTreasuryTrade(TreasuryTrade TreasuryTrade) {
		this.TreasuryTrade = TreasuryTrade;
	}
}