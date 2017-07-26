package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyIdentification26;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.DocumentIdentification10;
import com.tools20022.repository.dict.msg.ReportType3;
import com.tools20022.repository.dict.msg.MisMatchReport3;
import com.tools20022.repository.dict.msg.PendingActivity2;
import java.util.Optional;

/**
 * Scope The DataSetMatchReport message is sent by the matching application to
 * the parties involved in a data set match. This message is used to either -
 * inform about the successful match of data sets submitted with the instruction
 * match or pre-match (DataSetSubmission message) and the related baseline,or -
 * inform about mis-matches found between data sets submitted with the
 * instruction match or pre-match (DataSetSubmission message) and the related
 * baseline. Usage The DataSetMatchReport message can be sent by the matching
 * application to the party requesting a data set pre-match for a transaction
 * established in the push-through mode. In the outlined scenario, the
 * DataSetMatchReport message will either inform about the successful pre-match
 * or list the mis-matches between the data set(s) conveyed with the
 * DataSetSubmission message and the related baseline. or The DataSetMatchReport
 * message can be sent by the matching application to the parties involved in a
 * data set match for a transaction established in the push-through mode. In the
 * outlined scenario, the DataSetMatchReport message will either inform about
 * the successful match or list the mis-matches between the data set(s) conveyed
 * with the DataSetSubmission message and the related baseline. or The
 * DataSetMatchReport message can be sent by the matching application to the
 * party requesting a data set match or pre-match for a transaction established
 * in the lodge mode. In the outlined scenario, the DataSetMatchReport will
 * either inform about the successful match or list the mis-matches between the
 * data set(s) conveyed with the DataSetSubmission message and the related
 * baseline.
 */
public class DataSetMatchReportV03 {

	private MessageIdentification1 ReportIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private DocumentIdentification3 EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private PartyIdentification26 Buyer;
	private PartyIdentification26 Seller;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private DocumentIdentification10 ComparedDocumentReference;
	private ReportType3 SubmissionType;
	private MisMatchReport3 Report;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
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

	public PartyIdentification26 getBuyer() {
		return Buyer;
	}

	public void setBuyer(PartyIdentification26 Buyer) {
		this.Buyer = Buyer;
	}

	public PartyIdentification26 getSeller() {
		return Seller;
	}

	public void setSeller(PartyIdentification26 Seller) {
		this.Seller = Seller;
	}

	public BICIdentification1 getBuyerBank() {
		return BuyerBank;
	}

	public void setBuyerBank(BICIdentification1 BuyerBank) {
		this.BuyerBank = BuyerBank;
	}

	public BICIdentification1 getSellerBank() {
		return SellerBank;
	}

	public void setSellerBank(BICIdentification1 SellerBank) {
		this.SellerBank = SellerBank;
	}

	public DocumentIdentification10 getComparedDocumentReference() {
		return ComparedDocumentReference;
	}

	public void setComparedDocumentReference(
			DocumentIdentification10 ComparedDocumentReference) {
		this.ComparedDocumentReference = ComparedDocumentReference;
	}

	public ReportType3 getSubmissionType() {
		return SubmissionType;
	}

	public void setSubmissionType(ReportType3 SubmissionType) {
		this.SubmissionType = SubmissionType;
	}

	public MisMatchReport3 getReport() {
		return Report;
	}

	public void setReport(MisMatchReport3 Report) {
		this.Report = Report;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}