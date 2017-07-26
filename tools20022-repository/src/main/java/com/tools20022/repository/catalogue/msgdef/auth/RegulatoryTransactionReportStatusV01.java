package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.choice.PartyIdentification23Choice;
import com.tools20022.repository.dict.msg.ReportStatusAndReason1;
import com.tools20022.repository.dict.msg.TradeTransactionStatusAndReason1;

/**
 * Scope A regulator or an intermediary sends the
 * RegulatoryTransactionReportStatus to a reporting institution to provide the
 * status of a RegulatoryTransactionReport previously sent by the reporting
 * institution. Usage The message definition may be used to provide a status for
 * the entire report or to provide a status at the level of individual
 * transactions within the report. One of the following statuses can be
 * reported: - Completed, or, - Pending, or, - Rejected. If the status is
 * rejected, then reason for the rejection must be specified.
 */
public class RegulatoryTransactionReportStatusV01 {

	private DocumentIdentification8 Identification;
	private PartyIdentification23Choice ReportingInstitution;
	private ReportStatusAndReason1 ReportStatus;
	private TradeTransactionStatusAndReason1 IndividualTransactionStatus;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public PartyIdentification23Choice getReportingInstitution() {
		return ReportingInstitution;
	}

	public void setReportingInstitution(
			PartyIdentification23Choice ReportingInstitution) {
		this.ReportingInstitution = ReportingInstitution;
	}

	public ReportStatusAndReason1 getReportStatus() {
		return ReportStatus;
	}

	public void setReportStatus(ReportStatusAndReason1 ReportStatus) {
		this.ReportStatus = ReportStatus;
	}

	public TradeTransactionStatusAndReason1 getIndividualTransactionStatus() {
		return IndividualTransactionStatus;
	}

	public void setIndividualTransactionStatus(
			TradeTransactionStatusAndReason1 IndividualTransactionStatus) {
		this.IndividualTransactionStatus = IndividualTransactionStatus;
	}
}