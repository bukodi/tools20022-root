package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification33;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation91;
import com.tools20022.repository.dict.choice.InstructionCancellationRequestStatus9Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption116;
import com.tools20022.repository.dict.msg.CorporateActionNarrative10;
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
@PreviousVersion(CorporateActionInstructionCancellationRequestStatusAdviceV05.class)
@NextVersion(CorporateActionInstructionCancellationRequestStatusAdviceV07.class)
public class CorporateActionInstructionCancellationRequestStatusAdviceV06 {

	private Optional<DocumentIdentification9> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification33> OtherDocumentIdentification;
	private CorporateActionGeneralInformation91 CorporateActionGeneralInformation;
	private InstructionCancellationRequestStatus9Choice InstructionCancellationRequestStatus;
	private Optional<CorporateActionOption116> CorporateActionInstruction;
	private Optional<CorporateActionNarrative10> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification9> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification9> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
	}

	public Optional<DocumentIdentification33> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification33> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation91 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation91 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public InstructionCancellationRequestStatus9Choice getInstructionCancellationRequestStatus() {
		return InstructionCancellationRequestStatus;
	}

	public void setInstructionCancellationRequestStatus(
			InstructionCancellationRequestStatus9Choice InstructionCancellationRequestStatus) {
		this.InstructionCancellationRequestStatus = InstructionCancellationRequestStatus;
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