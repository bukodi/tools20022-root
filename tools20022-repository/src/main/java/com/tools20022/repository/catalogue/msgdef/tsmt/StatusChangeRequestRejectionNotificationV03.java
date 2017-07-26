package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.TransactionStatus3;
import com.tools20022.repository.dict.msg.Reason2;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The StatusChangeRequestRejectionNotification message is sent by the
 * matching application to the submitter of a request to change the status of a
 * transaction. This message is used to inform about the rejection of a request
 * to change the status of a transaction. Usage The
 * StatusChangeRequestRejectionNotification message can be sent by the matching
 * application to pass on information about the rejection of a request to change
 * the status of a transaction that it has obtained through the receipt of a
 * StatusChangeRequestRejection message. In order to pass on information about
 * the acceptance of a request to change the status of a transaction the
 * matching application sends a StatusChangeNotification message.
 */
public class StatusChangeRequestRejectionNotificationV03 {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private TransactionStatus3 RejectedStatusChange;
	private Reason2 RejectionReason;
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

	public TransactionStatus3 getRejectedStatusChange() {
		return RejectedStatusChange;
	}

	public void setRejectedStatusChange(TransactionStatus3 RejectedStatusChange) {
		this.RejectedStatusChange = RejectedStatusChange;
	}

	public Reason2 getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(Reason2 RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}