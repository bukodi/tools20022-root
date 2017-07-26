package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.dict.entity.TradingMarket;

/**
 * Place where settlement of securities occurs.
 */
public class PlaceOfSettlement extends SecuritiesSettlementPartyRole {

	private TradingMarket SettlementMarket;

	public TradingMarket getSettlementMarket() {
		return SettlementMarket;
	}

	public void setSettlementMarket(TradingMarket SettlementMarket) {
		this.SettlementMarket = SettlementMarket;
	}
}