package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus3;
import com.tools20022.repository.dict.msg.Reason2;

/**
 * Scope The StatusChangeRequest message is sent by a party involved in a
 * transaction to the matching application. This message is used to request a
 * change in the status of a transaction. Usage The StatusChangeRequest message
 * can be sent by either party involved in a transaction to the matching
 * application to request a change in the status of a transaction. The matching
 * application will pass on the request by sending a
 * StatusChangeRequestNotification message to the counterparty which can accept
 * or reject the request by sending a SatausChangeRequestAcceptance or
 * StatusChangeRequestRejection message.
 */
public class StatusChangeRequestV02 {

	private MessageIdentification1 RequestIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private TransactionStatus3 RequestedStatus;
	private Optional<Reason2> RequestReason;

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

	public TransactionStatus3 getRequestedStatus() {
		return RequestedStatus;
	}

	public void setRequestedStatus(TransactionStatus3 RequestedStatus) {
		this.RequestedStatus = RequestedStatus;
	}

	public Optional<Reason2> getRequestReason() {
		return RequestReason;
	}

	public void setRequestReason(Optional<Reason2> RequestReason) {
		this.RequestReason = RequestReason;
	}
}