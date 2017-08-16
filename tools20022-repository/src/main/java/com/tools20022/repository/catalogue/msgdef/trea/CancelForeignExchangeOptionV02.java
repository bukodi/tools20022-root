package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeAgreement2;
import com.tools20022.repository.dict.msg.TradePartyIdentification4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Option3;

/**
 * Scope The CancelForeignExchangeOption message is sent by a participant to a
 * central system or to a counterparty to notify the cancellation of a foreign
 * currency option contract. Usage The message will contain a Related Reference
 * to link it to the previously sent notification. It may contain a reason for
 * cancellation. This message is only suitable for Simple (i.e. not Barrier)
 * Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.
 */
public class CancelForeignExchangeOptionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeAgreement2 TradeInformation;
	private Optional<TradePartyIdentification4> TradingSideIdentification;
	private Optional<TradePartyIdentification4> CounterpartySideIdentification;
	private Optional<Option3> Option;

	public TradeAgreement2 getTradeInformation() {
		return TradeInformation;
	}

	public void setTradeInformation(TradeAgreement2 TradeInformation) {
		this.TradeInformation = TradeInformation;
	}

	public Optional<TradePartyIdentification4> getTradingSideIdentification() {
		return TradingSideIdentification;
	}

	public void setTradingSideIdentification(
			Optional<TradePartyIdentification4> TradingSideIdentification) {
		this.TradingSideIdentification = TradingSideIdentification;
	}

	public Optional<TradePartyIdentification4> getCounterpartySideIdentification() {
		return CounterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(
			Optional<TradePartyIdentification4> CounterpartySideIdentification) {
		this.CounterpartySideIdentification = CounterpartySideIdentification;
	}

	public Optional<Option3> getOption() {
		return Option;
	}

	public void setOption(Optional<Option3> Option) {
		this.Option = Option;
	}
}