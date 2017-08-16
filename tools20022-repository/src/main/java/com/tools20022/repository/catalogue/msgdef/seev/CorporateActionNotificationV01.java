package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNotificationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.CorporateActionNotification2;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation11;
import com.tools20022.repository.dict.choice.AccountIdentification7Choice;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes3;
import com.tools20022.repository.dict.msg.CorporateAction3;
import com.tools20022.repository.dict.msg.CorporateActionOption3;
import com.tools20022.repository.dict.msg.CorporateActionNarrative11;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends the CorporateActionNotification message to an
 * account owner or its designated agent to notify details of a corporate action
 * event and optionally account information, eligible balance and entitlements.
 * It may also include possible elections or choices available to the account
 * owner. The account servicer can initially send the
 * CorporateActionNotification message as a preliminary advice, subsequently
 * replaced by another CorporateActionNotification message with complete or
 * confirmed information. It may also be sent to an account owner or its
 * designated agent, to remind of event details and/or of missing or incomplete
 * instructions for a corporate action event. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionNotificationV02.class)
public class CorporateActionNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification11 Identification;
	private CorporateActionNotification2 NotificationGeneralInformation;
	private Optional<DocumentIdentification15> PreviousNotificationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation11 CorporateActionGeneralInformation;
	private AccountIdentification7Choice AccountDetails;
	private Optional<FinancialInstrumentAttributes3> IntermediateSecurity;
	private Optional<CorporateAction3> CorporateActionDetails;
	private Optional<CorporateActionOption3> CorporateActionOptionDetails;
	private Optional<CorporateActionNarrative11> AdditionalInformation;
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

	public CorporateActionNotification2 getNotificationGeneralInformation() {
		return NotificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(
			CorporateActionNotification2 NotificationGeneralInformation) {
		this.NotificationGeneralInformation = NotificationGeneralInformation;
	}

	public Optional<DocumentIdentification15> getPreviousNotificationIdentification() {
		return PreviousNotificationIdentification;
	}

	public void setPreviousNotificationIdentification(
			Optional<DocumentIdentification15> PreviousNotificationIdentification) {
		this.PreviousNotificationIdentification = PreviousNotificationIdentification;
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

	public CorporateActionGeneralInformation11 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation11 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification7Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification7Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<FinancialInstrumentAttributes3> getIntermediateSecurity() {
		return IntermediateSecurity;
	}

	public void setIntermediateSecurity(
			Optional<FinancialInstrumentAttributes3> IntermediateSecurity) {
		this.IntermediateSecurity = IntermediateSecurity;
	}

	public Optional<CorporateAction3> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction3> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption3> getCorporateActionOptionDetails() {
		return CorporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(
			Optional<CorporateActionOption3> CorporateActionOptionDetails) {
		this.CorporateActionOptionDetails = CorporateActionOptionDetails;
	}

	public Optional<CorporateActionNarrative11> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative11> AdditionalInformation) {
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