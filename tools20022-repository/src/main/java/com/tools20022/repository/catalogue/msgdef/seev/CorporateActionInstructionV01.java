package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification12;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation6;
import com.tools20022.repository.dict.msg.AccountAndBalance2;
import com.tools20022.repository.dict.msg.PartyIdentification33;
import com.tools20022.repository.dict.msg.CorporateActionOption5;
import com.tools20022.repository.dict.msg.CorporateActionNarrative7;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * Scope An account owner sends the CorporateActionInstruction message to an
 * account servicer to instruct election on a corporate action event. This
 * message is used to provide the custodian with instructions on how the account
 * owner wishes to proceed with a corporate action event. Instructions include
 * investment decisions regarding the exercise of rights issues, the election of
 * stock or cash when the option is available, and decisions on the conversion
 * or tendering of securities. Usage The message may also be used to: - re-send
 * a message previously sent (the sub-function of the message is Duplicate), -
 * provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy), - re-send to a third party a copy of a
 * message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(CorporateActionInstructionV02.class)
public class CorporateActionInstructionV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification12 Identification;
	private Optional<DocumentIdentification15> CancelledInstructionIdentification;
	private Optional<DocumentIdentification15> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation6 CorporateActionGeneralInformation;
	private AccountAndBalance2 AccountDetails;
	private Optional<PartyIdentification33> BeneficialOwnerDetails;
	private CorporateActionOption5 CorporateActionInstruction;
	private Optional<CorporateActionNarrative7> AdditionalInformation;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification12 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification12 Identification) {
		this.Identification = Identification;
	}

	public Optional<DocumentIdentification15> getCancelledInstructionIdentification() {
		return CancelledInstructionIdentification;
	}

	public void setCancelledInstructionIdentification(
			Optional<DocumentIdentification15> CancelledInstructionIdentification) {
		this.CancelledInstructionIdentification = CancelledInstructionIdentification;
	}

	public Optional<DocumentIdentification15> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification15> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
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

	public CorporateActionGeneralInformation6 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation6 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance2 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance2 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<PartyIdentification33> getBeneficialOwnerDetails() {
		return BeneficialOwnerDetails;
	}

	public void setBeneficialOwnerDetails(
			Optional<PartyIdentification33> BeneficialOwnerDetails) {
		this.BeneficialOwnerDetails = BeneficialOwnerDetails;
	}

	public CorporateActionOption5 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption5 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative7> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative7> AdditionalInformation) {
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

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}