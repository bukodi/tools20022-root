package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;

/**
 * Specifies the system used in a settlement process.
 */
public class SecuritiesSettlementSystem extends System {

	private SecuritiesSettlementPartyRole SettlementParty;

	public SecuritiesSettlementPartyRole getSettlementParty() {
		return SettlementParty;
	}

	public void setSettlementParty(SecuritiesSettlementPartyRole SettlementParty) {
		this.SettlementParty = SettlementParty;
	}
}