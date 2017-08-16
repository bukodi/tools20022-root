package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.MandatoryCorporateAction;
import com.tools20022.repository.dict.entity.CorporateActionOption;

/**
 * Mandatory with choice corporate action event that involves a choice on behalf
 * of the owner of the securities. The shareholders are given a chance to choose
 * among several options.
 */
public class ChoiceCorporateAction extends MandatoryCorporateAction
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionOption CorporateActionOptionDefinition;

	public CorporateActionOption getCorporateActionOptionDefinition() {
		return CorporateActionOptionDefinition;
	}

	public void setCorporateActionOptionDefinition(
			CorporateActionOption CorporateActionOptionDefinition) {
		this.CorporateActionOptionDefinition = CorporateActionOptionDefinition;
	}
}