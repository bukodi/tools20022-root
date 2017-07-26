package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV08;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionPreliminaryAdviceType2;
import com.tools20022.repository.dict.msg.DocumentIdentification31;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification32;
import com.tools20022.repository.dict.msg.CorporateActionEventReference3;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason3;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation84;
import com.tools20022.repository.dict.choice.AccountIdentification32Choice;
import com.tools20022.repository.dict.msg.CorporateAction32;
import com.tools20022.repository.dict.msg.CorporateActionOption115;
import com.tools20022.repository.dict.msg.CorporateActionNarrative28;
import com.tools20022.repository.dict.choice.PartyIdentification71Choice;
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
@PreviousVersion(CorporateActionMovementPreliminaryAdviceV06.class)
@NextVersion(CorporateActionMovementPreliminaryAdviceV08.class)
public class CorporateActionMovementPreliminaryAdviceV07 {

	private Optional<Pagination> Pagination;
	private CorporateActionPreliminaryAdviceType2 MovementPreliminaryAdviceGeneralInformation;
	private Optional<DocumentIdentification31> PreviousMovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification31> NotificationIdentification;
	private Optional<DocumentIdentification31> MovementConfirmationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification32> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference3> EventsLinkage;
	private Optional<CorporateActionReversalReason3> ReversalReason;
	private CorporateActionGeneralInformation84 CorporateActionGeneralInformation;
	private AccountIdentification32Choice AccountDetails;
	private Optional<CorporateAction32> CorporateActionDetails;
	private Optional<CorporateActionOption115> CorporateActionMovementDetails;
	private Optional<CorporateActionNarrative28> AdditionalInformation;
	private Optional<PartyIdentification71Choice> IssuerAgent;
	private Optional<PartyIdentification71Choice> PayingAgent;
	private Optional<PartyIdentification71Choice> SubPayingAgent;
	private Optional<PartyIdentification71Choice> Registrar;
	private Optional<PartyIdentification71Choice> ResellingAgent;
	private Optional<PartyIdentification71Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification71Choice> DropAgent;
	private Optional<PartyIdentification71Choice> SolicitationAgent;
	private Optional<PartyIdentification71Choice> InformationAgent;
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

	public Optional<DocumentIdentification31> getPreviousMovementPreliminaryAdviceIdentification() {
		return PreviousMovementPreliminaryAdviceIdentification;
	}

	public void setPreviousMovementPreliminaryAdviceIdentification(
			Optional<DocumentIdentification31> PreviousMovementPreliminaryAdviceIdentification) {
		this.PreviousMovementPreliminaryAdviceIdentification = PreviousMovementPreliminaryAdviceIdentification;
	}

	public Optional<DocumentIdentification31> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification31> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification31> getMovementConfirmationIdentification() {
		return MovementConfirmationIdentification;
	}

	public void setMovementConfirmationIdentification(
			Optional<DocumentIdentification31> MovementConfirmationIdentification) {
		this.MovementConfirmationIdentification = MovementConfirmationIdentification;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			Optional<DocumentIdentification9> InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public Optional<DocumentIdentification32> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification32> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public Optional<CorporateActionEventReference3> getEventsLinkage() {
		return EventsLinkage;
	}

	public void setEventsLinkage(
			Optional<CorporateActionEventReference3> EventsLinkage) {
		this.EventsLinkage = EventsLinkage;
	}

	public Optional<CorporateActionReversalReason3> getReversalReason() {
		return ReversalReason;
	}

	public void setReversalReason(
			Optional<CorporateActionReversalReason3> ReversalReason) {
		this.ReversalReason = ReversalReason;
	}

	public CorporateActionGeneralInformation84 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation84 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification32Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification32Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction32> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction32> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption115> getCorporateActionMovementDetails() {
		return CorporateActionMovementDetails;
	}

	public void setCorporateActionMovementDetails(
			Optional<CorporateActionOption115> CorporateActionMovementDetails) {
		this.CorporateActionMovementDetails = CorporateActionMovementDetails;
	}

	public Optional<CorporateActionNarrative28> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative28> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification71Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification71Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification71Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification71Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification71Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification71Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification71Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification71Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification71Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification71Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification71Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification71Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification71Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification71Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification71Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification71Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification71Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification71Choice> InformationAgent) {
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