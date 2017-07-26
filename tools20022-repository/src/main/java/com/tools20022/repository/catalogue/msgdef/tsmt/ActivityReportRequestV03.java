package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.BICIdentification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DateTimePeriodDetails1;

/**
 * Scope The ActivityReportRequest message is sent by any party involved in a
 * transaction to the matching application. This message is used to request a
 * report on all transactions for which an activity has taken place within a
 * given time span. Usage The ActivityReportRequest message can be sent - at a
 * pre-determined time. The message requests a report on all transactions that
 * the requester is involved in and for which an activity has taken place within
 * the last 24 hours. - on demand. The message requests a report on all
 * transactions that the requester is involved in and for which an activity has
 * taken place within a time span specified by the requester.
 */
public class ActivityReportRequestV03 {

	private MessageIdentification1 RequestIdentification;
	private Optional<BICIdentification1> EntitiesToBeReported;
	private DateTimePeriodDetails1 ReportPeriod;

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

	public DateTimePeriodDetails1 getReportPeriod() {
		return ReportPeriod;
	}

	public void setReportPeriod(DateTimePeriodDetails1 ReportPeriod) {
		this.ReportPeriod = ReportPeriod;
	}
}