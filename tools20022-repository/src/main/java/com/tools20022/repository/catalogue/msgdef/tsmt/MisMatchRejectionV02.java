package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.choice.RejectionReason1Choice;

/**
 * Scope The MisMatchRejection message is sent by the party requested to accept
 * or reject data set mis-matches to the matching application. This message is
 * used to reject mis-matches between data sets and the related baseline. Usage
 * The MisMatchRejection message can be sent by the party requested to accept or
 * reject data set mis-match to inform that it rejects the data set(s). The
 * message can be sent in response to a DataSetMatchReport message conveying
 * mis-matches. The information about the rejection of the mis-matched data sets
 * will be forwarded by the matching application to the submitter of the data
 * sets by a MisMatchRejectionNotification message. The acceptance of
 * mis-matched data sets can be achieved by sending a MisMatchAcceptance
 * message.
 */
public class MisMatchRejectionV02 {

	private MessageIdentification1 RejectionIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private MessageIdentification1 DataSetMatchReportReference;
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

	public MessageIdentification1 getDataSetMatchReportReference() {
		return DataSetMatchReportReference;
	}

	public void setDataSetMatchReportReference(
			MessageIdentification1 DataSetMatchReportReference) {
		this.DataSetMatchReportReference = DataSetMatchReportReference;
	}

	public RejectionReason1Choice getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(RejectionReason1Choice RejectionReason) {
		this.RejectionReason = RejectionReason;
	}
}