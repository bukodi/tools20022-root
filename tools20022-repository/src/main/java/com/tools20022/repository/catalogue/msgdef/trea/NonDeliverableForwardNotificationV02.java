package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradePartyIdentification3;
import com.tools20022.repository.dict.msg.OpeningData2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ClosingData2;
import com.tools20022.repository.dict.msg.TradeStatus1;
import com.tools20022.repository.dict.msg.SettlementData2;

/**
 * Scope The NonDeliverableForwardNotification message is sent by a central
 * system to a participant to provide details of a non deliverable forward
 * trade. Usage The notification is sent by a central settlement system to the
 * two trading parties after it has received create, amend or cancel messages
 * from both. The message may also contain information on the settlement of the
 * trade.
 */
public class NonDeliverableForwardNotificationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradePartyIdentification3 TradingSideIdentification;
	private TradePartyIdentification3 CounterpartySideIdentification;
	private Optional<OpeningData2> OpeningData;
	private Optional<ClosingData2> ValuationData;
	private TradeStatus1 TradeInformationAndStatus;
	private Optional<SettlementData2> SettlementData;

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

	public Optional<OpeningData2> getOpeningData() {
		return OpeningData;
	}

	public void setOpeningData(Optional<OpeningData2> OpeningData) {
		this.OpeningData = OpeningData;
	}

	public Optional<ClosingData2> getValuationData() {
		return ValuationData;
	}

	public void setValuationData(Optional<ClosingData2> ValuationData) {
		this.ValuationData = ValuationData;
	}

	public TradeStatus1 getTradeInformationAndStatus() {
		return TradeInformationAndStatus;
	}

	public void setTradeInformationAndStatus(
			TradeStatus1 TradeInformationAndStatus) {
		this.TradeInformationAndStatus = TradeInformationAndStatus;
	}

	public Optional<SettlementData2> getSettlementData() {
		return SettlementData;
	}

	public void setSettlementData(Optional<SettlementData2> SettlementData) {
		this.SettlementData = SettlementData;
	}
}