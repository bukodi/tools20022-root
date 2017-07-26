package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.repository.catalogue.msgdef.tsmt.ForwardDataSetSubmissionReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.DataSetSubmissionReferences4;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.CommercialDataSet5;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransportDataSet5;
import com.tools20022.repository.dict.msg.InsuranceDataSet1;
import com.tools20022.repository.dict.msg.CertificateDataSet2;
import com.tools20022.repository.dict.msg.OtherCertificateDataSet2;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The ForwardDataSetSubmissionReport message is sent by the matching
 * application to the counterparty(ies) of the submitter of data sets. This
 * message is used to pass on information related to the purchasing agreement(s)
 * covered by the transaction(s) referred to in the message. Usage The
 * ForwardDataSetSubmission message can be sent by the matching application to
 * forward the details of a DataSetSubmission message that it has obtained.
 */
@PreviousVersion(ForwardDataSetSubmissionReportV04.class)
public class ForwardDataSetSubmissionReportV05 {

	private MessageIdentification1 ReportIdentification;
	private DataSetSubmissionReferences4 RelatedTransactionReferences;
	private SimpleIdentificationInformation CommonSubmissionReference;
	private BICIdentification1 Submitter;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private Optional<CommercialDataSet5> CommercialDataSet;
	private Optional<TransportDataSet5> TransportDataSet;
	private Optional<InsuranceDataSet1> InsuranceDataSet;
	private Optional<CertificateDataSet2> CertificateDataSet;
	private Optional<OtherCertificateDataSet2> OtherCertificateDataSet;
	private Optional<PendingActivity2> RequestForAction;

	public MessageIdentification1 getReportIdentification() {
		return ReportIdentification;
	}

	public void setReportIdentification(
			MessageIdentification1 ReportIdentification) {
		this.ReportIdentification = ReportIdentification;
	}

	public DataSetSubmissionReferences4 getRelatedTransactionReferences() {
		return RelatedTransactionReferences;
	}

	public void setRelatedTransactionReferences(
			DataSetSubmissionReferences4 RelatedTransactionReferences) {
		this.RelatedTransactionReferences = RelatedTransactionReferences;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return CommonSubmissionReference;
	}

	public void setCommonSubmissionReference(
			SimpleIdentificationInformation CommonSubmissionReference) {
		this.CommonSubmissionReference = CommonSubmissionReference;
	}

	public BICIdentification1 getSubmitter() {
		return Submitter;
	}

	public void setSubmitter(BICIdentification1 Submitter) {
		this.Submitter = Submitter;
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

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}