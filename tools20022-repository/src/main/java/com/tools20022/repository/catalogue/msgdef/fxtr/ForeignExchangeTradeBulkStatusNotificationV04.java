package com.tools20022.repository.catalogue.msgdef.fxtr;

import com.tools20022.repository.dict.msg.TradeData12;
import com.tools20022.repository.dict.msg.TradeData11;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeBulkStatusNotification message is sent by a
 * central system to the participant to provide notification of the current
 * status of one or more foreign exchange trades.
 */
public class ForeignExchangeTradeBulkStatusNotificationV04 {

	private TradeData12 StatusDetails;
	private TradeData11 TradeData;
	private Optional<Pagination> MessagePagination;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData12 getStatusDetails() {
		return StatusDetails;
	}

	public void setStatusDetails(TradeData12 StatusDetails) {
		this.StatusDetails = StatusDetails;
	}

	public TradeData11 getTradeData() {
		return TradeData;
	}

	public void setTradeData(TradeData11 TradeData) {
		this.TradeData = TradeData;
	}

	public Optional<Pagination> getMessagePagination() {
		return MessagePagination;
	}

	public void setMessagePagination(Optional<Pagination> MessagePagination) {
		this.MessagePagination = MessagePagination;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}