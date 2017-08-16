package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TreasurySettlementPartyRole;
import com.tools20022.repository.dict.entity.TreasurySettlementSystem;

/**
 * System involved in the settlement chain of one leg of a treasury trade.
 */
public class TreasurySettlementSystemRole extends TreasurySettlementPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private TreasurySettlementSystem System;

	public TreasurySettlementSystem getSystem() {
		return System;
	}

	public void setSystem(TreasurySettlementSystem System) {
		this.System = System;
	}
}