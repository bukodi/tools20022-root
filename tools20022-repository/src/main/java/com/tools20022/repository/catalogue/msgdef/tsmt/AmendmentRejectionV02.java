package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Count1;
import com.tools20022.repository.dict.choice.RejectionReason1Choice;

/**
 * Scope The AmendmentRejection message is sent by the party requested to accept
 * or reject an amendment to the matching application. This message is used to
 * reject an amendment request. Usage The AmendmentRejection message can be sent
 * by the party requested to accept or reject an amendment to inform that it
 * rejects the requested amendment. The message can be sent in response to a
 * FullPushThroughReport and DeltaReport message conveying the details of a
 * BaselineAmendmentRequest message. The acceptance of an amendment request can
 * be achieved by sending an AmendmentAcceptance message.
 */
public class AmendmentRejectionV02 {

	private MessageIdentification1 RejectionIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private MessageIdentification1 DeltaReportReference;
	private Count1 RejectedAmendmentNumber;
	private RejectionReason1Choice RejectionReason;

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

	public RejectionReason1Choice getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectionReason1Choice RejectionReason) {
		this.RejectionReason = RejectionReason;
	}
}