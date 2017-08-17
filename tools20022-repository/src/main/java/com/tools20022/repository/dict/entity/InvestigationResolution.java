package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.InvestigationCase;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Specifies the actions taken as a result of an investigation.
 */
public class InvestigationResolution extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private InvestigationCase InvestigationCase;
	private Max35Text InvestigationCaseReference;

	public InvestigationCase getInvestigationCase() {
		return InvestigationCase;
	}

	public void setInvestigationCase(InvestigationCase InvestigationCase) {
		this.InvestigationCase = InvestigationCase;
	}

	public Max35Text getInvestigationCaseReference() {
		return InvestigationCaseReference;
	}

	public void setInvestigationCaseReference(
			Max35Text InvestigationCaseReference) {
		this.InvestigationCaseReference = InvestigationCaseReference;
	}
}