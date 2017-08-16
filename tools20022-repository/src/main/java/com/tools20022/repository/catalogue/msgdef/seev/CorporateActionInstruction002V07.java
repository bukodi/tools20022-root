package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification37;
import com.tools20022.repository.dict.msg.DocumentIdentification38;
import com.tools20022.repository.dict.msg.CorporateActionEventReference4;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation115;
import com.tools20022.repository.dict.msg.AccountAndBalance37;
import com.tools20022.repository.dict.msg.PartyIdentification101;
import com.tools20022.repository.dict.msg.CorporateActionOption134;
import com.tools20022.repository.dict.msg.CorporateActionNarrative34;
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
public class CorporateActionInstruction002V07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<YesNoIndicator> ChangeInstructionIndicator;
	private Optional<DocumentIdentification37> CancelledInstructionIdentification;
	private Optional<DocumentIdentification37> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification38> OtherDocumentIdentification;
	private Optional<CorporateActionEventReference4> EventsLinkage;
	private CorporateActionGeneralInformation115 CorporateActionGeneralInformation;
	private AccountAndBalance37 AccountDetails;
	private Optional<PartyIdentification101> BeneficialOwnerDetails;
	private CorporateActionOption134 CorporateActionInstruction;
	private Optional<CorporateActionNarrative34> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<YesNoIndicator> getChangeInstructionIndicator() {
		return ChangeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(
			Optional<YesNoIndicator> ChangeInstructionIndicator) {
		this.ChangeInstructionIndicator = ChangeInstructionIndicator;
	}

	public Optional<DocumentIdentification37> getCancelledInstructionIdentification() {
		return CancelledInstructionIdentification;
	}

	public void setCancelledInstructionIdentification(
			Optional<DocumentIdentification37> CancelledInstructionIdentification) {
		this.CancelledInstructionIdentification = CancelledInstructionIdentification;
	}

	public Optional<DocumentIdentification37> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification37> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
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

	public CorporateActionGeneralInformation115 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation115 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public AccountAndBalance37 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(AccountAndBalance37 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public Optional<PartyIdentification101> getBeneficialOwnerDetails() {
		return BeneficialOwnerDetails;
	}

	public void setBeneficialOwnerDetails(
			Optional<PartyIdentification101> BeneficialOwnerDetails) {
		this.BeneficialOwnerDetails = BeneficialOwnerDetails;
	}

	public CorporateActionOption134 getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			CorporateActionOption134 CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative34> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative34> AdditionalInformation) {
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