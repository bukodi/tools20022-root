package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.Count1;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.choice.RejectionReason1Choice;
import com.tools20022.repository.dict.msg.PendingActivity2;
import java.util.Optional;

/**
 * Scope The AmendmentRejectionNotification message is sent by the matching
 * application to the requester of an amendment. This message is used to notify
 * the rejection of an amendment request. Usage The
 * AmendmentRejectionNotification message can be sent by the matching
 * application to pass on information about the rejection of an amendment
 * request that it has obtained through the receipt of an AmendmentRejection
 * message. In order to pass on information about the acceptance of an amendment
 * request the matching application sends an AmendmentAcceptanceNotification
 * message.
 */
public class AmendmentRejectionNotificationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private DocumentIdentification3 EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private MessageIdentification1 DeltaReportReference;
	private Count1 RejectedAmendmentNumber;
	private BICIdentification1 Initiator;
	private RejectionReason1Choice RejectionReason;
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

	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return EstablishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(
			DocumentIdentification3 EstablishedBaselineIdentification) {
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

	public MessageIdentification1 getDeltaReportReference() {
		return DeltaReportReference;
	}

	public void setDeltaReportReference(
			MessageIdentification1 DeltaReportReference) {
		this.DeltaReportReference = DeltaReportReference;
	}

	public Count1 getRejectedAmendmentNumber() {
		return RejectedAmendmentNumber;
	}

	public void setRejectedAmendmentNumber(Count1 RejectedAmendmentNumber) {
		this.RejectedAmendmentNumber = RejectedAmendmentNumber;
	}

	public BICIdentification1 getInitiator() {
		return Initiator;
	}

	public void setInitiator(BICIdentification1 Initiator) {
		this.Initiator = Initiator;
	}

	public RejectionReason1Choice getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectionReason1Choice RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}