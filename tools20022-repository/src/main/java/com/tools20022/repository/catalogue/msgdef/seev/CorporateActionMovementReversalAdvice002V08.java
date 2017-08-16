package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification37;
import com.tools20022.repository.dict.msg.DocumentIdentification38;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionEventReference4;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason4;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation118;
import com.tools20022.repository.dict.msg.AccountAndBalance40;
import com.tools20022.repository.dict.msg.CorporateAction36;
import com.tools20022.repository.dict.msg.CorporateActionOption126;
import com.tools20022.repository.dict.msg.CorporateActionNarrative35;
import com.tools20022.repository.dict.choice.PartyIdentification104Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the CorporateActionMovementReversalAdvice
 * message to an account owner or its designated agent to reverse previously
 * confirmed posting of securities or cash. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate), using the relevant elements in the business application header
 * (BAH).
 */
public class CorporateActionMovementReversalAdvice002V08
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification37 MovementConfirmationIdentification;
	private Optional<DocumentIdentification38> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference4> EventsLinkage;
	private Optional<CorporateActionReversalReason4> ReversalReason;
	private CorporateActionGeneralInformation118 CorporateActionGeneralInformation;
	private AccountAndBalance40 AccountDetails;
	private Optional<CorporateAction36> CorporateActionDetails;
	private CorporateActionOption126 CorporateActionConfirmationDetails;
	private Optional<CorporateActionNarrative35> AdditionalInformation;
	private Optional<PartyIdentification104Choice> IssuerAgent;
	private Optional<PartyIdentification104Choice> PayingAgent;
	private Optional<PartyIdentification104Choice> SubPayingAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentIdentification37 getMovementConfirmationIdentification() {
		return MovementConfirmationIdentification;
	}

	public void setMovementConfirmationIdentification(
			DocumentIdentification37 MovementConfirmationIdentification) {
		this.MovementConfirmationIdentification = MovementConfirmationIdentification;
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

	public Optional<CorporateActionReversalReason4> getReversalReason() {
		return ReversalReason;
	}

	public void setReversalReason(
			Optional<CorporateActionReversalReason4> ReversalReason) {
		this.ReversalReason = ReversalReason;
	}

	public CorporateActionGeneralInformation118 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation118 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance40 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance40 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<CorporateAction36> getCorporateActionDetails() {
		return CorporateActionDetails;
	}

	public void setCorporateActionDetails(
			Optional<CorporateAction36> CorporateActionDetails) {
		this.CorporateActionDetails = CorporateActionDetails;
	}

	public CorporateActionOption126 getCorporateActionConfirmationDetails() {
		return CorporateActionConfirmationDetails;
	}

	public void setCorporateActionConfirmationDetails(
			CorporateActionOption126 CorporateActionConfirmationDetails) {
		this.CorporateActionConfirmationDetails = CorporateActionConfirmationDetails;
	}

	public Optional<CorporateActionNarrative35> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative35> AdditionalInformation) {
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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}