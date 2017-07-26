package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.DocumentIdentification14;
import com.tools20022.repository.dict.msg.CorporateActionGeneralInformation9;
import com.tools20022.repository.dict.choice.InstructionCancellationRequestStatus3Choice;
import com.tools20022.repository.dict.msg.CorporateActionOption22;
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
 * (BAH). ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(CorporateActionInstructionCancellationRequestStatusAdviceV01.class)
@NextVersion(CorporateActionInstructionCancellationRequestStatusAdviceV03.class)
public class CorporateActionInstructionCancellationRequestStatusAdviceV02 {

	private Optional<DocumentIdentification9> InstructionCancellationRequestIdentification;
	private Optional<DocumentIdentification14> OtherDocumentIdentification;
	private CorporateActionGeneralInformation9 CorporateActionGeneralInformation;
	private InstructionCancellationRequestStatus3Choice InstructionCancellationRequestStatus;
	private Optional<CorporateActionOption22> CorporateActionInstruction;
	private Optional<CorporateActionNarrative10> AdditionalInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<DocumentIdentification9> getInstructionCancellationRequestIdentification() {
		return InstructionCancellationRequestIdentification;
	}

	public void setInstructionCancellationRequestIdentification(
			Optional<DocumentIdentification9> InstructionCancellationRequestIdentification) {
		this.InstructionCancellationRequestIdentification = InstructionCancellationRequestIdentification;
	}

	public Optional<DocumentIdentification14> getOtherDocumentIdentification() {
		return OtherDocumentIdentification;
	}

	public void setOtherDocumentIdentification(
			Optional<DocumentIdentification14> OtherDocumentIdentification) {
		this.OtherDocumentIdentification = OtherDocumentIdentification;
	}

	public CorporateActionGeneralInformation9 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionGeneralInformation9 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public InstructionCancellationRequestStatus3Choice getInstructionCancellationRequestStatus() {
		return InstructionCancellationRequestStatus;
	}

	public void setInstructionCancellationRequestStatus(
			InstructionCancellationRequestStatus3Choice InstructionCancellationRequestStatus) {
		this.InstructionCancellationRequestStatus = InstructionCancellationRequestStatus;
	}

	public Optional<CorporateActionOption22> getCorporateActionInstruction() {
		return CorporateActionInstruction;
	}

	public void setCorporateActionInstruction(
			Optional<CorporateActionOption22> CorporateActionInstruction) {
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