package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionNotificationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionNotification5;
import com.tools20022.repository.dict.msg.DocumentIdentification31;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification32;
import com.tools20022.repository.dict.msg.CorporateActionEventReference3;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation105;
import com.tools20022.repository.dict.choice.AccountIdentification32Choice;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes68;
import com.tools20022.repository.dict.msg.CorporateAction31;
import com.tools20022.repository.dict.msg.CorporateActionOption130;
import com.tools20022.repository.dict.msg.CorporateActionNarrative27;
import com.tools20022.repository.dict.choice.PartyIdentification71Choice;
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
@PreviousVersion(CorporateActionNotificationV06.class)
public class CorporateActionNotificationV07 {

	private Optional<Pagination> Pagination;
	private CorporateActionNotification5 NotificationGeneralInformation;
	private Optional<DocumentIdentification31> PreviousNotificationIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification32> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference3> EventsLinkage;
	private CorporateActionGeneralInformation105 CorporateActionGeneralInformation;
	private AccountIdentification32Choice AccountDetails;
	private Optional<FinancialInstrumentAttributes68> IntermediateSecurity;
	private Optional<CorporateAction31> CorporateActionDetails;
	private Optional<CorporateActionOption130> CorporateActionOptionDetails;
	private Optional<CorporateActionNarrative27> AdditionalInformation;
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

	public CorporateActionNotification5 getNotificationGeneralInformation() {
		return NotificationGeneralInformation;
	}

	public void setNotificationGeneralInformation(
			CorporateActionNotification5 NotificationGeneralInformation) {
		this.NotificationGeneralInformation = NotificationGeneralInformation;
	}

	public Optional<DocumentIdentification31> getPreviousNotificationIdentification() {
		return PreviousNotificationIdentification;
	}

	public void setPreviousNotificationIdentification(
			Optional<DocumentIdentification31> PreviousNotificationIdentification) {
		this.PreviousNotificationIdentification = PreviousNotificationIdentification;
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

	public CorporateActionGeneralInformation105 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation105 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountIdentification32Choice getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountIdentification32Choice AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<FinancialInstrumentAttributes68> getIntermediateSecurity() {
		return IntermediateSecurity;
	}

	public void setIntermediateSecurity(
			Optional<FinancialInstrumentAttributes68> IntermediateSecurity) {
		this.IntermediateSecurity = IntermediateSecurity;
	}

	public Optional<CorporateAction31> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction31> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public Optional<CorporateActionOption130> getCorporateActionOptionDetails() {
		return CorporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(
			Optional<CorporateActionOption130> CorporateActionOptionDetails) {
		this.CorporateActionOptionDetails = CorporateActionOptionDetails;
	}

	public Optional<CorporateActionNarrative27> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative27> AdditionalInformation) {
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