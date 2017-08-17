package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.CorporateActionOption;
import com.tools20022.repository.dict.entity.CorporateActionServicing;

/**
 * Option servicing process which calculates the entitlement based on a
 * corporate action option.
 */
public class CorporateActionOptionServicing extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionOption RelatedOption;
	private CorporateActionServicing RelatedServicing;

	public CorporateActionOption getRelatedOption() {
		return RelatedOption;
	}

	public void setRelatedOption(CorporateActionOption RelatedOption) {
		this.RelatedOption = RelatedOption;
	}

	public CorporateActionServicing getRelatedServicing() {
		return RelatedServicing;
	}

	public void setRelatedServicing(CorporateActionServicing RelatedServicing) {
		this.RelatedServicing = RelatedServicing;
	}
}