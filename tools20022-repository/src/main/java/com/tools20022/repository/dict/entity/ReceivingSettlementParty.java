package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.dict.entity.ReceivingSettlementParty;

/**
 * Party that receives securities as part of a chain of settlement parties or as
 * ultimate party.
 */
public class ReceivingSettlementParty extends SecuritiesSettlementPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ReceivingSettlementParty ReceivingSettlementParty;
	private ReceivingSettlementParty NextParty;

	public ReceivingSettlementParty getReceivingSettlementParty() {
		return ReceivingSettlementParty;
	}

	public void setReceivingSettlementParty(
			ReceivingSettlementParty ReceivingSettlementParty) {
		this.ReceivingSettlementParty = ReceivingSettlementParty;
	}

	public ReceivingSettlementParty getNextParty() {
		return NextParty;
	}

	public void setNextParty(ReceivingSettlementParty NextParty) {
		this.NextParty = NextParty;
	}
}