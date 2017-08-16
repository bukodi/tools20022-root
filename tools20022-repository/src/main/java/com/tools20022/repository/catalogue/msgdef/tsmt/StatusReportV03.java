package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.StatusReportItems2;
import java.util.Optional;

/**
 * Scope The StatusReport message is sent by the matching application to the
 * requester of a status report. This message is used to report on the status of
 * transactions registered in the matching application. Usage The StatusReport
 * message can be sent by the matching application to report on the status and
 * sub-status of all transactions that the requester of the report is involved
 * in. The message can be sent in response to a StatusReportRequest message.
 */
public class StatusReportV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReportIdentification;
	private MessageIdentification1 RelatedMessageReference;
	private Optional<StatusReportItems2> ReportedItems;

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

	public Optional<StatusReportItems2> getReportedItems() {
		return ReportedItems;
	}

	public void setReportedItems(Optional<StatusReportItems2> ReportedItems) {
		this.ReportedItems = ReportedItems;
	}
}