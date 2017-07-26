package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.dict.entity.DeliveringSettlementParty;

/**
 * Party that is responsible for delivering securities as part of a chain of
 * settlement parties or as party that sells them.
 */
public class DeliveringSettlementParty extends SecuritiesSettlementPartyRole {

	private DeliveringSettlementParty DeliveringSettlementParty;
	private DeliveringSettlementParty NextParty;

	public DeliveringSettlementParty getDeliveringSettlementParty() {
		return DeliveringSettlementParty;
	}

	public void setDeliveringSettlementParty(
			DeliveringSettlementParty DeliveringSettlementParty) {
		this.DeliveringSettlementParty = DeliveringSettlementParty;
	}

	public DeliveringSettlementParty getNextParty() {
		return NextParty;
	}

	public void setNextParty(DeliveringSettlementParty NextParty) {
		this.NextParty = NextParty;
	}
}