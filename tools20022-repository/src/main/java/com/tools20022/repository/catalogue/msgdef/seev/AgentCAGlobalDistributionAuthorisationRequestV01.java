package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.GlobalDistributionRequest1;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to request
 * the authorisation to process the entitlement movements (cash and/or
 * securities) calculated by the CSD for a given corporate action entire event,
 * a given corporate action option and optionally a given resource. This message
 * can also be sent to request the issuer (or its agent) to make available /
 * deliver the relevant resources to the CSD. Usage This message is used to
 * request the authorisation to process the entitlement movements calculated by
 * the CSD for a given corporate action event and option. An Agent Corporate
 * Action Global Distribution Authorisation Request message must be sent for
 * each option and if several resources are associated to an option, an Agent
 * Corporate Action Global Distribution Authorisation Request message can be
 * sent for each resource. This message can also be used to pre-advise a global
 * distribution authorisation request, in which case the value of the field
 * pre-advice indicator must be set to yes.
 */
public class AgentCAGlobalDistributionAuthorisationRequestV01 {

	private DocumentIdentification8 Identification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private GlobalDistributionRequest1 GlobalDistributionDetails;

	public DocumentIdentification8 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification8 Identification) {
		this.Identification = Identification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return CorporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(
			CorporateActionInformation1 CorporateActionGeneralInformation) {
		this.CorporateActionGeneralInformation = CorporateActionGeneralInformation;
	}

	public GlobalDistributionRequest1 getGlobalDistributionDetails() {
		return GlobalDistributionDetails;
	}

	public void setGlobalDistributionDetails(
			GlobalDistributionRequest1 GlobalDistributionDetails) {
		this.GlobalDistributionDetails = GlobalDistributionDetails;
	}
}