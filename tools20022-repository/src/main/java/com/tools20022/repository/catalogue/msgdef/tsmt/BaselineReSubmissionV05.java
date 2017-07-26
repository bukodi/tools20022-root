package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.BaselineReSubmissionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Baseline5;
import com.tools20022.repository.dict.msg.ContactIdentification1;
import com.tools20022.repository.dict.choice.BankContactPerson1Choice;
import com.tools20022.repository.dict.msg.ContactIdentification3;

/**
 * Scope The BaselineReSubmission message is sent by either the counterparty or
 * the initiator of a transaction (baseline) to the matching application. This
 * message is used by the counterparty to respond on the registration of a
 * push-through transaction in the matching application or by the initiator or
 * counterparty to re-send earlier mis-matched baseline information. Usage The
 * BaselineReSubmission message can be sent by the counterparty of a transaction
 * to the matching application in response to a FullPushThroughReport message
 * received from the matching application conveying the details of an
 * InitialBaselineSubmission message. The objective of the BaselineReSubmission
 * message sent in the outlined scenario is to achieve a successful match of two
 * baseline initiation messages in order to establish a transaction in the
 * matching application. or The BaselineReSubmission message can be sent by the
 * initiator of a transaction to the matching application in response to a
 * BaselineMatchReport message indicating mis-matches. The objective of the
 * BaselineReSubmission message sent in the outlined scenario is to correct an
 * InitialBaselineSubmission or BaselineReSubmission message submitted earlier
 * in order to achieve the establishment of a transaction in the matching
 * application. or The BaselineReSubmission message can be sent by the
 * counterparty of a transaction to the matching application in response to a
 * BaselineMatchReport message indicating mis-matches. The objective of the
 * BaselineReSubmission message sent in the outlined scenario is to correct a
 * BaselineReSubmission message submitted earlier in order to achieve the
 * establishment of a transaction in the matching application.
 */
@PreviousVersion(BaselineReSubmissionV04.class)
public class BaselineReSubmissionV05 {

	private MessageIdentification1 SubmissionIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private Baseline5 Baseline;
	private Optional<ContactIdentification1> BuyerContactPerson;
	private Optional<ContactIdentification1> SellerContactPerson;
	private BankContactPerson1Choice BankContactPerson;
	private Optional<ContactIdentification3> OtherBankContactPerson;

	public MessageIdentification1 getSubmissionIdentification() {
		return SubmissionIdentification;
	}

	public void setSubmissionIdentification(
			MessageIdentification1 SubmissionIdentification) {
		this.SubmissionIdentification = SubmissionIdentification;
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

	public Baseline5 getBaseline() {
		return Baseline;
	}

	public void setBaseline(Baseline5 Baseline) {
		this.Baseline = Baseline;
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

	public BankContactPerson1Choice getBankContactPerson() {
		return BankContactPerson;
	}

	public void setBankContactPerson(BankContactPerson1Choice BankContactPerson) {
		this.BankContactPerson = BankContactPerson;
	}

	public Optional<ContactIdentification3> getOtherBankContactPerson() {
		return OtherBankContactPerson;
	}

	public void setOtherBankContactPerson(
			Optional<ContactIdentification3> OtherBankContactPerson) {
		this.OtherBankContactPerson = OtherBankContactPerson;
	}
}