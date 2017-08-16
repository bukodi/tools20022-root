package com.tools20022.repository.catalogue.msgdef.tsmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.tsmt.ForwardDataSetSubmissionReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.DataSetSubmissionReferences4;
import com.tools20022.repository.dict.msg.SimpleIdentificationInformation;
import com.tools20022.repository.dict.msg.BICIdentification1;
import com.tools20022.repository.dict.msg.CommercialDataSet3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransportDataSet3;
import com.tools20022.repository.dict.msg.InsuranceDataSet1;
import com.tools20022.repository.dict.msg.CertificateDataSet1;
import com.tools20022.repository.dict.msg.OtherCertificateDataSet1;
import com.tools20022.repository.dict.msg.PendingActivity2;

/**
 * Scope The ForwardDataSetSubmissionReport message is sent by the matching
 * application to the counterparty(ies) of the submitter of data sets. This
 * message is used to pass on information related to the purchasing agreement(s)
 * covered by the transaction(s) referred to in the message. Usage The
 * ForwardDataSetSubmission message can be sent by the matching application to
 * forward the details of a DataSetSubmission message that it has obtained.
 */
@NextVersion(ForwardDataSetSubmissionReportV04.class)
public class ForwardDataSetSubmissionReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 ReportIdentification;
	private DataSetSubmissionReferences4 RelatedTransactionReferences;
	private SimpleIdentificationInformation CommonSubmissionReference;
	private BICIdentification1 Submitter;
	private BICIdentification1 BuyerBank;
	private BICIdentification1 SellerBank;
	private Optional<CommercialDataSet3> CommercialDataSet;
	private Optional<TransportDataSet3> TransportDataSet;
	private Optional<InsuranceDataSet1> InsuranceDataSet;
	private Optional<CertificateDataSet1> CertificateDataSet;
	private Optional<OtherCertificateDataSet1> OtherCertificateDataSet;
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

	public Optional<CommercialDataSet3> getCommercialDataSet() {
		return CommercialDataSet;
	}

	public void setCommercialDataSet(
			Optional<CommercialDataSet3> CommercialDataSet) {
		this.CommercialDataSet = CommercialDataSet;
	}

	public Optional<TransportDataSet3> getTransportDataSet() {
		return TransportDataSet;
	}

	public void setTransportDataSet(Optional<TransportDataSet3> TransportDataSet) {
		this.TransportDataSet = TransportDataSet;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return InsuranceDataSet;
	}

	public void setInsuranceDataSet(Optional<InsuranceDataSet1> InsuranceDataSet) {
		this.InsuranceDataSet = InsuranceDataSet;
	}

	public Optional<CertificateDataSet1> getCertificateDataSet() {
		return CertificateDataSet;
	}

	public void setCertificateDataSet(
			Optional<CertificateDataSet1> CertificateDataSet) {
		this.CertificateDataSet = CertificateDataSet;
	}

	public Optional<OtherCertificateDataSet1> getOtherCertificateDataSet() {
		return OtherCertificateDataSet;
	}

	public void setOtherCertificateDataSet(
			Optional<OtherCertificateDataSet1> OtherCertificateDataSet) {
		this.OtherCertificateDataSet = OtherCertificateDataSet;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return RequestForAction;
	}

	public void setRequestForAction(Optional<PendingActivity2> RequestForAction) {
		this.RequestForAction = RequestForAction;
	}
}