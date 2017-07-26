package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.GlobalDistributionStatus1;
import com.tools20022.repository.dict.msg.IndividualMovementStatus1;

/**
 * Scope This message is sent by an issuer (or its agent) to the CSD to
 * authorise/prohibit the CSD to process the entitlement movements. Usage This
 * message is used to authorise/prohibit the CSD to process the movements
 * requested in the Global Distribution Authorisation Request message. Once the
 * amendment request has been accepted by the issuer (or its agent), the CSD
 * will process any resource movement and send an Agent Corporate Action
 * Election Advice message with the function, option change, to confirm that the
 * amendment has been booked at the CSD. The issuer (or its agent) can provide
 * the status in 2 different ways: - Provide a global status, in which case the
 * building block Global Movement Status must be present; or - Provide a status
 * by individual movements, in which case, the building block Individual
 * Movement Status must be present. An individual movement cannot be rejected.
 */
public class AgentCAGlobalDistributionStatusAdviceV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAGlobalDistributionAuthorisationRequestIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private GlobalDistributionStatus1 GlobalMovementStatus;
	private IndividualMovementStatus1 IndividualMovementStatus;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAGlobalDistributionAuthorisationRequestIdentification() {
		return AgentCAGlobalDistributionAuthorisationRequestIdentification;
	}

	public void setAgentCAGlobalDistributionAuthorisationRequestIdentification(
			DocumentIdentification8 AgentCAGlobalDistributionAuthorisationRequestIdentification) {
		this.AgentCAGlobalDistributionAuthorisationRequestIdentification = AgentCAGlobalDistributionAuthorisationRequestIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public GlobalDistributionStatus1 getGlobalMovementStatus() {
		return GlobalMovementStatus;
	}

	public void setGlobalMovementStatus(
			GlobalDistributionStatus1 GlobalMovementStatus) {
		this.GlobalMovementStatus = GlobalMovementStatus;
	}

	public IndividualMovementStatus1 getIndividualMovementStatus() {
		return IndividualMovementStatus;
	}

	public void setIndividualMovementStatus(
			IndividualMovementStatus1 IndividualMovementStatus) {
		this.IndividualMovementStatus = IndividualMovementStatus;
	}
}