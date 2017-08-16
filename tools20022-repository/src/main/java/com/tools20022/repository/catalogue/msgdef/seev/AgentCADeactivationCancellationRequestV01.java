package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionDeactivationInstruction1;
import java.util.Optional;

/**
 * Scope This message is sent by an issuer (or its agent) to the CSD to request
 * the cancellation of a previously sent corporate action deactivation
 * instruction. Usage This message is used to request the cancellation of a
 * pending deactivation instruction. The cancellation must apply to exactly the
 * same level as the original instruction, ie to the entire CA event or to an
 * option as per the original instruction. This message must be sent before the
 * deactivation execution date. In case a corporate action or option is already
 * deactivated, this message can not be used to reactivate the corporate action
 * entire event or option; the notification advice message must be used to
 * reactivate a corporate action or option.
 */
public class AgentCADeactivationCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCADeactivationInstructionIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private Optional<CorporateActionDeactivationInstruction1> DeactivationInstructionDetails;

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

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public Optional<CorporateActionDeactivationInstruction1> getDeactivationInstructionDetails() {
		return DeactivationInstructionDetails;
	}

	public void setDeactivationInstructionDetails(
			Optional<CorporateActionDeactivationInstruction1> DeactivationInstructionDetails) {
		this.DeactivationInstructionDetails = DeactivationInstructionDetails;
	}
}