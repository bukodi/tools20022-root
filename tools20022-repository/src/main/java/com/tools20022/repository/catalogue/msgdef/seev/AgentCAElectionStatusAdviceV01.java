package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.choice.ElectionAdviceStatus1Choice;
import com.tools20022.repository.dict.choice.ElectionCancellationStatus1Choice;
import com.tools20022.repository.dict.choice.ElectionAmendmentStatus1Choice;

/**
 * Scope This message is sent by an issuer (or its agent) to the CSD to report
 * the status, or a change in status, of: - a corporate action election advice;
 * - an election cancellation request; or - an election amendment request. Usage
 * This message must be sent in response to an: - Agent Corporation Action
 * Election Advice to provide the status of an election advice in the case of a
 * rejection. However, it may also be used in all other situations, in which
 * case, the building blocks Election Advice Identification and the Election
 * Advice Status must be present. - Agent Corporation Action Election
 * Cancellation Request to provide the status of the cancellation request, in
 * which case, the building blocks Election Cancellation Request Identification
 * and the Election Cancellation Request Status must be present. - Agent
 * Corporation Action Election Amendment Request to provide the status of the
 * amendment request, in which case, the building blocks Election Amendment
 * Request Identification and the Election Amendment Request Status must be
 * present.
 */
public class AgentCAElectionStatusAdviceV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAElectionAdviceIdentification;
	private DocumentIdentification8 AgentCAElectionCancellationRequestIdentification;
	private DocumentIdentification8 AgentCAElectionAmendmentRequestIdentification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private ElectionAdviceStatus1Choice ElectionAdviceStatus;
	private ElectionCancellationStatus1Choice ElectionCancellationRequestStatus;
	private ElectionAmendmentStatus1Choice ElectionAmendmentRequestStatus;

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

	public DocumentIdentification8 getAgentCAElectionCancellationRequestIdentification() {
		return AgentCAElectionCancellationRequestIdentification;
	}

	public void setAgentCAElectionCancellationRequestIdentification(
			DocumentIdentification8 AgentCAElectionCancellationRequestIdentification) {
		this.AgentCAElectionCancellationRequestIdentification = AgentCAElectionCancellationRequestIdentification;
	}

	public DocumentIdentification8 getAgentCAElectionAmendmentRequestIdentification() {
		return AgentCAElectionAmendmentRequestIdentification;
	}

	public void setAgentCAElectionAmendmentRequestIdentification(
			DocumentIdentification8 AgentCAElectionAmendmentRequestIdentification) {
		this.AgentCAElectionAmendmentRequestIdentification = AgentCAElectionAmendmentRequestIdentification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public ElectionAdviceStatus1Choice getElectionAdviceStatus() {
		return ElectionAdviceStatus;
	}

	public void setElectionAdviceStatus(
			ElectionAdviceStatus1Choice ElectionAdviceStatus) {
		this.ElectionAdviceStatus = ElectionAdviceStatus;
	}

	public ElectionCancellationStatus1Choice getElectionCancellationRequestStatus() {
		return ElectionCancellationRequestStatus;
	}

	public void setElectionCancellationRequestStatus(
			ElectionCancellationStatus1Choice ElectionCancellationRequestStatus) {
		this.ElectionCancellationRequestStatus = ElectionCancellationRequestStatus;
	}

	public ElectionAmendmentStatus1Choice getElectionAmendmentRequestStatus() {
		return ElectionAmendmentRequestStatus;
	}

	public void setElectionAmendmentRequestStatus(
			ElectionAmendmentStatus1Choice ElectionAmendmentRequestStatus) {
		this.ElectionAmendmentRequestStatus = ElectionAmendmentRequestStatus;
	}
}