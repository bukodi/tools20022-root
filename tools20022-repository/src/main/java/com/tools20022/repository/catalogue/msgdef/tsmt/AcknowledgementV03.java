package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The Acknowledgement message is sent by the matching application to the
 * party from which it received a message. This message is used to acknowledge
 * the receipt of a message by the matching application. Usage The
 * Acknowledgement message can be sent to a party from which the matching
 * application received a message to acknowledge the receipt of that message.
 * The message is sent when the matching application does not send any other
 * message in response to a received message.
 */
public class AcknowledgementV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 AcknowledgementIdentification;
	private Optional<SimpleIdentificationInformation> TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private Optional<TransactionStatus4> TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private MessageIdentification1 AcknowledgedMessageReference;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getAcknowledgementIdentification() {
		return AcknowledgementIdentification;
	}

	public void setAcknowledgementIdentification(
			MessageIdentification1 AcknowledgementIdentification) {
		this.AcknowledgementIdentification = AcknowledgementIdentification;
	}

	public Optional<SimpleIdentificationInformation> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<SimpleIdentificationInformation> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<DocumentIdentification3> getEstablishedBaselineIdentification() {
		return EstablishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(
			Optional<DocumentIdentification3> EstablishedBaselineIdentification) {
		this.EstablishedBaselineIdentification = EstablishedBaselineIdentification;
	}

	public Optional<TransactionStatus4> getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(
			Optional<TransactionStatus4> TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return UserTransactionReference;
	}

	public void setUserTransactionReference(
			List<DocumentIdentification5> UserTransactionReference) {
		this.UserTransactionReference = UserTransactionReference;
	}

	public MessageIdentification1 getAcknowledgedMessageReference() {
		return AcknowledgedMessageReference;
	}

	public void setAcknowledgedMessageReference(
			MessageIdentification1 AcknowledgedMessageReference) {
		this.AcknowledgedMessageReference = AcknowledgedMessageReference;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}