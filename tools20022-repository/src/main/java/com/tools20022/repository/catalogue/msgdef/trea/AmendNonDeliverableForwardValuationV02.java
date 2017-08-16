package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeAgreement2;
import com.tools20022.repository.dict.msg.TradePartyIdentification3;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.AgreedRate1;
import com.tools20022.repository.dict.msg.ValuationData2;

/**
 * Scope The AmendNonDeliverableForwardValuation message is sent by a
 * participant to a central system or to a counterparty to notify the amendment
 * of the valuation of a non deliverable trade previously confirmed by the
 * sender. Usage The message is sent from a participant to a central settlement
 * system to advise of the update of a previously sent notification and it
 * contains a "Related Reference" to link it to the previous notification.
 */
public class AmendNonDeliverableForwardValuationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeAgreement2 TradeInformation;
	private TradePartyIdentification3 TradingSideIdentification;
	private TradePartyIdentification3 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private AgreedRate1 ValuationRate;
	private ValuationData2 ValuationInformation;

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

	public AgreedRate1 getValuationRate() {
		return ValuationRate;
	}

	public void setValuationRate(AgreedRate1 ValuationRate) {
		this.ValuationRate = ValuationRate;
	}

	public ValuationData2 getValuationInformation() {
		return ValuationInformation;
	}

	public void setValuationInformation(ValuationData2 ValuationInformation) {
		this.ValuationInformation = ValuationInformation;
	}
}