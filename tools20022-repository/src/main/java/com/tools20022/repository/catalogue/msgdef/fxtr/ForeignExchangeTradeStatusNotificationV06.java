package com.tools20022.repository.catalogue.msgdef.fxtr;

import com.tools20022.repository.dict.msg.TradeData15;
import com.tools20022.repository.dict.msg.RegulatoryReporting6;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeStatusNotification message is sent by a central
 * system to the participant to notify the current status of a foreign exchange
 * trade in the system. Usage This ForeignExchangeTradeStatusNotification
 * message will be sent at specific times agreed upon by the central settlement
 * system and a participant in a central settlement system.
 */
public class ForeignExchangeTradeStatusNotificationV06 {

	private TradeData15 TradeData;
	private Optional<RegulatoryReporting6> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData15 getTradeData() {
		return TradeData;
	}

	public void setTradeData(TradeData15 TradeData) {
		this.TradeData = TradeData;
	}

	public Optional<RegulatoryReporting6> getRegulatoryReporting() {
		return RegulatoryReporting;
	}

	public void setRegulatoryReporting(
			Optional<RegulatoryReporting6> RegulatoryReporting) {
		this.RegulatoryReporting = RegulatoryReporting;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}