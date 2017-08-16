package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.TradingMarket;

/**
 * Party that identifies the stock exchange.
 */
public class StockExchange extends TradePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradingMarket Market;

	public TradingMarket getMarket() {
		return Market;
	}

	public void setMarket(TradingMarket Market) {
		this.Market = Market;
	}
}