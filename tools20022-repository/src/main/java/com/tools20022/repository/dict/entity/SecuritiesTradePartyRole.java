package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.entity.SecuritiesTrade;

/**
 * Role played by a party in the context of a securities trade.
 */
public class SecuritiesTradePartyRole extends TradePartyRole {

	private SecuritiesTrade SecuritiesTrade;

	public SecuritiesTrade getSecuritiesTrade() {
		return SecuritiesTrade;
	}

	public void setSecuritiesTrade(SecuritiesTrade SecuritiesTrade) {
		this.SecuritiesTrade = SecuritiesTrade;
	}
}