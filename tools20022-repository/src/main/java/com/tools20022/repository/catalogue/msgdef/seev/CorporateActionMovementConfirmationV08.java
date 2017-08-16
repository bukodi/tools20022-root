package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementConfirmationV07;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification31;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification32;
import com.tools20022.repository.dict.msg.CorporateActionEventReference3;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation111;
import com.tools20022.repository.dict.msg.AccountAndBalance34;
import com.tools20022.repository.dict.msg.CorporateAction33;
import com.tools20022.repository.dict.msg.CorporateActionOption132;
import com.tools20022.repository.dict.msg.CorporateActionNarrative31;
import com.tools20022.repository.dict.choice.PartyIdentification71Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the CorporateActionMovementConfirmation
 * message to an account owner or its designated agent to confirm posting of
 * securities or cash as a result of a corporate action event. Usage The message
 * may also be used to: - re-send a message previously sent (the sub-function of
 * the message is Duplicate), - provide a third party with a copy of a message
 * for information (the sub-function of the message is Copy), - re-send to a
 * third party a copy of a message for information (the sub-function of the
 * message is Copy Duplicate), using the relevant elements in the business
 * application header (BAH).
 */
@PreviousVersion(CorporateActionMovementConfirmationV07.class)
public class CorporateActionMovementConfirmationV08
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<DocumentIdentification31> NotificationIdentification;
	private Optional<DocumentIdentification31> MovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification32> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference3> EventsLinkage;
	private CorporateActionGeneralInformation111 CorporateActionGeneralInformation;
	private AccountAndBalance34 AccountDetails;
	private Optional<CorporateAction33> CorporateActionDetails;
	private CorporateActionOption132 CorporateActionConfirmationDetails;
	private Optional<CorporateActionNarrative31> AdditionalInformation;
	private Optional<PartyIdentification71Choice> IssuerAgent;
	private Optional<PartyIdentification71Choice> PayingAgent;
	private Optional<PartyIdentification71Choice> SubPayingAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification31> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification31> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification31> getMovementPreliminaryAdviceIdentification() {
		return MovementPreliminaryAdviceIdentification;
	}

	public void setMovementPreliminaryAdviceIdentification(
			Optional<DocumentIdentification31> MovementPreliminaryAdviceIdentification) {
		this.MovementPreliminaryAdviceIdentification = MovementPreliminaryAdviceIdentification;
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

	public CorporateActionGeneralInformation111 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation111 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance34 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance34 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction33> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction33> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public CorporateActionOption132 getCorporateActionConfirmationDetails() {
		return CorporateActionConfirmationDetails;
	}

	public void setCorporateActionConfirmationDetails(
			CorporateActionOption132 CorporateActionConfirmationDetails) {
		this.CorporateActionConfirmationDetails = CorporateActionConfirmationDetails;
	}

	public Optional<CorporateActionNarrative31> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative31> AdditionalInformation) {
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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}