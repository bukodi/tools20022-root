package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.dict.msg.CorporateActionStandingInstruction1;
import java.util.Optional;

/**
 * Scope This message is sent by a CSD to the issuer agent to request the
 * cancellation of a previously sent Agent Corporate Action Standing
 * Instruction. Usage This message is used to request the cancellation of a
 * standing instruction. This message must contain the identification of the
 * standing instruction to be cancelled. It may also contain details of the
 * standing instruction to be cancelled, but this is not recommended.
 */
public class AgentCAStandingInstructionCancellationRequestV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAStandingInstructionRequestIdentification;
	private CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation;
	private Optional<CorporateActionStandingInstruction1> StandingInstructionDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAStandingInstructionRequestIdentification() {
		return AgentCAStandingInstructionRequestIdentification;
	}

	public void setAgentCAStandingInstructionRequestIdentification(
			DocumentIdentification8 AgentCAStandingInstructionRequestIdentification) {
		this.AgentCAStandingInstructionRequestIdentification = AgentCAStandingInstructionRequestIdentification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return StandingInstructionGeneralInformation;
	}

	public void setStandingInstructionGeneralInformation(
			CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation) {
		this.StandingInstructionGeneralInformation = StandingInstructionGeneralInformation;
	}

	public Optional<CorporateActionStandingInstruction1> getStandingInstructionDetails() {
		return StandingInstructionDetails;
	}

	public void setStandingInstructionDetails(
			Optional<CorporateActionStandingInstruction1> StandingInstructionDetails) {
		this.StandingInstructionDetails = StandingInstructionDetails;
	}
}