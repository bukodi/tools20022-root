package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Contract;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.entity.RegulatoryReportingRole;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.PriorityCode;
import com.tools20022.repository.dict.entity.StatusReason;
import com.tools20022.repository.dict.entity.PaymentTerms;
import com.tools20022.repository.dict.codeset.CommunicationMethodCode;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.Document;

/**
 * Contract registered for regulatory purpose by a registration agent for the
 * journaling of payments made against the contract.
 */
public class RegisteredContract extends Contract
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private GenericIdentification Certificate;
	private CashBalance ContractBalance;
	private RegulatoryReportingRole ReportingParty;
	private Max35Text Identification;
	private ISODate DeliveryDate;
	private RegulatoryReportingRole RegistrationAgent;
	private RegulatoryReportingRole ReceivingParty;
	private PriorityCode Priority;
	private ISODate RegistrationDate;
	private StatusReason ClosureReason;
	private ISODate ClosureDate;
	private PaymentTerms PaymentScheduleType;
	private ISODate SubmissionDate;
	private RegulatoryReportingRole SendingParty;
	private CommunicationMethodCode DeliveryMethod;
	private CommunicationMethodCode SubmissionMethod;
	private Payment RelatedPayment;
	private Document Attachment;

	public GenericIdentification getCertificate() {
		return Certificate;
	}

	public void setCertificate(GenericIdentification Certificate) {
		this.Certificate = Certificate;
	}

	public CashBalance getContractBalance() {
		return ContractBalance;
	}

	public void setContractBalance(CashBalance ContractBalance) {
		this.ContractBalance = ContractBalance;
	}

	public RegulatoryReportingRole getReportingParty() {
		return ReportingParty;
	}

	public void setReportingParty(RegulatoryReportingRole ReportingParty) {
		this.ReportingParty = ReportingParty;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public ISODate getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(ISODate DeliveryDate) {
		this.DeliveryDate = DeliveryDate;
	}

	public RegulatoryReportingRole getRegistrationAgent() {
		return RegistrationAgent;
	}

	public void setRegistrationAgent(RegulatoryReportingRole RegistrationAgent) {
		this.RegistrationAgent = RegistrationAgent;
	}

	public RegulatoryReportingRole getReceivingParty() {
		return ReceivingParty;
	}

	public void setReceivingParty(RegulatoryReportingRole ReceivingParty) {
		this.ReceivingParty = ReceivingParty;
	}

	public PriorityCode getPriority() {
		return Priority;
	}

	public void setPriority(PriorityCode Priority) {
		this.Priority = Priority;
	}

	public ISODate getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(ISODate RegistrationDate) {
		this.RegistrationDate = RegistrationDate;
	}

	public StatusReason getClosureReason() {
		return ClosureReason;
	}

	public void setClosureReason(StatusReason ClosureReason) {
		this.ClosureReason = ClosureReason;
	}

	public ISODate getClosureDate() {
		return ClosureDate;
	}

	public void setClosureDate(ISODate ClosureDate) {
		this.ClosureDate = ClosureDate;
	}

	public PaymentTerms getPaymentScheduleType() {
		return PaymentScheduleType;
	}

	public void setPaymentScheduleType(PaymentTerms PaymentScheduleType) {
		this.PaymentScheduleType = PaymentScheduleType;
	}

	public ISODate getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(ISODate SubmissionDate) {
		this.SubmissionDate = SubmissionDate;
	}

	public RegulatoryReportingRole getSendingParty() {
		return SendingParty;
	}

	public void setSendingParty(RegulatoryReportingRole SendingParty) {
		this.SendingParty = SendingParty;
	}

	public CommunicationMethodCode getDeliveryMethod() {
		return DeliveryMethod;
	}

	public void setDeliveryMethod(CommunicationMethodCode DeliveryMethod) {
		this.DeliveryMethod = DeliveryMethod;
	}

	public CommunicationMethodCode getSubmissionMethod() {
		return SubmissionMethod;
	}

	public void setSubmissionMethod(CommunicationMethodCode SubmissionMethod) {
		this.SubmissionMethod = SubmissionMethod;
	}

	public Payment getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(Payment RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}

	public Document getAttachment() {
		return Attachment;
	}

	public void setAttachment(Document Attachment) {
		this.Attachment = Attachment;
	}
}