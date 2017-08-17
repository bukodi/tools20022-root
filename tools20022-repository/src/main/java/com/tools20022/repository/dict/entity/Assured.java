package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InsurancePartyRole;
import com.tools20022.repository.dict.codeset.AssuredTypeCode;

/**
 * Party that is covered under the assurance policy.
 */
public class Assured extends InsurancePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AssuredTypeCode AssuredType;

	public AssuredTypeCode getAssuredType() {
		return AssuredType;
	}

	public void setAssuredType(AssuredTypeCode AssuredType) {
		this.AssuredType = AssuredType;
	}
}