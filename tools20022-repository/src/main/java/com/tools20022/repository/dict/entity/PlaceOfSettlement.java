package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.dict.entity.TradingMarket;

/**
 * Place where settlement of securities occurs.
 */
public class PlaceOfSettlement extends SecuritiesSettlementPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TradingMarket SettlementMarket;

	public TradingMarket getSettlementMarket() {
		return SettlementMarket;
	}

	public void setSettlementMarket(TradingMarket SettlementMarket) {
		this.SettlementMarket = SettlementMarket;
	}
}