package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionStatusAdviceV07;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification33;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation109;
import com.tools20022.repository.dict.choice.InstructionProcessingStatus29Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption116;
import com.tools20022.repository.dict.msg.CorporateActionNarrative10;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the CorporateActionInstructionStatusAdvice
 * message to an account owner or its designated agent, to report status of a
 * received corporate action election instruction. This message is used to
 * advise the status, or a change in status, of a corporate action-related
 * transaction previously instructed by, or executed on behalf of, the account
 * owner. This will include the acknowledgement/rejection of a corporate action
 * instruction. Usage The message may also be used to: - re-send a message
 * previously sent (the sub-function of the message is Duplicate), - provide a
 * third party with a copy of a message for information (the sub-function of the
 * message is Copy), - re-send to a third party a copy of a message for
 * information (the sub-function of the message is Copy Duplicate), using the
 * relevant elements in the business application header (BAH).
 */
@PreviousVersion(CorporateActionInstructionStatusAdviceV07.class)
public class CorporateActionInstructionStatusAdviceV08 {

	private Optional<DocumentIdentification9> InstructionIdentification;
	private Optional<DocumentIdentification33> OtherDocumentIdentification;
	private CorporateActionGeneralInformation109 CorporateActionGeneralInformation;
	private InstructionProcessingStatus29Choice InstructionProcessingStatus;
	private Optional<CorporateActionOption116> CorporateActionInstruction;
	private Optional<CorporateActionNarrative10> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return InstructionIdentification;
	}

	public void setInstructionIdentification(
			Optional<DocumentIdentification9> InstructionIdentification) {
		this.InstructionIdentification = InstructionIdentification;
	}

	public Optional<DocumentIdentification33> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification33> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation109 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation109 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public InstructionProcessingStatus29Choice getInstructionProcessingStatus() {
		return InstructionProcessingStatus;
	}

	public void setInstructionProcessingStatus(
			InstructionProcessingStatus29Choice InstructionProcessingStatus) {
		this.InstructionProcessingStatus = InstructionProcessingStatus;
	}

	public Optional<CorporateActionOption116> getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			Optional<CorporateActionOption116> CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative10> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative10> AdditionalInformation) {
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