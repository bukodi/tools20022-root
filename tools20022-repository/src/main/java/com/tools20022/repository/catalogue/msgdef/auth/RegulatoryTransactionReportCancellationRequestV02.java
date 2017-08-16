package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.choice.PartyIdentification23Choice;
import com.tools20022.repository.dict.choice.PartyIdentification24Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionDetails3;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.TransactionDetails2;

/**
 * Scope A reporting institution, eg, an investment bank, sends the
 * RegulatoryTransactionReportCancellationRequest to a regulator or to an
 * intermediary (eg a reporting agent), to request a cancellation of a
 * previously sent RegulatoryTransactionReport. Usage The message definition can
 * be used to cancel an entire RegulatoryTransactionReport or to cancel one or
 * more individual transactions in a previously sent
 * RegulatoryTransactionReport.
 */
public class RegulatoryTransactionReportCancellationRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private PartyIdentification23Choice ReportingInstitution;
	private Optional<PartyIdentification24Choice> ReportingAgent;
	private TransactionDetails3 CancellationByTransactionDetails;
	private DocumentIdentification9 PreviousReference;
	private TransactionDetails2 CancellationByTradeReference;

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

	public Optional<PartyIdentification24Choice> getReportingAgent() {
		return ReportingAgent;
	}

	public void setReportingAgent(
			Optional<PartyIdentification24Choice> ReportingAgent) {
		this.ReportingAgent = ReportingAgent;
	}

	public TransactionDetails3 getCancellationByTransactionDetails() {
		return CancellationByTransactionDetails;
	}

	public void setCancellationByTransactionDetails(
			TransactionDetails3 CancellationByTransactionDetails) {
		this.CancellationByTransactionDetails = CancellationByTransactionDetails;
	}

	public DocumentIdentification9 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(DocumentIdentification9 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public TransactionDetails2 getCancellationByTradeReference() {
		return CancellationByTradeReference;
	}

	public void setCancellationByTradeReference(
			TransactionDetails2 CancellationByTradeReference) {
		this.CancellationByTradeReference = CancellationByTradeReference;
	}
}