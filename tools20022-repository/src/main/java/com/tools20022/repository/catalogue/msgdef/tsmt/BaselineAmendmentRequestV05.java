package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.tsmt.BaselineAmendmentRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Baseline5;
import com.tools20022.repository.dict.msg.ContactIdentification1;
import com.tools20022.repository.dict.msg.ContactIdentification3;

/**
 * Scope The BaselineAmendmentRequest message is sent by a primary party
 * involved in a transaction to the matching application. The message is used to
 * request the amendment of an established baseline. Usage The
 * BaselineAmendmentRequest message may only be sent if the transaction is in
 * the state Established or Active. The BaselineAmendmentRequest message can be
 * sent to the matching application by one of the primary parties involved in a
 * transaction established in the push-through mode to request the amendment of
 * an established baseline. The matching application acknowledges the receipt of
 * the amendment request by sending a DeltaReport message to the submitter of
 * the BaselineAmendmentRequest message. It passes on the newly proposed
 * baseline to the counterparty by sending a FullPushThroughReport message, a
 * DeltaReport message and a pre-calculated BaselineReport message. The
 * counterparty is expected to either accept or reject the amendment request by
 * submitting an AmendmentAcceptance or AmendmentRejection message. or The
 * BaselineAmendmentRequest message can be sent by the party involved in a
 * transaction established in the lodge mode to the matching application to
 * amend an established baseline. The matching application amends the baseline
 * according to the BaselineAmendmentRequest message and confirms the execution
 * of the request by sending a DeltaReport and calculated BaselineReport message
 * to the requester of the amendment.
 */
@PreviousVersion(BaselineAmendmentRequestV04.class)
public class BaselineAmendmentRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 RequestIdentification;
	private SimpleIdentificationInformation TransactionIdentification;
	private Optional<SimpleIdentificationInformation> SubmitterTransactionReference;
	private Baseline5 Baseline;
	private Optional<ContactIdentification1> BuyerContactPerson;
	private Optional<ContactIdentification1> SellerContactPerson;
	private Optional<ContactIdentification1> BuyerBankContactPerson;
	private Optional<ContactIdentification1> SellerBankContactPerson;
	private Optional<ContactIdentification3> OtherBankContactPerson;

	public MessageIdentification1 getRequestIdentification() {
		return RequestIdentification;
	}

	public void setRequestIdentification(
			MessageIdentification1 RequestIdentification) {
		this.RequestIdentification = RequestIdentification;
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
}