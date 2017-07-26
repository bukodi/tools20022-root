package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.FullPushThroughReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.DocumentIdentification3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransactionStatus4;
import com.tools20022.repository.dict.msg.DocumentIdentification5;
import java.util.List;
import com.tools20022.repository.dict.msg.ReportType1;
import com.tools20022.repository.dict.msg.Baseline3;
import com.tools20022.repository.dict.msg.ContactIdentification1;
import com.tools20022.repository.dict.msg.ContactIdentification3;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The FullPushThroughReport message is sent by the matching application
 * to a party involved in a transaction. This message is used to pass on
 * information that the matching application has received from the submitter.
 * The forwarded information can originate from an InitialBaselineSubmission or
 * BaselineReSubmission or BaselineAmendmentRequest message. Usage The
 * FullPushThroughReport message can be sent by the matching application to a
 * party to convey - the details of an InitialBaselineSubmission message that it
 * has obtained,or - the details of a BaselineResubmission message that it has
 * obtained,or - the details of a BaselineAmendmentRequest message that it has
 * obtained.
 */
@NextVersion(FullPushThroughReportV04.class)
public class FullPushThroughReportV03 {

	private MessageIdentification1 ReportIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<DocumentIdentification3> EstablishedBaselineIdentification;
	private TransactionStatus4 TransactionStatus;
	private List<DocumentIdentification5> UserTransactionReference;
	private ReportType1 ReportPurpose;
	private Baseline3 PushedThroughBaseline;
	private Optional<ContactIdentification1> BuyerContactPerson;
	private Optional<ContactIdentification1> SellerContactPerson;
	private Optional<ContactIdentification1> BuyerBankContactPerson;
	private Optional<ContactIdentification1> SellerBankContactPerson;
	private Optional<ContactIdentification3> OtherBankContactPerson;
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

	public ReportType1 getReportPurpose() {
		return ReportPurpose;
	}

	public void setReportPurpose(ReportType1 ReportPurpose) {
		this.ReportPurpose = ReportPurpose;
	}

	public Baseline3 getPushedThroughBaseline() {
		return PushedThroughBaseline;
	}

	public void setPushedThroughBaseline(Baseline3 PushedThroughBaseline) {
		this.PushedThroughBaseline = PushedThroughBaseline;
	}

	public Optional<ContactIdentification1> getBuyerContactPerson() {
		return BuyerContactPerson;
	}

	public void setBuyerContactPerson(
			Optional<ContactIdentification1> BuyerContactPerson) {
		this.BuyerContactPerson = BuyerContactPerson;
	}

	public Optional<ContactIdentification1> getSellerContactPerson() {
		return SellerContactPerson;
	}

	public void setSellerContactPerson(
			Optional<ContactIdentification1> SellerContactPerson) {
		this.SellerContactPerson = SellerContactPerson;
	}

	public Optional<ContactIdentification1> getBuyerBankContactPerson() {
		return BuyerBankContactPerson;
	}

	public void setBuyerBankContactPerson(
			Optional<ContactIdentification1> BuyerBankContactPerson) {
		this.BuyerBankContactPerson = BuyerBankContactPerson;
	}

	public Optional<ContactIdentification1> getSellerBankContactPerson() {
		return SellerBankContactPerson;
	}

	public void setSellerBankContactPerson(
			Optional<ContactIdentification1> SellerBankContactPerson) {
		this.SellerBankContactPerson = SellerBankContactPerson;
	}

	public Optional<ContactIdentification3> getOtherBankContactPerson() {
		return OtherBankContactPerson;
	}

	public void setOtherBankContactPerson(
			Optional<ContactIdentification3> OtherBankContactPerson) {
		this.OtherBankContactPerson = OtherBankContactPerson;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}