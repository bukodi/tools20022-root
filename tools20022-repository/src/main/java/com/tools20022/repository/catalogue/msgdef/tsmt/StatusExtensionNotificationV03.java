package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.TransactionStatus5;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The StatusExtensionNotification message is sent by the matching
 * application to the parties involved in a request to extend the status of a
 * transaction. This message is used to inform about the acceptance of a request
 * to extend the status of a transaction. Usage The StatusExtensionNotification
 * message can be sent by the matching application - to the submitter of a
 * request to extend the status of a transaction to pass on information about
 * the acceptance of the request that it has obtained through the receipt of an
 * StatusExtensionAcceptance message. - to the accepter of a request to extend
 * the status of a transaction to inform about the actual status of the
 * transaction in response to a StatusExtensionAcceptance message. In order to
 * pass on information about the rejection of a request to extend the status of
 * a transaction the matching application sends a
 * StatusExtensionRejectionNotification message.
 */
public class StatusExtensionNotificationV03 {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private List<DocumentIdentification5> UserTransactionReference;
	private TransactionStatus5 ExtendedStatus;
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

	public TransactionStatus5 getExtendedStatus() {
		return ExtendedStatus;
	}

	public void setExtendedStatus(TransactionStatus5 ExtendedStatus) {
		this.ExtendedStatus = ExtendedStatus;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}