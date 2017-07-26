package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;

/**
 * Scope The MisMatchAcceptance message is sent by the party requested to accept
 * or reject data set mis-matches to the matching application. This message is
 * used to accept mis-matches between data sets and the related baseline. Usage
 * The MisMatchAcceptance message can be sent by the party requested to accept
 * or reject data set mis-matches to inform that it accepts the data sets. The
 * message can be sent in response to a DataSetMatchReport message conveying
 * mis-matches. The information about the acceptance of the mis-matched data
 * sets will be forwarded by the matching application to the submitter of the
 * data sets by a MisMatchAcceptanceNotification message. The rejection of
 * mis-matched data sets can be achieved by sending a MisMatchRejection message.
 */
public class MisMatchAcceptanceV02 {

	private MessageIdentification1 AcceptanceIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private MessageIdentification1 DataSetMatchReportReference;

	public MessageIdentification1 getAcceptanceIdentification() {
		return AcceptanceIdentification;
	}

	public void setAcceptanceIdentification(
			MessageIdentification1 AcceptanceIdentification) {
		this.AcceptanceIdentification = AcceptanceIdentification;
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

	public MessageIdentification1 getDataSetMatchReportReference() {
		return DataSetMatchReportReference;
	}

	public void setDataSetMatchReportReference(
			MessageIdentification1 DataSetMatchReportReference) {
		this.DataSetMatchReportReference = DataSetMatchReportReference;
	}
}