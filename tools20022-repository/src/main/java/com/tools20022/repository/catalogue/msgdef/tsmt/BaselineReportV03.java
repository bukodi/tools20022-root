package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.BaselineReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ReportType2;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification6;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyIdentification26;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.LineItem8;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The BaselineReport message is sent by the matching application to the
 * parties involved in an amendment request or to the parties involved in a data
 * set match. The message is used to report either a pre-calculation or final
 * calculation of the dynamic part of an established baseline. Usage The
 * BaselineReport message can be sent by the matching application to the parties
 * involved in an amendment request for a transaction established in the
 * push-through mode. In the outlined scenario, the message is sent - to the
 * party requested to accept or reject an amendment request after the matching
 * application has received a BaselineAmendmentRequest message. The message
 * informs about the provisional status of the dynamic part of the baseline. -
 * to the requester and the accepter of an amendment request after the matching
 * application has received an AmendmentAcceptance message conveying the
 * acceptance of the amendment request. The message informs about the actual
 * status of the dynamic part of the baseline. or The BaselineReport message can
 * be sent by the matching application to the party which has sent an amendment
 * request for a transaction established in the lodge mode. In the outlined
 * scenario the message is used to inform about the actual status of the dynamic
 * part of the baseline. or The BaselineReport message can be sent by the
 * matching application to the parties involved in a data set match. In the
 * outlined scenario, the message is sent - to the submitter of the data set(s)
 * in the case of a data set match for a transaction established in the lodge
 * mode. - to the submitter of the data set(s) and to the counterparty in case
 * of a data set match for a transaction established in the push-through
 * mode.The message can be sent after a successful data-set match or after the
 * acceptance of mis-matched data sets to inform about the actual status of the
 * dynamic part of the baseline.
 */
@NextVersion(BaselineReportV04.class)
public class BaselineReportV03 {

	private MessageIdentification1 ReportIdentification;
	private Optional<MessageIdentification1> RelatedMessageReference;
	private ReportType2 ReportType;
	private SimpleIdentificationInformation TransactionIdentification;
	private DocumentIdentification6 EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private PartyIdentification26 Buyer;
	private PartyIdentification26 Seller;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private LineItem8 ReportedLineItem;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
	}

	public Optional<MessageIdentification1> getRelatedMessageReference() {
		return RelatedMessageReference;
	}

	public void setRelatedMessageReference(
			Optional<MessageIdentification1> RelatedMessageReference) {
		this.RelatedMessageReference = RelatedMessageReference;
	}

	public ReportType2 getReportType() {
		return ReportType;
	}

	public void setReportType(ReportType2 ReportType) {
		this.ReportType = ReportType;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			SimpleIdentificationInformation TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public DocumentIdentification6 getEstablishedBaselineIdentification() {
		return EstablishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(
			DocumentIdentification6 EstablishedBaselineIdentification) {
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

	public LineItem8 getReportedLineItem() {
		return ReportedLineItem;
	}

	public void setReportedLineItem(LineItem8 ReportedLineItem) {
		this.ReportedLineItem = ReportedLineItem;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}