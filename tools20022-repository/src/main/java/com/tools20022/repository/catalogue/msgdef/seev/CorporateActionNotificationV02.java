package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNotificationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CorporateActionNotification2;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation22;
import com.tools20022.repository.dict.choice.AccountIdentification12Choice;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes17;
import com.tools20022.repository.dict.msg.CorporateAction5;
import com.tools20022.repository.dict.msg.CorporateActionOption19;
import com.tools20022.repository.dict.msg.CorporateActionNarrative11;
import com.tools20022.repository.dict.choice.PartyIdentification47Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
 * Duplicate), using the relevant elements in the business application header
 * (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionNotificationV01.class)
@NextVersion(CorporateActionNotificationV03.class)
public class CorporateActionNotificationV02 {

	private CorporateActionNotification2 NotificationGeneralInformation;
	private Optional<DocumentIdentification15> PreviousNotificationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation22 CorporateActionGeneralInformation;
	private AccountIdentification12Choice AccountDetails;
	private Optional<FinancialInstrumentAttributes17> IntermediateSecurity;
	private Optional<CorporateAction5> CorporateActionDetails;
	private Optional<CorporateActionOption19> CorporateActionOptionDetails;
	private Optional<CorporateActionNarrative11> AdditionalInformation;
	private Optional<PartyIdentification47Choice> IssuerAgent;
	private Optional<PartyIdentification47Choice> PayingAgent;
	private Optional<PartyIdentification47Choice> SubPayingAgent;
	private Optional<PartyIdentification47Choice> Registrar;
	private Optional<PartyIdentification47Choice> ResellingAgent;
	private Optional<PartyIdentification47Choice> PhysicalSecuritiesAgent;
	private Optional<PartyIdentification47Choice> DropAgent;
	private Optional<PartyIdentification47Choice> SolicitationAgent;
	private Optional<PartyIdentification47Choice> InformationAgent;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public CorporateActionGeneralInformation22 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation22 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification12Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification12Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<FinancialInstrumentAttributes17> getIntermediateSecurity() {
		return IntermediateSecurity;
	}

	public void setIntermediateSecurity(
			Optional<FinancialInstrumentAttributes17> IntermediateSecurity) {
		this.IntermediateSecurity = IntermediateSecurity;
	}

	public Optional<CorporateAction5> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction5> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption19> getCorporateActionOptionDetails() {
		return CorporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(
			Optional<CorporateActionOption19> CorporateActionOptionDetails) {
		this.CorporateActionOptionDetails = CorporateActionOptionDetails;
	}

	public Optional<CorporateActionNarrative11> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative11> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<PartyIdentification47Choice> getIssuerAgent() {
		return IssuerAgent;
	}

	public void setIssuerAgent(Optional<PartyIdentification47Choice> IssuerAgent) {
		this.IssuerAgent = IssuerAgent;
	}

	public Optional<PartyIdentification47Choice> getPayingAgent() {
		return PayingAgent;
	}

	public void setPayingAgent(Optional<PartyIdentification47Choice> PayingAgent) {
		this.PayingAgent = PayingAgent;
	}

	public Optional<PartyIdentification47Choice> getSubPayingAgent() {
		return SubPayingAgent;
	}

	public void setSubPayingAgent(
			Optional<PartyIdentification47Choice> SubPayingAgent) {
		this.SubPayingAgent = SubPayingAgent;
	}

	public Optional<PartyIdentification47Choice> getRegistrar() {
		return Registrar;
	}

	public void setRegistrar(Optional<PartyIdentification47Choice> Registrar) {
		this.Registrar = Registrar;
	}

	public Optional<PartyIdentification47Choice> getResellingAgent() {
		return ResellingAgent;
	}

	public void setResellingAgent(
			Optional<PartyIdentification47Choice> ResellingAgent) {
		this.ResellingAgent = ResellingAgent;
	}

	public Optional<PartyIdentification47Choice> getPhysicalSecuritiesAgent() {
		return PhysicalSecuritiesAgent;
	}

	public void setPhysicalSecuritiesAgent(
			Optional<PartyIdentification47Choice> PhysicalSecuritiesAgent) {
		this.PhysicalSecuritiesAgent = PhysicalSecuritiesAgent;
	}

	public Optional<PartyIdentification47Choice> getDropAgent() {
		return DropAgent;
	}

	public void setDropAgent(Optional<PartyIdentification47Choice> DropAgent) {
		this.DropAgent = DropAgent;
	}

	public Optional<PartyIdentification47Choice> getSolicitationAgent() {
		return SolicitationAgent;
	}

	public void setSolicitationAgent(
			Optional<PartyIdentification47Choice> SolicitationAgent) {
		this.SolicitationAgent = SolicitationAgent;
	}

	public Optional<PartyIdentification47Choice> getInformationAgent() {
		return InformationAgent;
	}

	public void setInformationAgent(
			Optional<PartyIdentification47Choice> InformationAgent) {
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