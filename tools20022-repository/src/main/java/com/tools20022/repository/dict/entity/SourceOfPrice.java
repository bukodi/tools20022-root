package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.TradingMarket;
import com.tools20022.repository.dict.codeset.PriceSourceCode;

/**
 * Place from which the price was obtained.
 */
public class SourceOfPrice extends InformationPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradingMarket MarketIdentification;
	private PriceSourceCode Type;

	public TradingMarket getMarketIdentification() {
		return MarketIdentification;
	}

	public void setMarketIdentification(TradingMarket MarketIdentification) {
		this.MarketIdentification = MarketIdentification;
	}

	public PriceSourceCode getType() {
		return Type;
	}

	public void setType(PriceSourceCode Type) {
		this.Type = Type;
	}
}