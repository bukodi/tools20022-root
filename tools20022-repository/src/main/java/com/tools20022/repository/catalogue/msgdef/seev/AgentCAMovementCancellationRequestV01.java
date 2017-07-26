package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.MovementInstruction1;
import java.util.Optional;

/**
 * Scope This message is sent by an issuer (or its agent) to a CSD to request
 * the cancellation of (a) movement(s) previously sent via an Agent Corporate
 * Action Movement Instruction. Usage This message may be used to cancel an
 * entire Agent Corporate Action Movement Instruction message that was
 * previously sent by the issuer (or its agent) or specific movements. This
 * message must contain the identification of the Agent Corporate Action
 * Movement Instruction containing the movement(s) to be cancelled, the agent
 * identification and the corporate action references. This message must also
 * contain details of the movement(s) to be cancelled.
 */
public class AgentCAMovementCancellationRequestV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAMovementInstructionIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private Optional<MovementInstruction1> MovementDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAMovementInstructionIdentification() {
		return AgentCAMovementInstructionIdentification;
	}

	public void setAgentCAMovementInstructionIdentification(
			DocumentIdentification8 AgentCAMovementInstructionIdentification) {
		this.AgentCAMovementInstructionIdentification = AgentCAMovementInstructionIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public Optional<MovementInstruction1> getMovementDetails() {
		return MovementDetails;
	}

	public void setMovementDetails(
			Optional<MovementInstruction1> MovementDetails) {
		this.MovementDetails = MovementDetails;
	}
}