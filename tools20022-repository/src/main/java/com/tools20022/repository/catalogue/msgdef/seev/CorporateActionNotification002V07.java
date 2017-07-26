package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionNotification6;
import com.tools20022.repository.dict.msg.DocumentIdentification37;
import com.tools20022.repository.dict.msg.DocumentIdentification17;
import com.tools20022.repository.dict.msg.DocumentIdentification38;
import com.tools20022.repository.dict.msg.CorporateActionEventReference4;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation113;
import com.tools20022.repository.dict.choice.AccountIdentification36Choice;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes73;
import com.tools20022.repository.dict.msg.CorporateAction40;
import com.tools20022.repository.dict.msg.CorporateActionOption133;
import com.tools20022.repository.dict.msg.CorporateActionNarrative41;
import com.tools20022.repository.dict.choice.PartyIdentification104Choice;
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
 * (BAH).
 */
public class CorporateActionNotification002V07 {

	private Optional<Pagination> Pagination;
	private CorporateActionNotification6 NotificationGeneralInformation;
	private Optional<DocumentIdentification37> PreviousNotificationIdentification;
	private Optional<DocumentIdentification17> InstructionIdentification;
	private Optional<DocumentIdentification38> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference4> EventsLinkage;
	private CorporateActionGeneralInformation113 CorporateActionGeneralInformation;
	private AccountIdentification36Choice AccountDetails;
	private Optional<FinancialInstrumentAttributes73> IntermediateSecurity;
	private Optional<CorporateAction40> CorporateActionDetails;
	private Optional<CorporateActionOption133> CorporateActionOptionDetails;
	private Optional<CorporateActionNarrative41> AdditionalInformation;
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

	public CorporateActionNotification6 getNotificationGeneralInformation() {
		return NotificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(
			CorporateActionNotification6 NotificationGeneralInformation) {
		this.NotificationGeneralInformation = NotificationGeneralInformation;
	}

	public Optional<DocumentIdentification37> getPreviousNotificationIdentification() {
		return PreviousNotificationIdentification;
	}

	public void setPreviousNotificationIdentification(
			Optional<DocumentIdentification37> PreviousNotificationIdentification) {
		this.PreviousNotificationIdentification = PreviousNotificationIdentification;
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

	public CorporateActionGeneralInformation113 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation113 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification36Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification36Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<FinancialInstrumentAttributes73> getIntermediateSecurity() {
		return IntermediateSecurity;
	}

	public void setIntermediateSecurity(
			Optional<FinancialInstrumentAttributes73> IntermediateSecurity) {
		this.IntermediateSecurity = IntermediateSecurity;
	}

	public Optional<CorporateAction40> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction40> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption133> getCorporateActionOptionDetails() {
		return CorporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(
			Optional<CorporateActionOption133> CorporateActionOptionDetails) {
		this.CorporateActionOptionDetails = CorporateActionOptionDetails;
	}

	public Optional<CorporateActionNarrative41> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative41> AdditionalInformation) {
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