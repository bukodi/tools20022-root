package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import com.tools20022.repository.dict.msg.Count1;
import com.tools20022.repository.dict.msg.ValidationResult3;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The ErrorReport message is sent by the matching application to the
 * party from which it received a message. This message is used to inform about
 * the inability of the matching application to process a received message.
 * Usage The ErrorReport message can be sent to a party from which the matching
 * application received a message to inform about its inability to process the
 * received message because - the syntax of the message is incorrect,or - the
 * message content is inconsistent,or - according to the workflow implemented in
 * the matching application, it did not expect the received message.
 */
public class ErrorReportV03 {

	private MessageIdentification1 ReportIdentification;
	private Optional<SimpleIdentificationInformation> TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private Optional<TransactionStatus4> TransactionStatus;
	private Optional<DocumentIdentification5> UserTransactionReference;
	private Optional<MessageIdentification1> RejectedMessageReference;
	private Count1 NumberOfErrors;
	private ValidationResult3 ErrorDescription;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
	}

	public Optional<SimpleIdentificationInformation> getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			Optional<SimpleIdentificationInformation> TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Optional<DocumentIdentification3> getEstablishedBaselineIdentification() {
		return EstablishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(
			Optional<DocumentIdentification3> EstablishedBaselineIdentification) {
		this.EstablishedBaselineIdentification = EstablishedBaselineIdentification;
	}

	public Optional<TransactionStatus4> getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(
			Optional<TransactionStatus4> TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public Optional<DocumentIdentification5> getUserTransactionReference() {
		return UserTransactionReference;
	}

	public void setUserTransactionReference(
			Optional<DocumentIdentification5> UserTransactionReference) {
		this.UserTransactionReference = UserTransactionReference;
	}

	public Optional<MessageIdentification1> getRejectedMessageReference() {
		return RejectedMessageReference;
	}

	public void setRejectedMessageReference(
			Optional<MessageIdentification1> RejectedMessageReference) {
		this.RejectedMessageReference = RejectedMessageReference;
	}

	public Count1 getNumberOfErrors() {
		return NumberOfErrors;
	}

	public void setNumberOfErrors(Count1 NumberOfErrors) {
		this.NumberOfErrors = NumberOfErrors;
	}

	public ValidationResult3 getErrorDescription() {
		return ErrorDescription;
	}

	public void setErrorDescription(ValidationResult3 ErrorDescription) {
		this.ErrorDescription = ErrorDescription;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}