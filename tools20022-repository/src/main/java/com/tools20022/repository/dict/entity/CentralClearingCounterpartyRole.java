package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.entity.ClearingSystem;

/**
 * Infrastructure that may be a component of a clearing house and which
 * facilitates clearing and settlement for its members by standing between the
 * buyer and the seller. It may net transactions and it substitutes itself as
 * settlement counterparty for each position.
 */
public class CentralClearingCounterpartyRole extends SettlementPartyRole {

	private ClearingSystem System;

	public ClearingSystem getSystem() {
		return System;
	}

	public void setSystem(ClearingSystem System) {
		this.System = System;
	}
}