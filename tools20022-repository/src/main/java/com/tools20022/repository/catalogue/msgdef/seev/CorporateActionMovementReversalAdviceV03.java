package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementReversalAdviceV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionMovementReversalAdviceV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionReversalReason1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation39;
import com.tools20022.repository.dict.msg.AccountAndBalance4;
import com.tools20022.repository.dict.msg.CorporateActionOption39;
import com.tools20022.repository.dict.msg.CorporateActionNarrative4;
import com.tools20022.repository.dict.choice.PartyIdentification46Choice;
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
 * (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionMovementReversalAdviceV02.class)
@NextVersion(CorporateActionMovementReversalAdviceV04.class)
public class CorporateActionMovementReversalAdviceV03 {

	private DocumentIdentification15 MovementConfirmationIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private Optional<CorporateActionReversalReason1> ReversalReason;
	private CorporateActionGeneralInformation39 CorporateActionGeneralInformation;
	private AccountAndBalance4 AccountDetails;
	private CorporateActionOption39 CorporateActionConfirmationDetails;
	private Optional<CorporateActionNarrative4> AdditionalInformation;
	private Optional<PartyIdentification46Choice> IssuerAgent;
	private Optional<PartyIdentification46Choice> PayingAgent;
	private Optional<PartyIdentification46Choice> SubPayingAgent;
	private Optional<SupplementaryData1> SupplementaryData;

	public DocumentIdentification15 getMovementConfirmationIdentification() {
		return MovementConfirmationIdentification;
	}

	public void setMovementConfirmationIdentification(
			DocumentIdentification15 MovementConfirmationIdentification) {
		this.MovementConfirmationIdentification = MovementConfirmationIdentification;
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

	public CorporateActionGeneralInformation39 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation39 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance4 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance4 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public CorporateActionOption39 getCorporateActionConfirmationDetails() {
		return CorporateActionConfirmationDetails;
	}

	public void setCorporateActionConfirmationDetails(
			CorporateActionOption39 CorporateActionConfirmationDetails) {
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