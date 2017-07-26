package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ForeignExchangeTrade;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.FixingCondition;

/**
 * Foreign exchange contract where one of the exchanged amounts is specified in
 * a non-deliverable currency.
 */
public class NonDeliverableTrade extends ForeignExchangeTrade {

	private CurrencyCode SettlementCurrency;
	private FixingCondition FixingConditions;
	private ForeignExchangeTrade OpeningLeg;
	private ForeignExchangeTrade ClosingLeg;

	public CurrencyCode getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}

	public FixingCondition getFixingConditions() {
		return FixingConditions;
	}

	public void setFixingConditions(FixingCondition FixingConditions) {
		this.FixingConditions = FixingConditions;
	}

	public ForeignExchangeTrade getOpeningLeg() {
		return OpeningLeg;
	}

	public void setOpeningLeg(ForeignExchangeTrade OpeningLeg) {
		this.OpeningLeg = OpeningLeg;
	}

	public ForeignExchangeTrade getClosingLeg() {
		return ClosingLeg;
	}

	public void setClosingLeg(ForeignExchangeTrade ClosingLeg) {
		this.ClosingLeg = ClosingLeg;
	}
}