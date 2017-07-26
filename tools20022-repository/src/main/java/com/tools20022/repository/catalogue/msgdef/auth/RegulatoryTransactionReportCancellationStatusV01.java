package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.choice.PartyIdentification23Choice;
import com.tools20022.repository.dict.msg.ReportStatusAndReason2;
import com.tools20022.repository.dict.msg.TradeTransactionStatusAndReason2;

/**
 * Scope A regulator or an intermediary sends the
 * RegulatoryTransactionReportCancellationStatus to a reporting institution to
 * provide the status of a RegulatoryTransactionReportCancellationRequest
 * previously sent by the reporting institution. Usage The message definition
 * may be used to provide a status for the entire report or to provide a status
 * at the level of individual transactions within the report. One of the
 * following statuses can be reported: - Completed, or, - Pending, or, -
 * Rejected. If the status is rejected, then reason for the rejection must be
 * specified.
 */
public class RegulatoryTransactionReportCancellationStatusV01 {

	private DocumentIdentification8 Identification;
	private PartyIdentification23Choice ReportingInstitution;
	private ReportStatusAndReason2 ReportCancellationStatus;
	private TradeTransactionStatusAndReason2 IndividualTransactionCancellationStatus;

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

	public ReportStatusAndReason2 getReportCancellationStatus() {
		return ReportCancellationStatus;
	}

	public void setReportCancellationStatus(
			ReportStatusAndReason2 ReportCancellationStatus) {
		this.ReportCancellationStatus = ReportCancellationStatus;
	}

	public TradeTransactionStatusAndReason2 getIndividualTransactionCancellationStatus() {
		return IndividualTransactionCancellationStatus;
	}

	public void setIndividualTransactionCancellationStatus(
			TradeTransactionStatusAndReason2 IndividualTransactionCancellationStatus) {
		this.IndividualTransactionCancellationStatus = IndividualTransactionCancellationStatus;
	}
}