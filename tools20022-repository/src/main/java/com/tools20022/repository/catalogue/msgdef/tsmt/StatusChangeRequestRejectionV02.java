package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus3;
import com.tools20022.repository.dict.msg.Reason2;

/**
 * Scope The StatusChangeRequestRejection message is sent by the party requested
 * to accept or reject the request of a change in the status of a transaction to
 * the matching application. This message is used to inform about the rejection
 * of a request to change the status of a transaction. Usage The
 * StatusChangeRequestRejection message can be sent by the party requested to
 * accept or reject a request to change the status of a transaction to inform
 * that it rejects the request. The message can be sent in response to a
 * StatusChangeRequestNotification message. The acceptance of a request to
 * change the status of a transaction can be achieved by sending a
 * StatusChangeRequestAcceptance message.
 */
public class StatusChangeRequestRejectionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RejectionIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private TransactionStatus3 RejectedStatusChange;
	private Reason2 RejectionReason;

	public MessageIdentification1 getRejectionIdentification() {
		return RejectionIdentification;
	}

	public void setRejectionIdentification(
			MessageIdentification1 RejectionIdentification) {
		this.RejectionIdentification = RejectionIdentification;
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
}