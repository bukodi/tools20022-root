package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.repository.dict.msg.TradePartyIdentification4;
import com.tools20022.repository.dict.msg.OptionData2;
import com.tools20022.repository.dict.msg.TradeStatus1;
import com.tools20022.repository.dict.msg.SettlementData2;
import java.util.Optional;

/**
 * Scope The ForeignExchangeOptionNotification message is sent by a central
 * system to a participant to provide details of a foreign exchange option
 * trade. Usage The notification is sent by the central settlement system to the
 * two trading parties after it has received Create, Amend or Cancel messages
 * from both. The message may also contain information on the settlement of the
 * trade and/or premium.
 */
public class ForeignExchangeOptionNotificationV02 {

	private TradePartyIdentification4 TradingSideIdentification;
	private TradePartyIdentification4 CounterpartySideIdentification;
	private OptionData2 OptionData;
	private TradeStatus1 TradeStatus;
	private Optional<SettlementData2> SettlementData;

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

	public OptionData2 getOptionData() {
		return OptionData;
	}

	public void setOptionData(OptionData2 OptionData) {
		this.OptionData = OptionData;
	}

	public TradeStatus1 getTradeStatus() {
		return TradeStatus;
	}

	public void setTradeStatus(TradeStatus1 TradeStatus) {
		this.TradeStatus = TradeStatus;
	}

	public Optional<SettlementData2> getSettlementData() {
		return SettlementData;
	}

	public void setSettlementData(Optional<SettlementData2> SettlementData) {
		this.SettlementData = SettlementData;
	}
}