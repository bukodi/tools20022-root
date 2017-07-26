package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionAdditionalInformation1;
import java.util.Optional;
import com.tools20022.repository.dict.choice.CorporateActionInformationStatus1Choice;

/**
 * Scope This message is sent by an issuer (or its agent) to a CSD to report the
 * status, or change in status, of an information advice. Usage This message
 * must be used in response to an Agent Corporate Action Information Advice in
 * the case of a rejection. However, it may also be used to report other
 * statuses. The information advice identification must be present to link this
 * message to the information advice for which the status is provided.
 */
public class AgentCAInformationStatusAdviceV01 {

	private DocumentIdentification8 Identification;
	private DocumentIdentification8 AgentCAInformationAdviceIdentification;
	private Optional<CorporateActionAdditionalInformation1> CorporateActionAdditionalInformation;
	private CorporateActionInformationStatus1Choice InformationStatusDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public DocumentIdentification8 getAgentCAInformationAdviceIdentification() {
		return AgentCAInformationAdviceIdentification;
	}

	public void setAgentCAInformationAdviceIdentification(
			DocumentIdentification8 AgentCAInformationAdviceIdentification) {
		this.AgentCAInformationAdviceIdentification = AgentCAInformationAdviceIdentification;
	}

	public Optional<CorporateActionAdditionalInformation1> getCorporateActionAdditionalInformation() {
		return CorporateActionAdditionalInformation;
	}

	public void setCorporateActionAdditionalInformation(
			Optional<CorporateActionAdditionalInformation1> CorporateActionAdditionalInformation) {
		this.CorporateActionAdditionalInformation = CorporateActionAdditionalInformation;
	}

	public CorporateActionInformationStatus1Choice getInformationStatusDetails() {
		return InformationStatusDetails;
	}

	public void setInformationStatusDetails(
			CorporateActionInformationStatus1Choice InformationStatusDetails) {
		this.InformationStatusDetails = InformationStatusDetails;
	}
}