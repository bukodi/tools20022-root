package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeAgreement1;
import com.tools20022.repository.dict.msg.TradePartyIdentification3;
import com.tools20022.repository.dict.msg.AmountsAndValueDate1;
import com.tools20022.repository.dict.msg.ValuationData2;
import com.tools20022.repository.dict.msg.AgreedRate1;

/**
 * Scope The CreateNonDeliverableForwardValuation message is sent by a
 * participant to a central system or to a counterparty to notify the valuation
 * of a non deliverable trade. Usage The two trading parties will both send
 * similar notifications to the central settlement system and the central
 * settlement system will send notifications to both.
 */
public class CreateNonDeliverableForwardValuationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeAgreement1 TradeInformation;
	private TradePartyIdentification3 TradingSideIdentification;
	private TradePartyIdentification3 CounterpartySideIdentification;
	private AmountsAndValueDate1 TradeAmounts;
	private ValuationData2 ValuationInformation;
	private AgreedRate1 ValuationRate;

	public TradeAgreement1 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement1 TradeInformation) {
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

	public ValuationData2 getValuationInformation() {
		return ValuationInformation;
	}

	public void setValuationInformation(ValuationData2 ValuationInformation) {
		this.ValuationInformation = ValuationInformation;
	}

	public AgreedRate1 getValuationRate() {
		return ValuationRate;
	}

	public void setValuationRate(AgreedRate1 ValuationRate) {
		this.ValuationRate = ValuationRate;
	}
}