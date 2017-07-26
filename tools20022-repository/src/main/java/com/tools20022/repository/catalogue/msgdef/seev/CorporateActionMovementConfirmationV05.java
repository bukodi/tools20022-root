package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementConfirmationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementConfirmationV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation50;
import com.tools20022.repository.dict.msg.AccountAndBalance26;
import com.tools20022.repository.dict.msg.CorporateAction14;
import com.tools20022.repository.dict.msg.CorporateActionOption102;
import com.tools20022.repository.dict.msg.CorporateActionNarrative4;
import com.tools20022.repository.dict.choice.PartyIdentification46Choice;
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
 * application header (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022
 * message is reversed engineered from ISO 15022. Both standards will coexist
 * for a certain number of years. Until this coexistence period ends, the usage
 * of certain data types is restricted to ensure interoperability between ISO
 * 15022 and 20022 users. Compliance to these rules is mandatory in a
 * coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionMovementConfirmationV04.class)
@NextVersion(CorporateActionMovementConfirmationV06.class)
public class CorporateActionMovementConfirmationV05 {

	private Optional<DocumentIdentification15> NotificationIdentification;
	private Optional<DocumentIdentification15> MovementPreliminaryAdviceIdentification;
	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation50 CorporateActionGeneralInformation;
	private AccountAndBalance26 AccountDetails;
	private Optional<CorporateAction14> CorporateActionDetails;
	private CorporateActionOption102 CorporateActionConfirmationDetails;
	private Optional<CorporateActionNarrative4> AdditionalInformation;
	private Optional<PartyIdentification46Choice> IssuerAgent;
	private Optional<PartyIdentification46Choice> PayingAgent;
	private Optional<PartyIdentification46Choice> SubPayingAgent;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public CorporateActionGeneralInformation50 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation50 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance26 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance26 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction14> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction14> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public CorporateActionOption102 getCorporateActionConfirmationDetails() {
		return CorporateActionConfirmationDetails;
	}

	public void setCorporateActionConfirmationDetails(
			CorporateActionOption102 CorporateActionConfirmationDetails) {
		this.CorporateActionConfirmationDetails = CorporateActionConfirmationDetails;
	}

	public Optional<CorporateActionNarrative4> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative4> AdditionalInformation) {
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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}