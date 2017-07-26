package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.repository.dict.msg.TradeAgreement2;
import com.tools20022.repository.dict.msg.TradePartyIdentification3;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate1;
import com.tools20022.repository.dict.msg.NonDeliverableForwardValuationConditions2;

/**
 * Scope The AmendNonDeliverableForwardOpening message is sent by a participant
 * to a central system or to a counterparty to notify the amendment of the
 * opening of a non deliverable trade previously confirmed by the sender. Usage
 * The message is sent from a participant to a central settlement system to
 * advise of the update of a previously sent notification and it contains a
 * "Related Reference" to link it to the previous notification.
 */
public class AmendNonDeliverableForwardOpeningV02 {

	private TradeAgreement2 TradeInformation;
	private TradePartyIdentification3 TradingSideIdentification;
	private TradePartyIdentification3 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private AgreedRate1 AgreedRate;
	private NonDeliverableForwardValuationConditions2 ValuationConditions;

	public TradeAgreement2 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement2 TradeInformation) {
		this.TradeInformation = TradeInformation;
	}

	public TradePartyIdentification3 getTradingSideIdentification() {
		return TradingSideIdentification;
	}

	public void setTradingSideIdentification(
			TradePartyIdentification3 TradingSideIdentification) {
		this.TradingSideIdentification = TradingSideIdentification;
	}

	public TradePartyIdentification3 getCounterpartySideIdentification() {
		return CounterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(
			TradePartyIdentification3 CounterpartySideIdentification) {
		this.CounterpartySideIdentification = CounterpartySideIdentification;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return TradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 TradeAmounts) {
		this.TradeAmounts = TradeAmounts;
	}

	public AgreedRate1 getAgreedRate() {
		return AgreedRate;
	}

	public void setAgreedRate(AgreedRate1 AgreedRate) {
		this.AgreedRate = AgreedRate;
	}

	public NonDeliverableForwardValuationConditions2 getValuationConditions() {
		return ValuationConditions;
	}

	public void setValuationConditions(
			NonDeliverableForwardValuationConditions2 ValuationConditions) {
		this.ValuationConditions = ValuationConditions;
	}
}