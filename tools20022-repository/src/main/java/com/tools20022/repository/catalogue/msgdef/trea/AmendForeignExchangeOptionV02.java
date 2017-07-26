package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.repository.dict.msg.TradeAgreement2;
import com.tools20022.repository.dict.msg.TradePartyIdentification4;
import com.tools20022.repository.dict.msg.Option3;

/**
 * Scope The AmendForeignExchangeOption message is sent by a participant to a
 * central system or to a counterparty to notify the amendment of a foreign
 * currency option contract. Usage The message contains a Related Reference to
 * link it to the previously sent notification and may contain an reason for
 * amendment. This message is only suitable for Simple (i.e. not Barrier)
 * Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.
 */
public class AmendForeignExchangeOptionV02 {

	private TradeAgreement2 TradeInformation;
	private TradePartyIdentification4 TradingSideIdentification;
	private TradePartyIdentification4 CounterpartySideIdentification;
	private Option3 Option;

	public TradeAgreement2 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement2 TradeInformation) {
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