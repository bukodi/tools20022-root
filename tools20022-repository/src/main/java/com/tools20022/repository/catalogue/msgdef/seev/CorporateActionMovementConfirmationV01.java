package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation4;
import com.tools20022.repository.dict.msg.AccountAndBalance3;
import com.tools20022.repository.dict.msg.CorporateActionOption4;
import com.tools20022.repository.dict.msg.CorporateActionNarrative4;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account servicer sends the CorporateActionMovementConfirmation
 * message to an account owner or its designated agent to confirm posting of
 * securities or cash as a result of a corporate action event. Usage The message
 * may also be used to: - re-send a message previously sent (the sub-function of
 * the message is Duplicate), - provide a third party with a copy of a message
 * for information (the sub-function of the message is Copy), - re-send to a
 * third party a copy of a message for information (the sub-function of the
 * message is Copy Duplicate). ISO 15022 - 20022 COEXISTENCE This ISO 20022
 * message is reversed engineered from ISO 15022. Both standards will coexist
 * for a certain number of years. Until this coexistence period ends, the usage
 * of certain data types is restricted to ensure interoperability between ISO
 * 15022 and 20022 users. Compliance to these rules is mandatory in a
 * coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionMovementConfirmationV02.class)
public class CorporateActionMovementConfirmationV01 {

	private DocumentIdentification11 Identification;
	private Optional<DocumentIdentification15> NotificationIdentification;
	private Optional<DocumentIdentification15> MovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation4 CorporateActionGeneralInformation;
	private AccountAndBalance3 AccountDetails;
	private CorporateActionOption4 CorporateActionConfirmationDetails;
	private Optional<CorporateActionNarrative4> AdditionalInformation;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<PartyIdentification10Choice> IssuerAgent;
	private Optional<PartyIdentification10Choice> PayingAgent;
	private Optional<PartyIdentification10Choice> SubPayingAgent;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public Optional<DocumentIdentification15> getNotificationIdentification() {
		return NotificationIdentification;
	}

	public void setNotificationIdentification(
			Optional<DocumentIdentification15> NotificationIdentification) {
		this.NotificationIdentification = NotificationIdentification;
	}

	public Optional<DocumentIdentification15> getMovementPreliminaryAdviceIdentification() {
		return MovementPreliminaryAdviceIdentification;
	}

	public void setMovementPreliminaryAdviceIdentification(
			Optional<DocumentIdentification15> MovementPreliminaryAdviceIdentification) {
		this.MovementPreliminaryAdviceIdentification = MovementPreliminaryAdviceIdentification;
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

	public CorporateActionGeneralInformation4 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation4 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance3 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance3 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption4 getCorporateActionConfirmationDetails() {
		return CorporateActionConfirmationDetails;
	}

	public void setCorporateActionConfirmationDetails(
			CorporateActionOption4 CorporateActionConfirmationDetails) {
		this.CorporateActionConfirmationDetails = CorporateActionConfirmationDetails;
	}

	public Optional<CorporateActionNarrative4> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative4> AdditionalInformation) {
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

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}