package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification15;
import com.tools20022.repository.dict.msg.DocumentIdentification13;
import com.tools20022.repository.dict.msg.CorporateActionEventReference1;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation36;
import com.tools20022.repository.dict.msg.AccountAndBalance17;
import com.tools20022.repository.dict.msg.PartyIdentification56;
import com.tools20022.repository.dict.msg.CorporateActionOption38;
import com.tools20022.repository.dict.msg.CorporateActionNarrative21;
import com.tools20022.repository.dict.msg.SupplementaryData1;

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
 * message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH). ISO
 * 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered from
 * ISO 15022. Both standards will coexist for a certain number of years. Until
 * this coexistence period ends, the usage of certain data types is restricted
 * to ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionInstructionV02.class)
@NextVersion(CorporateActionInstructionV04.class)
public class CorporateActionInstructionV03 {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private Optional<DocumentIdentification15> CancelledInstructionIdentification;
	private Optional<DocumentIdentification15> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification13> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference1> EventsLinkage;
	private CorporateActionGeneralInformation36 CorporateActionGeneralInformation;
	private AccountAndBalance17 AccountDetails;
	private Optional<PartyIdentification56> BeneficialOwnerDetails;
	private CorporateActionOption38 CorporateActionInstruction;
	private Optional<CorporateActionNarrative21> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
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

	public CorporateActionGeneralInformation36 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation36 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance17 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance17 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<PartyIdentification56> getBeneficialOwnerDetails() {
		return BeneficialOwnerDetails;
	}

	public void setBeneficialOwnerDetails(
			Optional<PartyIdentification56> BeneficialOwnerDetails) {
		this.BeneficialOwnerDetails = BeneficialOwnerDetails;
	}

	public CorporateActionOption38 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption38 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative21> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative21> AdditionalInformation) {
		this.AdditionalInformation = AdditionalInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}