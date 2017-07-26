package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The StatusChangeNotification message is sent by the matching
 * application to the parties involved in the change of the status of a
 * transaction. This message is used to inform about the change of a status.
 * Usage The StatusChangeNotification message can be sent by the matching
 * application - to the submitter of the request to change the status of a
 * transaction to pass on the information about the acceptance of the request
 * that it has obtained through the receipt of an StatusChangeRequestAcceptance
 * message. - to the accepter of a request to change the status of a transaction
 * inform about the actual status of the transaction in response to a
 * StatusChangeRequestAcceptance message. - to either party involved in the
 * establishment of a transaction to inform about the change of the status of
 * the transaction to the status close. This can be done when the limit of
 * possible attempts to establish the transaction has been reached or when
 * unilaterally requested by one of the parties involved in the not yet
 * established transaction. - to either party involved in a transaction to
 * inform about the change of the status of the transaction as announced in a
 * TimeOutNotification message sent by the matching application prior to the
 * StatusChangeNotification message.
 */
public class StatusChangeNotificationV03 {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
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

	public TransactionStatus4 getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(TransactionStatus4 TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return UserTransactionReference;
	}

	public void setUserTransactionReference(
			List<DocumentIdentification5> UserTransactionReference) {
		this.UserTransactionReference = UserTransactionReference;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}