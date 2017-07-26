package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.ActivityReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ActivityReportItems3;

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
@PreviousVersion(ActivityReportV03.class)
public class ActivityReportV04 {

	private MessageIdentification1 ReportIdentification;
	private Optional<MessageIdentification1> RelatedMessageReference;
	private Optional<ActivityReportItems3> Report;

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

	public Optional<ActivityReportItems3> getReport() {
		return Report;
	}

	public void setReport(Optional<ActivityReportItems3> Report) {
		this.Report = Report;
	}
}