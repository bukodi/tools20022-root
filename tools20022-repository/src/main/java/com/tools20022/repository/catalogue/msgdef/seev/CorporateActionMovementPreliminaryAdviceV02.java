package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementPreliminaryAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CorporateActionPreliminaryAdviceType1;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation23;
import com.tools20022.repository.dict.choice.AccountIdentification12Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption20;
import com.tools20022.repository.dict.msg.CorporateActionNarrative6;
import com.tools20022.repository.dict.choice.PartyIdentification46Choice;
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
@PreviousVersion(CorporateActionMovementPreliminaryAdviceV01.class)
@NextVersion(CorporateActionMovementPreliminaryAdviceV03.class)
public class CorporateActionMovementPreliminaryAdviceV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CorporateActionPreliminaryAdviceType1 MovementPreliminaryAdviceGeneralInformation;
	private Optional<DocumentIdentification15> PreviousMovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification15> NotificationIdentification;
	private Optional<DocumentIdentification15> MovementConfirmationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private Optional<CorporateActionReversalReason1> ReversalReason;
	private CorporateActionGeneralInformation23 CorporateActionGeneralInformation;
	private AccountIdentification12Choice AccountDetails;
	private Optional<CorporateActionOption20> CorporateActionMovementDetails;
	private Optional<CorporateActionNarrative6> AdditionalInformation;
	private Optional<PartyIdentification46Choice> IssuerAgent;
	private Optional<PartyIdentification46Choice> PayingAgent;
	private Optional<PartyIdentification46Choice> SubPayingAgent;
	private Optional<PartyIdentification46Choice> Registrar;
	private Optional<PartyIdentification46Choice> ResellingAgent;
	private Optional<PartyIdentification46Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification46Choice> DropAgent;
	private Optional<PartyIdentification46Choice> SolicitationAgent;
	private Optional<PartyIdentification46Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public CorporateActionGeneralInformation23 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation23 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification12Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification12Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateActionOption20> getCorporateActionMovementDetails() {
		return CorporateActionMovementDetails;
	}

	public void setCorporateActionMovementDetails(
			Optional<CorporateActionOption20> CorporateActionMovementDetails) {
		this.CorporateActionMovementDetails = CorporateActionMovementDetails;
	}

	public Optional<CorporateActionNarrative6> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative6> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification46Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification46Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification46Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification46Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification46Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification46Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification46Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification46Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification46Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification46Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification46Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification46Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification46Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification46Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification46Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification46Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification46Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification46Choice> InformationAgent) {
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