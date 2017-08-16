package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.TransactionDetails3;
import com.tools20022.repository.dict.choice.PartyIdentification23Choice;
import com.tools20022.repository.dict.choice.PartyIdentification24Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope A reporting institution, eg, an investment bank, sends the
 * RegulatoryTransactionReport to a regulator or an intermediary (eg a reporting
 * agent), to report the transaction details of a trade that has been executed
 * on or off-exchange. Usage The message definition can be used to report more
 * than one transaction. The message definition can also be used to specify, on
 * a trade by trade basis, to which authorities the transaction report(s) need
 * to be sent using the TransactionReportMarker.
 */
public class RegulatoryTransactionReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private TransactionDetails3 TransactionDetails;
	private PartyIdentification23Choice ReportingInstitution;
	private Optional<PartyIdentification24Choice> ReportingAgent;
	private Optional<Extension1> Extension;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public TransactionDetails3 getTransactionDetails() {
		return TransactionDetails;
	}

	public void setTransactionDetails(TransactionDetails3 TransactionDetails) {
		this.TransactionDetails = TransactionDetails;
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

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}