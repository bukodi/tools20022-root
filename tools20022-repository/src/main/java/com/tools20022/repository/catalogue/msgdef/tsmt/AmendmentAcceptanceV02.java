package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Count1;

/**
 * Scope The AmendmentAcceptance message is sent by the party requested to
 * accept or reject an amendment to the matching application. The message is
 * used to accept an amendment request. Usage The AmendmentAcceptance message
 * can be sent by the party requested to accept or reject an amendment to inform
 * that it accepts the requested amendment. The message can be sent in response
 * to a FullPushThroughReport and DeltaReport message conveying the details of a
 * BaselineAmendmentRequest message. The rejection of an amendment request can
 * be achieved by sending an AmendmentRejection message.
 */
public class AmendmentAcceptanceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 AcceptanceIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private MessageIdentification1 DeltaReportReference;
	private Count1 AcceptedAmendmentNumber;

	public MessageIdentification1 getAcceptanceIdentification() {
		return AcceptanceIdentification;
	}

	public void setAcceptanceIdentification(
			MessageIdentification1 AcceptanceIdentification) {
		this.AcceptanceIdentification = AcceptanceIdentification;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			SimpleIdentificationInformation TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return SubmitterTransactionReference;
	}

	public void setSubmitterTransactionReference(
			Optional<SimpleIdentificationInformation> SubmitterTransactionReference) {
		this.SubmitterTransactionReference = SubmitterTransactionReference;
	}

	public MessageIdentification1 getDeltaReportReference() {
		return DeltaReportReference;
	}

	public void setDeltaReportReference(
			MessageIdentification1 DeltaReportReference) {
		this.DeltaReportReference = DeltaReportReference;
	}

	public Count1 getAcceptedAmendmentNumber() {
		return AcceptedAmendmentNumber;
	}

	public void setAcceptedAmendmentNumber(Count1 AcceptedAmendmentNumber) {
		this.AcceptedAmendmentNumber = AcceptedAmendmentNumber;
	}
}