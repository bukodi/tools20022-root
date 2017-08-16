package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.CorporateActionElection3;
import java.util.Optional;

/**
 * Scope This message is sent by a CSD to the issuer (or its agent) to request
 * the cancellation of a previously sent Agent Corporate Action Election Advice
 * message. Usage This message may only be used to cancel an entire Agent
 * Corporate Action Election Advice message that was previously sent by the CSD.
 * No partial cancellation is allowed. This message must contain the
 * identification of the Agent Corporate Action Election Advice to be cancelled,
 * the agent identification and the corporate action references. This message
 * may also contain details of the election advice to be cancelled, but this is
 * not recommended.
 */
public class AgentCAElectionCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAElectionAdviceIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private Optional<CorporateActionElection3> ElectionDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return AgentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(
			DocumentIdentification8 AgentCAElectionAdviceIdentification) {
		this.AgentCAElectionAdviceIdentification = AgentCAElectionAdviceIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public Optional<CorporateActionElection3> getElectionDetails() {
		return ElectionDetails;
	}

	public void setElectionDetails(
			Optional<CorporateActionElection3> ElectionDetails) {
		this.ElectionDetails = ElectionDetails;
	}
}