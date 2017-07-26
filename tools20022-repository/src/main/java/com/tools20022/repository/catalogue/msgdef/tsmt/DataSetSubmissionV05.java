package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.DataSetSubmissionV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.DataSetSubmissionReferences3;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.InstructionType3;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.CommercialDataSet5;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransportDataSet5;
import com.tools20022.repository.dict.msg.InsuranceDataSet1;
import com.tools20022.repository.dict.msg.CertificateDataSet2;
import com.tools20022.repository.dict.msg.OtherCertificateDataSet2;

/**
 * Scope The DataSetSubmission message is sent by a party involved in the
 * transaction to the matching application. This message is used to trigger
 * either a match or a pre-match of the information submitted with the message.
 * Usage The DataSetSubmission message can be sent by either party with the
 * instruction pre-match. In the outlined scenario, the matching application
 * will compare the data set(s) conveyed by the DataSetSubmission message with
 * the established baseline and report the matching result to the requester of
 * the data set pre-match by sending a DataSetMatchReport message. or The
 * DataSetSubmission message can be sent by the party specified in the baseline
 * as data set submitter with the instruction match. In the outlined scenario,
 * the matching application will compare the data set(s) conveyed by the
 * DataSetSubmission message with the established baseline and report the
 * matching result to - the parties involved in a transaction established in the
 * push-through mode, or - the initiator of a transaction established in the
 * lodge mode. The DataSetSubmission message can be used to submit multiple data
 * sets for multiple transactions (baselines) at the same time. However, all
 * transactions (baselines) covered by the message must be for the same parties,
 * that is transaction initiator and counterparty, as well as for the same buyer
 * and seller. The DataSetSubmission message consists of data reflecting trade
 * information related to the purchasing agreement covered by the
 * transaction(s), for example shipment date, invoice amount.
 */
@PreviousVersion(DataSetSubmissionV04.class)
public class DataSetSubmissionV05 {

	private MessageIdentification1 SubmissionIdentification;
	private DataSetSubmissionReferences3 RelatedTransactionReferences;
	private SimpleIdentificationInformation CommonSubmissionReference;
	private InstructionType3 Instruction;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private Optional<CommercialDataSet5> CommercialDataSet;
	private Optional<TransportDataSet5> TransportDataSet;
	private Optional<InsuranceDataSet1> InsuranceDataSet;
	private Optional<CertificateDataSet2> CertificateDataSet;
	private Optional<OtherCertificateDataSet2> OtherCertificateDataSet;

	public MessageIdentification1 getSubmissionIdentification() {
		return SubmissionIdentification;
	}

	public void setSubmissionIdentification(
			MessageIdentification1 SubmissionIdentification) {
		this.SubmissionIdentification = SubmissionIdentification;
	}

	public DataSetSubmissionReferences3 getRelatedTransactionReferences() {
		return RelatedTransactionReferences;
	}

	public void setRelatedTransactionReferences(
			DataSetSubmissionReferences3 RelatedTransactionReferences) {
		this.RelatedTransactionReferences = RelatedTransactionReferences;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return CommonSubmissionReference;
	}

	public void setCommonSubmissionReference(
			SimpleIdentificationInformation CommonSubmissionReference) {
		this.CommonSubmissionReference = CommonSubmissionReference;
	}

	public InstructionType3 getInstruction() {
		return Instruction;
	}

	public void setInstruction(InstructionType3 Instruction) {
		this.Instruction = Instruction;
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

	public Optional<CommercialDataSet5> getCommercialDataSet() {
		return CommercialDataSet;
	}

	public void setCommercialDataSet(
			Optional<CommercialDataSet5> CommercialDataSet) {
		this.CommercialDataSet = CommercialDataSet;
	}

	public Optional<TransportDataSet5> getTransportDataSet() {
		return TransportDataSet;
	}

	public void setTransportDataSet(Optional<TransportDataSet5> TransportDataSet) {
		this.TransportDataSet = TransportDataSet;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return InsuranceDataSet;
	}

	public void setInsuranceDataSet(Optional<InsuranceDataSet1> InsuranceDataSet) {
		this.InsuranceDataSet = InsuranceDataSet;
	}

	public Optional<CertificateDataSet2> getCertificateDataSet() {
		return CertificateDataSet;
	}

	public void setCertificateDataSet(
			Optional<CertificateDataSet2> CertificateDataSet) {
		this.CertificateDataSet = CertificateDataSet;
	}

	public Optional<OtherCertificateDataSet2> getOtherCertificateDataSet() {
		return OtherCertificateDataSet;
	}

	public void setOtherCertificateDataSet(
			Optional<OtherCertificateDataSet2> OtherCertificateDataSet) {
		this.OtherCertificateDataSet = OtherCertificateDataSet;
	}
}