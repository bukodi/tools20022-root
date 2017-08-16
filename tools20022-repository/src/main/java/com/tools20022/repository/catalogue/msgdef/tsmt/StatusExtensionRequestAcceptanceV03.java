package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus4;

/**
 * Scope The StatusExtensionRequestAcceptance message is sent by the party
 * requested to accept or reject a request to extend the status of a transaction
 * to the matching application. This message is used to inform about the
 * acceptance of a request to extend the status of a transaction. Usage The
 * StatusExtensionRequestAcceptance message can be sent by the party requested
 * to accept or reject the request to extend the status of a transaction to
 * inform that it accepts the request. The message can be sent in response to a
 * StatusExtensionRequestNotification message. The rejection of a request to
 * extend the status of a transaction can be achieved by sending a
 * StatusExtensionRequestRejection message.
 */
public class StatusExtensionRequestAcceptanceV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 AcceptanceIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private TransactionStatus4 ExtendedStatus;

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

	public TransactionStatus4 getExtendedStatus() {
		return ExtendedStatus;
	}

	public void setExtendedStatus(TransactionStatus4 ExtendedStatus) {
		this.ExtendedStatus = ExtendedStatus;
	}
}