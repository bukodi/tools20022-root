package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.Organisation;

/**
 * Strategy is organisation based.
 */
public class OrganisationStrategy extends PortfolioStrategy
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Organisation Organisation;

	public Organisation getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation Organisation) {
		this.Organisation = Organisation;
	}
}