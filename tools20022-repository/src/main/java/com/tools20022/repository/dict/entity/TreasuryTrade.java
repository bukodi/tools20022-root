package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.TreasuryTradeSettlementStatus;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.TreasurySettlementPartyRole;
import com.tools20022.repository.dict.entity.TreasuryTradePartyRole;

/**
 * Specifies trades linked to treasury operations such as the exchange of
 * currencies, the lending of cash amounts and the related derivatives trades
 * (options and non deliverable trades).
 */
public class TreasuryTrade extends Trade {

	private TreasuryTradeSettlementStatus TreasuryTradeSettlementStatus;
	private InformationPartyRole InformationPartyRole;
	private TreasurySettlementPartyRole TreasurySettlementPartyRole;
	private TreasuryTradePartyRole PartyRole;

	public TreasuryTradeSettlementStatus getTreasuryTradeSettlementStatus() {
		return TreasuryTradeSettlementStatus;
	}

	public void setTreasuryTradeSettlementStatus(
			TreasuryTradeSettlementStatus TreasuryTradeSettlementStatus) {
		this.TreasuryTradeSettlementStatus = TreasuryTradeSettlementStatus;
	}

	public InformationPartyRole getInformationPartyRole() {
		return InformationPartyRole;
	}

	public void setInformationPartyRole(
			InformationPartyRole InformationPartyRole) {
		this.InformationPartyRole = InformationPartyRole;
	}

	public TreasurySettlementPartyRole getTreasurySettlementPartyRole() {
		return TreasurySettlementPartyRole;
	}

	public void setTreasurySettlementPartyRole(
			TreasurySettlementPartyRole TreasurySettlementPartyRole) {
		this.TreasurySettlementPartyRole = TreasurySettlementPartyRole;
	}

	public TreasuryTradePartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(TreasuryTradePartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}
}