package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.codeset.EligibilityCode;

/**
 * Requestor of the quote
 */
public class QuoteRequestor extends InformationPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private EligibilityCode RequestorEligibility;

	public EligibilityCode getRequestorEligibility() {
		return RequestorEligibility;
	}

	public void setRequestorEligibility(EligibilityCode RequestorEligibility) {
		this.RequestorEligibility = RequestorEligibility;
	}
}