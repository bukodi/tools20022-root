package com.tools20022.repository.catalogue.msgdef.other;

import com.tools20022.repository.dict.msg.TradeData10;
import com.tools20022.repository.dict.msg.TradeData8;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ForeignExchangeTradeBulkStatusNotification message is sent by a
 * central system to the participant to provide notification of the current
 * status of one or more foreign exchange trades.
 */
public class ForeignExchangeTradeBulkStatusNotificationV02 {

	private TradeData10 StatusDetails;
	private TradeData8 TradeData;
	private Optional<Pagination> MessagePagination;
	private Optional<SupplementaryData1> SupplementaryData;

	public TradeData10 getStatusDetails() {
		return StatusDetails;
	}

	public void setStatusDetails(TradeData10 StatusDetails) {
		this.StatusDetails = StatusDetails;
	}

	public TradeData8 getTradeData() {
		return TradeData;
	}

	public void setTradeData(TradeData8 TradeData) {
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