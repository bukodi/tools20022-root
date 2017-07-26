package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification17;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification34;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation114;
import com.tools20022.repository.dict.choice.InstructionCancellationRequestStatus12Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption121;
import com.tools20022.repository.dict.msg.CorporateActionNarrative19;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends the
 * CorporateActionInstructionCancellationRequestStatusAdvice message to an
 * account owner or its designated agent to report status of a previously
 * received CorporateActionInstructionCancellationRequest message sent by the
 * account owner. This will include the acknowledgement/rejection of a request
 * to cancel an outstanding instruction. Usage The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate), using the relevant elements in the business application header
 * (BAH).
 */
public class CorporateActionInstructionCancellationRequestStatusAdvice002V07 {

	private Optional<DocumentIdentification17> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification34> OtherDocumentIdentification;
	private CorporateActionGeneralInformation114 CorporateActionGeneralInformation;
	private InstructionCancellationRequestStatus12Choice InstructionCancellationRequestStatus;
	private Optional<CorporateActionOption121> CorporateActionInstruction;
	private Optional<CorporateActionNarrative19> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification17> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification17> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
	}

	public Optional<DocumentIdentification34> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification34> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation114 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation114 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public InstructionCancellationRequestStatus12Choice getInstructionCancellationRequestStatus() {
		return InstructionCancellationRequestStatus;
	}

	public void setInstructionCancellationRequestStatus(
			InstructionCancellationRequestStatus12Choice InstructionCancellationRequestStatus) {
		this.InstructionCancellationRequestStatus = InstructionCancellationRequestStatus;
	}

	public Optional<CorporateActionOption121> getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			Optional<CorporateActionOption121> CorporateActionInstruction) {
		this.CorporateActionInstruction = CorporateActionInstruction;
	}

	public Optional<CorporateActionNarrative19> getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(
			Optional<CorporateActionNarrative19> AdditionalInformation) {
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