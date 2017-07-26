package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.codeset.EligibilityCode;

/**
 * Requestor of the quote
 */
public class QuoteRequestor extends InformationPartyRole {

	private EligibilityCode RequestorEligibility;

	public EligibilityCode getRequestorEligibility() {
		return RequestorEligibility;
	}

	public void setRequestorEligibility(EligibilityCode RequestorEligibility) {
		this.RequestorEligibility = RequestorEligibility;
	}
}