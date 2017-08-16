package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.Count1;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.PartyIdentification26;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.DocumentIdentification1;
import com.tools20022.repository.dict.msg.ComparisonResult2;
import com.tools20022.repository.dict.msg.PendingActivity2;
import java.util.Optional;

/**
 * Scope The DeltaReport message is sent by the matching application to the
 * parties involved in the request of a baseline amendment. The message is used
 * to list the differences between the established and the newly proposed
 * baseline. Usage The DeltaReport message can be sent by the matching
 * application to - the parties involved in the amendment of a baseline that has
 * been established in the push-through mode. In the outlined scenario the
 * message is sent to the requester of the amendment to acknowledge the receipt
 * of the request and to list the differences between the established and the
 * newly proposed baseline and to the counterparty to list the differences
 * between the established and the newly proposed baseline and to request the
 * acceptance or rejection of the amendment request, or - the party that has
 * requested the amendment of a baseline established in the lodge mode. In the
 * outlined scenario the message is used to confirm the changes to the baseline
 * and to list the differences between the amended baseline and the baseline
 * established earlier.
 */
public class DeltaReportV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReportIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private DocumentIdentification3 EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private Count1 AmendmentNumber;
	private List<DocumentIdentification5> UserTransactionReference;
	private PartyIdentification26 Buyer;
	private PartyIdentification26 Seller;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private DocumentIdentification1 SubmitterProposedBaselineReference;
	private ComparisonResult2 UpdatedElement;
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

	public Count1 getAmendmentNumber() {
		return AmendmentNumber;
	}

	public void setAmendmentNumber(Count1 AmendmentNumber) {
		this.AmendmentNumber = AmendmentNumber;
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

	public DocumentIdentification1 getSubmitterProposedBaselineReference() {
		return SubmitterProposedBaselineReference;
	}

	public void setSubmitterProposedBaselineReference(
			DocumentIdentification1 SubmitterProposedBaselineReference) {
		this.SubmitterProposedBaselineReference = SubmitterProposedBaselineReference;
	}

	public ComparisonResult2 getUpdatedElement() {
		return UpdatedElement;
	}

	public void setUpdatedElement(ComparisonResult2 UpdatedElement) {
		this.UpdatedElement = UpdatedElement;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}