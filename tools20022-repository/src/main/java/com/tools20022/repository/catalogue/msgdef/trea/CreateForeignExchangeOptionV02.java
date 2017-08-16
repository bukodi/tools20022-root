package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeAgreement1;
import com.tools20022.repository.dict.msg.TradePartyIdentification4;
import com.tools20022.repository.dict.msg.Option3;

/**
 * Scope The CreateForeignExchangeOption message is sent by a participant to a
 * central system or to a counterparty to confirm a foreign currency option
 * contract. Usage Both trading parties will send a notification to the central
 * settlement system. The central settlement system will then send a
 * ForeignExchangeOptionNotification to both. This message is only suitable for
 * Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign
 * Exchange Options.
 */
public class CreateForeignExchangeOptionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeAgreement1 TradeInformation;
	private TradePartyIdentification4 TradingSideIdentification;
	private TradePartyIdentification4 CounterpartySideIdentification;
	private Option3 Option;

	public TradeAgreement1 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement1 TradeInformation) {
		this.TradeInformation = TradeInformation;
	}

	public TradePartyIdentification4 getTradingSideIdentification() {
		return TradingSideIdentification;
	}

	public void setTradingSideIdentification(
			TradePartyIdentification4 TradingSideIdentification) {
		this.TradingSideIdentification = TradingSideIdentification;
	}

	public TradePartyIdentification4 getCounterpartySideIdentification() {
		return CounterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(
			TradePartyIdentification4 CounterpartySideIdentification) {
		this.CounterpartySideIdentification = CounterpartySideIdentification;
	}

	public Option3 getOption() {
		return Option;
	}

	public void setOption(Option3 Option) {
		this.Option = Option;
	}
}