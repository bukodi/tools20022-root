package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.BICIdentification1;
import java.util.Optional;

/**
 * Scope The StatusReportRequest message is sent by a party involved in a
 * transaction to the matching application. This message is used to request a
 * report on the status of transactions registered in the matching application.
 * Usage The StatusReportRequest message can be sent by either party involved in
 * a transaction to request a report on the status and sub-statuses of all
 * transactions that the requester is involved in. The application will respond
 * to the request by sending a StatusReport message.
 */
public class StatusReportRequestV03 {

	private MessageIdentification1 RequestIdentification;
	private Optional<BICIdentification1> EntitiesToBeReported;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
	}

	public Optional<BICIdentification1> getEntitiesToBeReported() {
		return EntitiesToBeReported;
	}

	public void setEntitiesToBeReported(
			Optional<BICIdentification1> EntitiesToBeReported) {
		this.EntitiesToBeReported = EntitiesToBeReported;
	}
}