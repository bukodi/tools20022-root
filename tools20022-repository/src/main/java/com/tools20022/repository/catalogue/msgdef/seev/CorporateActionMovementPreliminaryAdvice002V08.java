package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionPreliminaryAdviceType2;
import com.tools20022.repository.dict.msg.DocumentIdentification37;
import com.tools20022.repository.dict.msg.DocumentIdentification17;
import com.tools20022.repository.dict.msg.DocumentIdentification38;
import com.tools20022.repository.dict.msg.CorporateActionEventReference4;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason4;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation117;
import com.tools20022.repository.dict.choice.AccountIdentification36Choice;
import com.tools20022.repository.dict.msg.CorporateAction38;
import com.tools20022.repository.dict.msg.CorporateActionOption135;
import com.tools20022.repository.dict.msg.CorporateActionNarrative37;
import com.tools20022.repository.dict.choice.PartyIdentification104Choice;
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
 * header (BAH).
 */
public class CorporateActionMovementPreliminaryAdvice002V08
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<Pagination> Pagination;
	private CorporateActionPreliminaryAdviceType2 MovementPreliminaryAdviceGeneralInformation;
	private Optional<DocumentIdentification37> PreviousMovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification37> NotificationIdentification;
	private Optional<DocumentIdentification37> MovementConfirmationIdentification;
	private Optional<DocumentIdentification17> InstructionIdentification;
	private Optional<DocumentIdentification38> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference4> EventsLinkage;
	private Optional<CorporateActionReversalReason4> ReversalReason;
	private CorporateActionGeneralInformation117 CorporateActionGeneralInformation;
	private AccountIdentification36Choice AccountDetails;
	private Optional<CorporateAction38> CorporateActionDetails;
	private Optional<CorporateActionOption135> CorporateActionMovementDetails;
	private Optional<CorporateActionNarrative37> AdditionalInformation;
	private Optional<PartyIdentification104Choice> IssuerAgent;
	private Optional<PartyIdentification104Choice> PayingAgent;
	private Optional<PartyIdentification104Choice> SubPayingAgent;
	private Optional<PartyIdentification104Choice> Registrar;
	private Optional<PartyIdentification104Choice> ResellingAgent;
	private Optional<PartyIdentification104Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification104Choice> DropAgent;
	private Optional<PartyIdentification104Choice> SolicitationAgent;
	private Optional<PartyIdentification104Choice> InformationAgent;
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

	public Optional<DocumentIdentification37> getPreviousMovementPreliminaryAdviceIdentification() {
		return PreviousMovementPreliminaryAdviceIdentification;
	}

	public void setPreviousMovementPreliminaryAdviceIdentification(
			Optional<DocumentIdentification37> PreviousMovementPreliminaryAdviceIdentification) {
		this.PreviousMovementPreliminaryAdviceIdentification = PreviousMovementPreliminaryAdviceIdentification;
	}

	public Optional<DocumentIdentification37> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification37> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification37> getMovementConfirmationIdentification() {
		return MovementConfirmationIdentification;
	}

	public void setMovementConfirmationIdentification(
			Optional<DocumentIdentification37> MovementConfirmationIdentification) {
		this.MovementConfirmationIdentification = MovementConfirmationIdentification;
	}

	public Optional<DocumentIdentification17> getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			Optional<DocumentIdentification17> InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public Optional<DocumentIdentification38> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification38> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public Optional<CorporateActionEventReference4> getEventsLinkage() {
		return EventsLinkage;
	}

	public void setEventsLinkage(
			Optional<CorporateActionEventReference4> EventsLinkage) {
		this.EventsLinkage = EventsLinkage;
	}

	public Optional<CorporateActionReversalReason4> getReversalReason() {
		return ReversalReason;
	}

	public void setReversalReason(
			Optional<CorporateActionReversalReason4> ReversalReason) {
		this.ReversalReason = ReversalReason;
	}

	public CorporateActionGeneralInformation117 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation117 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification36Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification36Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction38> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction38> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption135> getCorporateActionMovementDetails() {
		return CorporateActionMovementDetails;
	}

	public void setCorporateActionMovementDetails(
			Optional<CorporateActionOption135> CorporateActionMovementDetails) {
		this.CorporateActionMovementDetails = CorporateActionMovementDetails;
	}

	public Optional<CorporateActionNarrative37> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative37> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification104Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(
			Optional<PartyIdentification104Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification104Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(
			Optional<PartyIdentification104Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification104Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification104Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification104Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification104Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification104Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification104Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification104Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification104Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification104Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification104Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification104Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification104Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification104Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification104Choice> InformationAgent) {
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