package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus5;

/**
 * Scope The StatusExtensionRequest message is sent by either party involved in
 * a transaction to the matching application. This message is used to request
 * the extension of the status of a transaction. Usage The
 * StatusExtensionRequest message can be sent by either party involved in a
 * transaction to the matching application to request the extension of the
 * status of a transaction. The matching application will pass on the request by
 * sending a StatusExtensionRequestNotification message to the counterparty
 * which can accept or reject the status extension request by sending a
 * StatusExtensionAcceptance or StatusExtensionRejection message.
 */
public class StatusExtensionRequestV03 {

	private MessageIdentification1 RequestIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private TransactionStatus5 StatusToBeExtended;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
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

	public TransactionStatus5 getStatusToBeExtended() {
		return StatusToBeExtended;
	}

	public void setStatusToBeExtended(TransactionStatus5 StatusToBeExtended) {
		this.StatusToBeExtended = StatusToBeExtended;
	}
}