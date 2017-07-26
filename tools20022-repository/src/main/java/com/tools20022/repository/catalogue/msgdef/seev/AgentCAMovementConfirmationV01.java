package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionSecuritiesMovement1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CashMovement3;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to confirm
 * the settlement of resource movements. Usage This message is used to confirm
 * the settlement of the movements resulting from an: - Agent Corporate Action
 * Movement Instruction message. It confirms the settlement of the exercised
 * resources and/or proceeds movements in which case the building block Agent
 * Corporate Action Movement Instruction Identification must be present. An
 * Agent Corporate Action Movement Instruction message may be responded to by
 * more than one Agent Corporate Action Movement Confirmation messages. - Agent
 * Corporate Action Global Distribution Status Advice authorising the global
 * distribution. It confirms the settlement of the exercised resources and/or
 * proceeds movements. The building block Agent Corporate Action Global
 * Distribution Status Advice Identification must be present. An Agent Corporate
 * Action Global Distribution Status Advice message may be responded to by more
 * than one Agent Corporate Action Movement Confirmation messages. - Agent
 * Corporate Action Election Status Advice that rejects an election advice. It
 * confirms the return of the exercised resources. The building block Agent
 * Corporate Action Election Status Advice Identification must be present. An
 * Agent Corporate Action Election Status Advice message may be responded to by
 * more than one Agent Corporate Action Movement Confirmation messages. - Agent
 * Corporate Action Election Status Advice where an election cancellation
 * request has been accepted. It confirms the return of the exercised resources.
 * The building block Agent Corporate Action Election Status Advice
 * Identification must be present. An Agent Corporate Action Election Status
 * Advice message may be responded to by more than one Agent Corporate Action
 * Movement Confirmation messages.
 */
public class AgentCAMovementConfirmationV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAMovementInstructionIdentification;
	private DocumentIdentification8 AgentCAElectionStatusAdviceIdentification;
	private DocumentIdentification8 AgentCAGlobalDistributionStatusAdviceIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private Optional<CorporateActionSecuritiesMovement1> SecuritiesMovementDetails;
	private Optional<CashMovement3> CashMovementDetails;

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

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public Optional<CorporateActionSecuritiesMovement1> getSecuritiesMovementDetails() {
		return SecuritiesMovementDetails;
	}

	public void setSecuritiesMovementDetails(
			Optional<CorporateActionSecuritiesMovement1> SecuritiesMovementDetails) {
		this.SecuritiesMovementDetails = SecuritiesMovementDetails;
	}

	public Optional<CashMovement3> getCashMovementDetails() {
		return CashMovementDetails;
	}

	public void setCashMovementDetails(
			Optional<CashMovement3> CashMovementDetails) {
		this.CashMovementDetails = CashMovementDetails;
	}
}