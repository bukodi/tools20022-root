package com.tools20022.repository.catalogue.msgdef.seev;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.DocumentIdentification8;
import com.tools20022.repository.dict.msg.CorporateActionInformation1;
import com.tools20022.repository.dict.msg.EntitlementAdvice1;

/**
 * Scope This message is sent by a CSD to an issuer (or its agent) to provide
 * distribution breakdown information for the proceeds that are to be delivered
 * outside the CSD (e.g. when the proceeds are not eligible in the CSD). Usage
 * This message is used to provide distribution breakdown information
 * (securities and/or cash) per account for a specific corporate action option.
 * Note: the delivery details are sent through the Agent Corporate Action
 * Information Advice.
 */
public class AgentCADistributionBreakdownAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification8 Identification;
	private CorporateActionInformation1 CorporateActionGeneralInformation;
	private EntitlementAdvice1 CorporateActionDistributionDetails;

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

	public EntitlementAdvice1 getCorporateActionDistributionDetails() {
		return CorporateActionDistributionDetails;
	}

	public void setCorporateActionDistributionDetails(
			EntitlementAdvice1 CorporateActionDistributionDetails) {
		this.CorporateActionDistributionDetails = CorporateActionDistributionDetails;
	}
}