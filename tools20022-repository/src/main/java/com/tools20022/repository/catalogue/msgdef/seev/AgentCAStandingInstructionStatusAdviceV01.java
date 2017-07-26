package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.dict.choice.StandingInstructionStatus1Choice;
import com.tools20022.repository.dict.choice.StandingInstructionCancellationStatus1Choice;

/**
 * Scope This message is sent by an issuer (or its agent) to the CSD to report
 * the status, or a change in status, of a standing instruction request or the
 * status of a standing instruction cancellation request. Usage When this
 * message is used to report the status of a standing instruction request, the
 * building block Standing Instruction Request Identification must be present.
 * When this message is used to report the status of a standing instruction
 * cancellation request, the building block Standing Instruction Cancellation
 * Request Identification must be present.
 */
public class AgentCAStandingInstructionStatusAdviceV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAStandingInstructionRequestIdentification;
	private DocumentIdentification8 AgentCAStandingInstructionCancellationRequestIdentification;
	private CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation;
	private StandingInstructionStatus1Choice StandingInstructionRequestStatus;
	private StandingInstructionCancellationStatus1Choice StandingInstructionCancellationRequestStatus;

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

	public DocumentIdentification8 getAgentCAStandingInstructionCancellationRequestIdentification() {
		return AgentCAStandingInstructionCancellationRequestIdentification;
	}

	public void setAgentCAStandingInstructionCancellationRequestIdentification(
			DocumentIdentification8 AgentCAStandingInstructionCancellationRequestIdentification) {
		this.AgentCAStandingInstructionCancellationRequestIdentification = AgentCAStandingInstructionCancellationRequestIdentification;
	}

	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return StandingInstructionGeneralInformation;
	}

	public void setStandingInstructionGeneralInformation(
			CorporateActionStandingInstructionGeneralInformation1 StandingInstructionGeneralInformation) {
		this.StandingInstructionGeneralInformation = StandingInstructionGeneralInformation;
	}

	public StandingInstructionStatus1Choice getStandingInstructionRequestStatus() {
		return StandingInstructionRequestStatus;
	}

	public void setStandingInstructionRequestStatus(
			StandingInstructionStatus1Choice StandingInstructionRequestStatus) {
		this.StandingInstructionRequestStatus = StandingInstructionRequestStatus;
	}

	public StandingInstructionCancellationStatus1Choice getStandingInstructionCancellationRequestStatus() {
		return StandingInstructionCancellationRequestStatus;
	}

	public void setStandingInstructionCancellationRequestStatus(
			StandingInstructionCancellationStatus1Choice StandingInstructionCancellationRequestStatus) {
		this.StandingInstructionCancellationRequestStatus = StandingInstructionCancellationRequestStatus;
	}
}