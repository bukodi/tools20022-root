package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.dict.entity.CashClearingSystem;

/**
 * Identification of a specific system or set of rules and/or processes to be
 * applied at the settlement place.
 */
public class SettlementInstructionSystemRole
		extends
			CashSettlementInstructionPartyRole {

	private CashClearingSystem System;

	public CashClearingSystem getSystem() {
		return System;
	}

	public void setSystem(CashClearingSystem System) {
		this.System = System;
	}
}