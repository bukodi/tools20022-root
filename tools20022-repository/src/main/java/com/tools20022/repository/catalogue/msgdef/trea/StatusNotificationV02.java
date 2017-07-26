package com.tools20022.repository.catalogue.msgdef.trea;

import com.tools20022.repository.dict.msg.TradeData1;

/**
 * Scope The StatusNotification message is sent by a central system to a
 * participant to notify the current status of a trade in the system. Usage This
 * message will be sent at specific times agreed upon by the central settlement
 * system and a participant in a central settlement system.
 */
public class StatusNotificationV02 {

	private TradeData1 TradeData;

	public TradeData1 getTradeData() {
		return TradeData;
	}

	public void setTradeData(TradeData1 TradeData) {
		this.TradeData = TradeData;
	}
}