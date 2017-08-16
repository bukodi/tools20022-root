package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionDeactivationInstructionStatus1;
import com.tools20022.repository.dict.choice.CorporateActionDeactivationCancellationStatus1Choice;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to report the
 * status, or a change in status, of a corporate action deactivation instruction
 * or the status of a deactivation cancellation request. Usage This message is
 * used to provide a status on the deactivation instruction, especially to
 * confirm the deactivation of a Corporate Action event or option.
 */
public class AgentCADeactivationStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCADeactivationInstructionIdentification;
	private DocumentIdentification8 AgentCADeactivationCancellationRequestIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private CorporateActionDeactivationInstructionStatus1 DeactivationInstructionStatus;
	private CorporateActionDeactivationCancellationStatus1Choice DeactivationCancellationRequestStatus;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCADeactivationInstructionIdentification() {
		return AgentCADeactivationInstructionIdentification;
	}

	public void setAgentCADeactivationInstructionIdentification(
			DocumentIdentification8 AgentCADeactivationInstructionIdentification) {
		this.AgentCADeactivationInstructionIdentification = AgentCADeactivationInstructionIdentification;
	}

	public DocumentIdentification8 getAgentCADeactivationCancellationRequestIdentification() {
		return AgentCADeactivationCancellationRequestIdentification;
	}

	public void setAgentCADeactivationCancellationRequestIdentification(
			DocumentIdentification8 AgentCADeactivationCancellationRequestIdentification) {
		this.AgentCADeactivationCancellationRequestIdentification = AgentCADeactivationCancellationRequestIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public CorporateActionDeactivationInstructionStatus1 getDeactivationInstructionStatus() {
		return DeactivationInstructionStatus;
	}

	public void setDeactivationInstructionStatus(
			CorporateActionDeactivationInstructionStatus1 DeactivationInstructionStatus) {
		this.DeactivationInstructionStatus = DeactivationInstructionStatus;
	}

	public CorporateActionDeactivationCancellationStatus1Choice getDeactivationCancellationRequestStatus() {
		return DeactivationCancellationRequestStatus;
	}

	public void setDeactivationCancellationRequestStatus(
			CorporateActionDeactivationCancellationStatus1Choice DeactivationCancellationRequestStatus) {
		this.DeactivationCancellationRequestStatus = DeactivationCancellationRequestStatus;
	}
}