package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.tsmt.ActivityReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ActivityReportItems2;

/**
 * Scope The ActivityReport message is sent by the matching application to the
 * requester of an activity report. This message is used to report on all
 * transactions for which an activity has taken place within a given time span.
 * Usage The ActivityReport message can be sent - at a pre-determined time every
 * 24 hours. The message reports on all transactions that the requester is
 * involved in and for which an activity has taken place within the last 24
 * hours. - on demand in response to an ActivityReportRequest message. The
 * message reports on all transactions that the requester is involved in and for
 * which an activity has taken place within a time span specified by the
 * requester in the ActivityReportRequest message.
 */
@NextVersion(ActivityReportV04.class)
public class ActivityReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReportIdentification;
	private Optional<MessageIdentification1> RelatedMessageReference;
	private Optional<ActivityReportItems2> Report;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
	}

	public Optional<MessageIdentification1> getRelatedMessageReference() {
		return RelatedMessageReference;
	}

	public void setRelatedMessageReference(
			Optional<MessageIdentification1> RelatedMessageReference) {
		this.RelatedMessageReference = RelatedMessageReference;
	}

	public Optional<ActivityReportItems2> getReport() {
		return Report;
	}

	public void setReport(Optional<ActivityReportItems2> Report) {
		this.Report = Report;
	}
}