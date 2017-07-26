package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.TransactionStatus5;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The StatusExtensionRequestNotification message is sent by the matching
 * application to the party requested to accept or reject a request to extend
 * the status of a transaction. This message is used to notify the request to
 * extend the status of a transaction. Usage The
 * StatusExtensionRequestNotification message can be sent by the matching
 * application to pass on information about the request to extend the status of
 * a transaction that it has obtained through the receipt of a
 * StatusExtensionRequest message.
 */
public class StatusExtensionRequestNotificationV03 {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private List<DocumentIdentification5> UserTransactionReference;
	private TransactionStatus5 StatusToBeExtended;
	private BICIdentification1 Initiator;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			MessageIdentification1 NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			SimpleIdentificationInformation TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<DocumentIdentification3> getEstablishedBaselineIdentification() {
		return EstablishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(
			Optional<DocumentIdentification3> EstablishedBaselineIdentification) {
		this.EstablishedBaselineIdentification = EstablishedBaselineIdentification;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return UserTransactionReference;
	}

	public void setUserTransactionReference(
			List<DocumentIdentification5> UserTransactionReference) {
		this.UserTransactionReference = UserTransactionReference;
	}

	public TransactionStatus5 getStatusToBeExtended() {
		return StatusToBeExtended;
	}

	public void setStatusToBeExtended(TransactionStatus5 StatusToBeExtended) {
		this.StatusToBeExtended = StatusToBeExtended;
	}

	public BICIdentification1 getInitiator() {
		return Initiator;
	}

	public void setInitiator(BICIdentification1 Initiator) {
		this.Initiator = Initiator;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}