package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionPreliminaryAdviceType2;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation69;
import com.tools20022.repository.dict.choice.AccountIdentification23Choice;
import com.tools20022.repository.dict.msg.CorporateAction24;
import com.tools20022.repository.dict.msg.CorporateActionOption100;
import com.tools20022.repository.dict.msg.CorporateActionNarrative6;
import com.tools20022.repository.dict.choice.PartyIdentification40Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the CorporateActionMovementPreliminaryAdvice
 * message to an account owner or its designated agent to pre-advise upcoming
 * posting or reversal of securities and/or cash postings. Usage The message may
 * also be used to: - re-send a message previously sent (the sub-function of the
 * message is Duplicate), - provide a third party with a copy of a message for
 * information (the sub-function of the message is Copy), - re-send to a third
 * party a copy of a message for information (the sub-function of the message is
 * Copy Duplicate), using the relevant elements in the business application
 * header (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is
 * reversed engineered from ISO 15022. Both standards will coexist for a certain
 * number of years. Until this coexistence period ends, the usage of certain
 * data types is restricted to ensure interoperability between ISO 15022 and
 * 20022 users. Compliance to these rules is mandatory in a coexistence
 * environment. The coexistence restrictions are described in a Textual Rule
 * linked to the Message Items they concern. These coexistence textual rules are
 * clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionMovementPreliminaryAdviceV05.class)
@NextVersion(CorporateActionMovementPreliminaryAdviceV07.class)
public class CorporateActionMovementPreliminaryAdviceV06 {

	private Optional<Pagination> Pagination;
	private CorporateActionPreliminaryAdviceType2 MovementPreliminaryAdviceGeneralInformation;
	private Optional<DocumentIdentification15> PreviousMovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification15> NotificationIdentification;
	private Optional<DocumentIdentification15> MovementConfirmationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private Optional<CorporateActionReversalReason1> ReversalReason;
	private CorporateActionGeneralInformation69 CorporateActionGeneralInformation;
	private AccountIdentification23Choice AccountDetails;
	private Optional<CorporateAction24> CorporateActionDetails;
	private Optional<CorporateActionOption100> CorporateActionMovementDetails;
	private Optional<CorporateActionNarrative6> AdditionalInformation;
	private Optional<PartyIdentification40Choice> IssuerAgent;
	private Optional<PartyIdentification40Choice> PayingAgent;
	private Optional<PartyIdentification40Choice> SubPayingAgent;
	private Optional<PartyIdentification40Choice> Registrar;
	private Optional<PartyIdentification40Choice> ResellingAgent;
	private Optional<PartyIdentification40Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification40Choice> DropAgent;
	private Optional<PartyIdentification40Choice> SolicitationAgent;
	private Optional<PartyIdentification40Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<Pagination> getPagination() {
		return Pagination;
	}

	public void setPagination(Optional<Pagination> Pagination) {
		this.Pagination = Pagination;
	}

	public CorporateActionPreliminaryAdviceType2 getMovementPreliminaryAdviceGeneralInformation() {
		return MovementPreliminaryAdviceGeneralInformation;
	}

	public void setMovementPreliminaryAdviceGeneralInformation(
			CorporateActionPreliminaryAdviceType2 MovementPreliminaryAdviceGeneralInformation) {
		this.MovementPreliminaryAdviceGeneralInformation = MovementPreliminaryAdviceGeneralInformation;
	}

	public Optional<DocumentIdentification15> getPreviousMovementPreliminaryAdviceIdentification() {
		return PreviousMovementPreliminaryAdviceIdentification;
	}

	public void setPreviousMovementPreliminaryAdviceIdentification(
			Optional<DocumentIdentification15> PreviousMovementPreliminaryAdviceIdentification) {
		this.PreviousMovementPreliminaryAdviceIdentification = PreviousMovementPreliminaryAdviceIdentification;
	}

	public Optional<DocumentIdentification15> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification15> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification15> getMovementConfirmationIdentification() {
		return MovementConfirmationIdentification;
	}

	public void setMovementConfirmationIdentification(
			Optional<DocumentIdentification15> MovementConfirmationIdentification) {
		this.MovementConfirmationIdentification = MovementConfirmationIdentification;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			Optional<DocumentIdentification9> InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public Optional<DocumentIdentification13> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification13> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public Optional<CorporateActionEventReference1> getEventsLinkage() {
		return EventsLinkage;
	}

	public void setEventsLinkage(
			Optional<CorporateActionEventReference1> EventsLinkage) {
		this.EventsLinkage = EventsLinkage;
	}

	public Optional<CorporateActionReversalReason1> getReversalReason() {
		return ReversalReason;
	}

	public void setReversalReason(
			Optional<CorporateActionReversalReason1> ReversalReason) {
		this.ReversalReason = ReversalReason;
	}

	public CorporateActionGeneralInformation69 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation69 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification23Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification23Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction24> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction24> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption100> getCorporateActionMovementDetails() {
		return CorporateActionMovementDetails;
	}

	public void setCorporateActionMovementDetails(
			Optional<CorporateActionOption100> CorporateActionMovementDetails) {
		this.CorporateActionMovementDetails = CorporateActionMovementDetails;
	}

	public Optional<CorporateActionNarrative6> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative6> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification40Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification40Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification40Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification40Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification40Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification40Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification40Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification40Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification40Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification40Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification40Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification40Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification40Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification40Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification40Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification40Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification40Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification40Choice> InformationAgent) {
		this.InformationAgent = InformationAgent;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}