package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.TransactionStatus3;
import com.tools20022.repository.dict.msg.Reason2;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The StatusChangeRequestNotification message is sent by the matching
 * application to the party requested to accept or reject the request of a
 * change in the status of a transaction. This message is used to notify the
 * request of a change in the status of a transaction. Usage The
 * StatusChangeRequestNotification message can be sent by the matching
 * application to pass on the information about the request of a change in the
 * status of a transaction that it has obtained through the receipt of a
 * StatusChangeRequest message.
 */
public class StatusChangeRequestNotificationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private TransactionStatus3 ProposedStatusChange;
	private Optional<Reason2> RequestReason;
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

	public TransactionStatus3 getProposedStatusChange() {
		return ProposedStatusChange;
	}

	public void setProposedStatusChange(TransactionStatus3 ProposedStatusChange) {
		this.ProposedStatusChange = ProposedStatusChange;
	}

	public Optional<Reason2> getRequestReason() {
		return RequestReason;
	}

	public void setRequestReason(Optional<Reason2> RequestReason) {
		this.RequestReason = RequestReason;
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