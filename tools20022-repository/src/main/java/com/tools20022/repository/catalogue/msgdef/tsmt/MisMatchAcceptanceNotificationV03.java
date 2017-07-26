package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PendingActivity2;
import java.util.Optional;

/**
 * Scope The MisMatchAcceptanceNotification message is sent by the matching
 * application to the parties involved in the transaction. This message is used
 * to notify the acceptance of mis-matched data sets. Usage The
 * MisMatchAcceptanceNotification message can be sent by the matching
 * application to pass on information about the acceptance of mis-matched data
 * sets that it has obtained through the receipt of an MisMatchAcceptance
 * message. In order to pass on information about the rejection of mis-matched
 * data sets the matching application sends a MisMatchRejectionNotification
 * message.
 */
public class MisMatchAcceptanceNotificationV03 {

	private MessageIdentification1 NotificationIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private DocumentIdentification3 EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private MessageIdentification1 DataSetMatchReportReference;
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

	public MessageIdentification1 getDataSetMatchReportReference() {
		return DataSetMatchReportReference;
	}

	public void setDataSetMatchReportReference(
			MessageIdentification1 DataSetMatchReportReference) {
		this.DataSetMatchReportReference = DataSetMatchReportReference;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}