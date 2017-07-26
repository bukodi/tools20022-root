package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.TradingMarket;

/**
 * Party that identifies the stock exchange.
 */
public class StockExchange extends TradePartyRole {

	private TradingMarket Market;

	public TradingMarket getMarket() {
		return Market;
	}

	public void setMarket(TradingMarket Market) {
		this.Market = Market;
	}
}