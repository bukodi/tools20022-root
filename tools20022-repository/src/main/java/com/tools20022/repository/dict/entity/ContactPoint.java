package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.InvestmentFund;
import com.tools20022.repository.dict.datatype.AnyBICIdentifier;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.ReportingService;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.ProxyAppointmentCondition;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.entity.VotingCondition;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.AttendanceCard;
import com.tools20022.repository.dict.entity.InvestmentFundClassProcessingCharacteristics;

/**
 * Number, physical or virtual address, used for communication.
 */
public class ContactPoint {

	private GenericIdentification Identification;
	private InvestmentFund RelatedInvestmentFund;
	private AnyBICIdentifier BICAddress;
	private Party RelatedParty;
	private CorporateActionEvent RelatedCorporateActionEvent;
	private ReportingService RelatedReportingService;
	private Document StoredDocument;
	private PaymentObligation RemittanceRelatedPayment;
	private ProxyAppointmentCondition RelatedProxyAppointment;
	private Meeting ContactPointForMeeting;
	private VotingCondition ContactPointForVote;
	private ContactPoint MainContact;
	private ContactPoint ReturnAddress;
	private PaymentProcessing RelatedPayment;
	private YesNoIndicator TemporaryIndicator;
	private AttendanceCard DeliveredAttendanceCard;
	private InvestmentFundClassProcessingCharacteristics InvestmentFundClassProcessing;

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}

	public InvestmentFund getRelatedInvestmentFund() {
		return RelatedInvestmentFund;
	}

	public void setRelatedInvestmentFund(InvestmentFund RelatedInvestmentFund) {
		this.RelatedInvestmentFund = RelatedInvestmentFund;
	}

	public AnyBICIdentifier getBICAddress() {
		return BICAddress;
	}

	public void setBICAddress(AnyBICIdentifier BICAddress) {
		this.BICAddress = BICAddress;
	}

	public Party getRelatedParty() {
		return RelatedParty;
	}

	public void setRelatedParty(Party RelatedParty) {
		this.RelatedParty = RelatedParty;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return RelatedCorporateActionEvent;
	}

	public void setRelatedCorporateActionEvent(
			CorporateActionEvent RelatedCorporateActionEvent) {
		this.RelatedCorporateActionEvent = RelatedCorporateActionEvent;
	}

	public ReportingService getRelatedReportingService() {
		return RelatedReportingService;
	}

	public void setRelatedReportingService(
			ReportingService RelatedReportingService) {
		this.RelatedReportingService = RelatedReportingService;
	}

	public Document getStoredDocument() {
		return StoredDocument;
	}

	public void setStoredDocument(Document StoredDocument) {
		this.StoredDocument = StoredDocument;
	}

	public PaymentObligation getRemittanceRelatedPayment() {
		return RemittanceRelatedPayment;
	}

	public void setRemittanceRelatedPayment(
			PaymentObligation RemittanceRelatedPayment) {
		this.RemittanceRelatedPayment = RemittanceRelatedPayment;
	}

	public ProxyAppointmentCondition getRelatedProxyAppointment() {
		return RelatedProxyAppointment;
	}

	public void setRelatedProxyAppointment(
			ProxyAppointmentCondition RelatedProxyAppointment) {
		this.RelatedProxyAppointment = RelatedProxyAppointment;
	}

	public Meeting getContactPointForMeeting() {
		return ContactPointForMeeting;
	}

	public void setContactPointForMeeting(Meeting ContactPointForMeeting) {
		this.ContactPointForMeeting = ContactPointForMeeting;
	}

	public VotingCondition getContactPointForVote() {
		return ContactPointForVote;
	}

	public void setContactPointForVote(VotingCondition ContactPointForVote) {
		this.ContactPointForVote = ContactPointForVote;
	}

	public ContactPoint getMainContact() {
		return MainContact;
	}

	public void setMainContact(ContactPoint MainContact) {
		this.MainContact = MainContact;
	}

	public ContactPoint getReturnAddress() {
		return ReturnAddress;
	}

	public void setReturnAddress(ContactPoint ReturnAddress) {
		this.ReturnAddress = ReturnAddress;
	}

	public PaymentProcessing getRelatedPayment() {
		return RelatedPayment;
	}

	public void setRelatedPayment(PaymentProcessing RelatedPayment) {
		this.RelatedPayment = RelatedPayment;
	}

	public YesNoIndicator getTemporaryIndicator() {
		return TemporaryIndicator;
	}

	public void setTemporaryIndicator(YesNoIndicator TemporaryIndicator) {
		this.TemporaryIndicator = TemporaryIndicator;
	}

	public AttendanceCard getDeliveredAttendanceCard() {
		return DeliveredAttendanceCard;
	}

	public void setDeliveredAttendanceCard(
			AttendanceCard DeliveredAttendanceCard) {
		this.DeliveredAttendanceCard = DeliveredAttendanceCard;
	}

	public InvestmentFundClassProcessingCharacteristics getInvestmentFundClassProcessing() {
		return InvestmentFundClassProcessing;
	}

	public void setInvestmentFundClassProcessing(
			InvestmentFundClassProcessingCharacteristics InvestmentFundClassProcessing) {
		this.InvestmentFundClassProcessing = InvestmentFundClassProcessing;
	}
}