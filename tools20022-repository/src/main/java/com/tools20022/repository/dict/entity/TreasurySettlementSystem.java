package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.TreasurySettlementSystemRole;

/**
 * Centralised system in which a central party settles treasury trades between
 * members.
 */
public class TreasurySettlementSystem extends System {

	private TreasurySettlementSystemRole SystemRole;

	public TreasurySettlementSystemRole getSystemRole() {
		return SystemRole;
	}

	public void setSystemRole(TreasurySettlementSystemRole SystemRole) {
		this.SystemRole = SystemRole;
	}
}