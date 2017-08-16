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
import com.tools20022.repository.dict.msg.PartyIdentification26;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.Limit1;
import com.tools20022.repository.dict.msg.DocumentIdentification4;
import com.tools20022.repository.dict.msg.MisMatchReport3;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The BaselineMatchReport message is sent by the matching application to
 * the parties involved in the establishment of a transaction. The message is
 * used to inform about either the successful establishment of a transaction
 * (baseline) or the mis-matches found between two baseline initiation messages.
 * Usage The BaselineMatchReport message can be sent by the matching application
 * to - the parties involved in the establishment of a transaction in the
 * push-through mode, that is the senders of InitialBaselineSubmission and
 * BaselineReSubmission messages including the instruction push-through. In the
 * outlined scenario the message is used to inform either about the successful
 * establishment of a transaction in the matching application or about
 * mis-matches found between two baseline initiation messages,or - the party
 * establishing a transaction in the lodge mode, that is the sender of an
 * InitialBaselineSubmission message including the instruction lodge. In the
 * outlined scenario the message is used to inform about the successful
 * establishment of a transaction in the matching application.
 */
public class BaselineMatchReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReportIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private PartyIdentification26 Buyer;
	private PartyIdentification26 Seller;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private Limit1 BaselineEstablishmentTrials;
	private List<DocumentIdentification4> ComparedDocumentReference;
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

	public Limit1 getBaselineEstablishmentTrials() {
		return BaselineEstablishmentTrials;
	}

	public void setBaselineEstablishmentTrials(
			Limit1 BaselineEstablishmentTrials) {
		this.BaselineEstablishmentTrials = BaselineEstablishmentTrials;
	}

	public List<DocumentIdentification4> getComparedDocumentReference() {
		return ComparedDocumentReference;
	}

	public void setComparedDocumentReference(
			List<DocumentIdentification4> ComparedDocumentReference) {
		this.ComparedDocumentReference = ComparedDocumentReference;
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