package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification31;
import com.tools20022.repository.dict.msg.DocumentIdentification32;
import com.tools20022.repository.dict.msg.CorporateActionEventReference3;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation107;
import com.tools20022.repository.dict.msg.AccountAndBalance35;
import com.tools20022.repository.dict.msg.PartyIdentification93;
import com.tools20022.repository.dict.msg.CorporateActionOption131;
import com.tools20022.repository.dict.msg.CorporateActionNarrative30;
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
 * using the relevant elements in the business application header (BAH).
 */
@PreviousVersion(CorporateActionInstructionV06.class)
public class CorporateActionInstructionV07 {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private Optional<DocumentIdentification31> CancelledInstructionIdentification;
	private Optional<DocumentIdentification31> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification32> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference3> EventsLinkage;
	private CorporateActionGeneralInformation107 CorporateActionGeneralInformation;
	private AccountAndBalance35 AccountDetails;
	private Optional<PartyIdentification93> BeneficialOwnerDetails;
	private CorporateActionOption131 CorporateActionInstruction;
	private Optional<CorporateActionNarrative30> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
	}

	public Optional<DocumentIdentification31> getCancelledInstructionIdentification() {
		return CancelledInstructionIdentification;
	}

	public void setCancelledInstructionIdentification(
			Optional<DocumentIdentification31> CancelledInstructionIdentification) {
		this.CancelledInstructionIdentification = CancelledInstructionIdentification;
	}

	public Optional<DocumentIdentification31> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification31> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
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

	public CorporateActionGeneralInformation107 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation107 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance35 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance35 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<PartyIdentification93> getBeneficialOwnerDetails() {
		return BeneficialOwnerDetails;
	}

	public void setBeneficialOwnerDetails(
			Optional<PartyIdentification93> BeneficialOwnerDetails) {
		this.BeneficialOwnerDetails = BeneficialOwnerDetails;
	}

	public CorporateActionOption131 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption131 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative30> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative30> AdditionalInformation) {
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