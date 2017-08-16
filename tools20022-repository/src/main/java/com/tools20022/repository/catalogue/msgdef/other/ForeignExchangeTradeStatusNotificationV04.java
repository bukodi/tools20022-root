package com.tools20022.repository.catalogue.msgdef.other;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TradeData7;
import com.tools20022.repository.dict.msg.RegulatoryReporting1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeStatusNotification message is sent by a central
 * system to the participant to notify the current status of a foreign exchange
 * trade in the system. Usage This ForeignExchangeTradeStatusNotification
 * message will be sent at specific times agreed upon by the central settlement
 * system and a participant in a central settlement system.
 */
public class ForeignExchangeTradeStatusNotificationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TradeData7 TradeData;
	private Optional<RegulatoryReporting1> RegulatoryReporting;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData7 getTradeData() {
		return TradeData;
	}

	public void setTradeData(TradeData7 TradeData) {
		this.TradeData = TradeData;
	}

	public Optional<RegulatoryReporting1> getRegulatoryReporting() {
		return RegulatoryReporting;
	}

	public void setRegulatoryReporting(
			Optional<RegulatoryReporting1> RegulatoryReporting) {
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