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
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The ActionReminder message is sent by the matching application to a
 * party involved in a transaction that it is expecting to take an action. This
 * message is used to remind a party of an action that it is expected to take.
 * Usage The ActionReminder message can be sent by the matching application to
 * remind a party that it is waiting for - the submission of a transaction
 * initiation message (BaselineReSubmission message), or - the acceptance or
 * rejection of mis-matched data sets (MisMatchAcceptance or MisMatchRejection
 * message), or - the acceptance or rejection of an amendment request
 * (AmendmentAcceptance or AmendmentRejection message), or - the acceptance or
 * rejection of a status change request (StatusChangeRequestAcceptance or
 * StatusChangeRequestRejection message), or - the acceptance or rejection of a
 * status extension request (StatusExtensionAcceptance or
 * StatusExtensionRejection message). - or - the acceptance or rejection of a
 * request to accept role and baseline (RoleAndBaselineAcceptance or
 * RoleAndBaselineRejection message).
 */
public class ActionReminderV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReminderIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private MessageIdentification1 MessageRequiringAction;
	private PendingActivity2 PendingRequestForAction;

	public MessageIdentification1 getReminderIdentification() {
		return ReminderIdentification;
	}

	public void setReminderIdentification(
			MessageIdentification1 ReminderIdentification) {
		this.ReminderIdentification = ReminderIdentification;
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

	public MessageIdentification1 getMessageRequiringAction() {
		return MessageRequiringAction;
	}

	public void setMessageRequiringAction(
			MessageIdentification1 MessageRequiringAction) {
		this.MessageRequiringAction = MessageRequiringAction;
	}

	public PendingActivity2 getPendingRequestForAction() {
		return PendingRequestForAction;
	}

	public void setPendingRequestForAction(
			PendingActivity2 PendingRequestForAction) {
		this.PendingRequestForAction = PendingRequestForAction;
	}
}