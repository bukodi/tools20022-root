package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.TransactionReportItems3;
import java.util.Optional;

/**
 * Scope The TransactionReport message is sent by the matching application to
 * the requester of a transaction report. This message is used to report on
 * various details of transactions registered in the matching application. Usage
 * The TransactionReport message can be sent by the matching application to
 * report on various details of transactions that the requester of the report
 * asked for. The message is sent in response to a TransactionReportRequest
 * message.
 */
public class TransactionReportV03 {

	private MessageIdentification1 ReportIdentification;
	private MessageIdentification1 RelatedMessageReference;
	private Optional<TransactionReportItems3> ReportedItems;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
	}

	public MessageIdentification1 getRelatedMessageReference() {
		return RelatedMessageReference;
	}

	public void setRelatedMessageReference(
			MessageIdentification1 RelatedMessageReference) {
		this.RelatedMessageReference = RelatedMessageReference;
	}

	public Optional<TransactionReportItems3> getReportedItems() {
		return ReportedItems;
	}

	public void setReportedItems(Optional<TransactionReportItems3> ReportedItems) {
		this.ReportedItems = ReportedItems;
	}
}