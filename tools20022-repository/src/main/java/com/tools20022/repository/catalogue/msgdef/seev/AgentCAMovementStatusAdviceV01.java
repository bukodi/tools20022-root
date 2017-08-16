package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.choice.CorporateActionMovementStatus1Choice;
import com.tools20022.repository.dict.msg.CorporateMovementStatus2;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or a change in status, of - a global distribution status advice
 * released by an issuer (or its agent); - a movement instruction released by an
 * issuer (or its agent); - a movement cancellation request sent by the issuer
 * (or its agent); and - the non-settlement of the movements at the CSD. Usage
 * This message is used to report the status of: - the movements resulting from
 * a movement instruction message, in which case, the Agent Corporate Action
 * Movement Instruction Identification must be present; - the movements
 * resulting from a global distribution status advice message (with the status,
 * authorised), in which case, the Agent Corporate Action Global Distribution
 * Status Advice Identification must be present; - the movement cancellation
 * request, in which case, the Agent Corporate Action Movement Cancellation
 * Request Identification must be present; and - the movements resulting from an
 * election status advice (if the status of the election advice is rejected or
 * if the status of the election cancellation request or amendment request is
 * accepted) in case there is a settlement problem. The Election Status Advice
 * Identification must be present. In the case of a failed settlement, the
 * message contains details of the movement, such as account details, securities
 * or cash information and the reason of the failure. This message should not be
 * used to provide the confirmation of the settlement; the Agent Corporate
 * Action Movement Confirmation message should be used instead.
 */
public class AgentCAMovementStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAElectionStatusAdviceIdentification;
	private DocumentIdentification8 AgentCAGlobalDistributionStatusAdviceIdentification;
	private DocumentIdentification8 AgentCAMovementInstructionIdentification;
	private DocumentIdentification8 AgentCAMovementCancellationRequestIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private CorporateActionMovementStatus1Choice MovementStatusDetails;
	private CorporateMovementStatus2 MovementCancellationStatusDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAElectionStatusAdviceIdentification() {
		return AgentCAElectionStatusAdviceIdentification;
	}

	public void setAgentCAElectionStatusAdviceIdentification(
			DocumentIdentification8 AgentCAElectionStatusAdviceIdentification) {
		this.AgentCAElectionStatusAdviceIdentification = AgentCAElectionStatusAdviceIdentification;
	}

	public DocumentIdentification8 getAgentCAGlobalDistributionStatusAdviceIdentification() {
		return AgentCAGlobalDistributionStatusAdviceIdentification;
	}

	public void setAgentCAGlobalDistributionStatusAdviceIdentification(
			DocumentIdentification8 AgentCAGlobalDistributionStatusAdviceIdentification) {
		this.AgentCAGlobalDistributionStatusAdviceIdentification = AgentCAGlobalDistributionStatusAdviceIdentification;
	}

	public DocumentIdentification8 getAgentCAMovementInstructionIdentification() {
		return AgentCAMovementInstructionIdentification;
	}

	public void setAgentCAMovementInstructionIdentification(
			DocumentIdentification8 AgentCAMovementInstructionIdentification) {
		this.AgentCAMovementInstructionIdentification = AgentCAMovementInstructionIdentification;
	}

	public DocumentIdentification8 getAgentCAMovementCancellationRequestIdentification() {
		return AgentCAMovementCancellationRequestIdentification;
	}

	public void setAgentCAMovementCancellationRequestIdentification(
			DocumentIdentification8 AgentCAMovementCancellationRequestIdentification) {
		this.AgentCAMovementCancellationRequestIdentification = AgentCAMovementCancellationRequestIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateActionMovementStatus1Choice getMovementStatusDetails() {
		return MovementStatusDetails;
	}

	public void setMovementStatusDetails(
			CorporateActionMovementStatus1Choice MovementStatusDetails) {
		this.MovementStatusDetails = MovementStatusDetails;
	}

	public CorporateMovementStatus2 getMovementCancellationStatusDetails() {
		return MovementCancellationStatusDetails;
	}

	public void setMovementCancellationStatusDetails(
			CorporateMovementStatus2 MovementCancellationStatusDetails) {
		this.MovementCancellationStatusDetails = MovementCancellationStatusDetails;
	}
}