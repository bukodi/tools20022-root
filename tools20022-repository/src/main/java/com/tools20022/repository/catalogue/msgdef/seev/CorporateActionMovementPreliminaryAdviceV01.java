package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.CorporateActionPreliminaryAdviceType1;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation3;
import com.tools20022.repository.dict.choice.AccountIdentification7Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption10;
import com.tools20022.repository.dict.msg.CorporateActionNarrative6;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends the CorporateActionMovementPreliminaryAdvice
 * message to an account owner or its designated agent to pre-advise upcoming
 * posting or reversal of securities and/or cash postings. Usage The message may
 * also be used to: - re-send a message previously sent (the sub-function of the
 * message is Duplicate), - provide a third party with a copy of a message for
 * information (the sub-function of the message is Copy), - re-send to a third
 * party a copy of a message for information (the sub-function of the message is
 * Copy Duplicate). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is
 * reversed engineered from ISO 15022. Both standards will coexist for a certain
 * number of years. Until this coexistence period ends, the usage of certain
 * data types is restricted to ensure interoperability between ISO 15022 and
 * 20022 users. Compliance to these rules is mandatory in a coexistence
 * environment. The coexistence restrictions are described in a Textual Rule
 * linked to the Message Items they concern. These coexistence textual rules are
 * clearly identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionMovementPreliminaryAdviceV02.class)
public class CorporateActionMovementPreliminaryAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification11 Identification;
	private CorporateActionPreliminaryAdviceType1 MovementPreliminaryAdviceGeneralInformation;
	private Optional<DocumentIdentification15> PreviousMovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification15> NotificationIdentification;
	private Optional<DocumentIdentification15> MovementConfirmationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private Optional<CorporateActionReversalReason1> ReversalReason;
	private CorporateActionGeneralInformation3 CorporateActionGeneralInformation;
	private AccountIdentification7Choice AccountDetails;
	private Optional<CorporateActionOption10> CorporateActionMovementDetails;
	private Optional<CorporateActionNarrative6> AdditionalInformation;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<PartyIdentification10Choice> IssuerAgent;
	private Optional<PartyIdentification10Choice> PayingAgent;
	private Optional<PartyIdentification10Choice> SubPayingAgent;
	private Optional<PartyIdentification10Choice> Registrar;
	private Optional<PartyIdentification10Choice> ResellingAgent;
	private Optional<PartyIdentification10Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification10Choice> DropAgent;
	private Optional<PartyIdentification10Choice> SolicitationAgent;
	private Optional<PartyIdentification10Choice> InformationAgent;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public CorporateActionPreliminaryAdviceType1 getMovementPreliminaryAdviceGeneralInformation() {
		return MovementPreliminaryAdviceGeneralInformation;
	}

	public void setMovementPreliminaryAdviceGeneralInformation(
			CorporateActionPreliminaryAdviceType1 MovementPreliminaryAdviceGeneralInformation) {
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

	public CorporateActionGeneralInformation3 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation3 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification7Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification7Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateActionOption10> getCorporateActionMovementDetails() {
		return CorporateActionMovementDetails;
	}

	public void setCorporateActionMovementDetails(
			Optional<CorporateActionOption10> CorporateActionMovementDetails) {
		this.CorporateActionMovementDetails = CorporateActionMovementDetails;
	}

	public Optional<CorporateActionNarrative6> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative6> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
	}

	public Optional<PartyIdentification10Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification10Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification10Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification10Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification10Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification10Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification10Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification10Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification10Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification10Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification10Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification10Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification10Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification10Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification10Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification10Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification10Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification10Choice> InformationAgent) {
		this.InformationAgent = InformationAgent;
	}

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}