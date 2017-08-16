package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.tsmt.InitialBaselineSubmissionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.tsmt.InitialBaselineSubmissionV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.InstructionType1;
import com.tools20022.repository.dict.msg.Baseline4;
import com.tools20022.repository.dict.msg.ContactIdentification1;
import java.util.Optional;
import com.tools20022.repository.dict.choice.BankContactPerson1Choice;
import com.tools20022.repository.dict.msg.ContactIdentification3;

/**
 * Scope The InitialBaselineSubmission message is sent by the initiator of a
 * transaction to the matching application. This message is used to initiate a
 * transaction. Usage The InitialBaselineSubmission message can be sent by a
 * party to register a transaction in the matching application. The message can
 * be submitted with either lodge or push-through instruction. When the
 * push-through instruction is present, the matching application acknowledges
 * the receipt of the message to the sender by sending an Acknowledgement
 * message, stores the submitted information and informs the counterparty about
 * the registration of the transaction by sending a FullPushThroughReport
 * message. With the BaselineReSubmission message the counterparty responds with
 * matching baseline information in order to establish the transaction
 * (baseline). When the lodge instruction is present, the matching application
 * acknowledges the receipt of the message to the sender by sending an
 * Acknowledgement message and stores the submitted information. No matching of
 * the submitted baseline data with other baseline information will take place.
 * For example the submission of an InitialBaselineSubmission message containing
 * a lodge instruction establishes the transaction (baseline) in the matching
 * application. The InitialBaselineSubmission message consists of data which
 * relates to the purchasing agreement covered by the transaction, for example
 * line item details, shipping details.
 */
@PreviousVersion(InitialBaselineSubmissionV03.class)
@NextVersion(InitialBaselineSubmissionV05.class)
public class InitialBaselineSubmissionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 SubmissionIdentification;
	private SimpleIdentificationInformation SubmitterTransactionReference;
	private InstructionType1 Instruction;
	private Baseline4 Baseline;
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

	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return SubmitterTransactionReference;
	}

	public void setSubmitterTransactionReference(
			SimpleIdentificationInformation SubmitterTransactionReference) {
		this.SubmitterTransactionReference = SubmitterTransactionReference;
	}

	public InstructionType1 getInstruction() {
		return Instruction;
	}

	public void setInstruction(InstructionType1 Instruction) {
		this.Instruction = Instruction;
	}

	public Baseline4 getBaseline() {
		return Baseline;
	}

	public void setBaseline(Baseline4 Baseline) {
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