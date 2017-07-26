package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.Organisation;

/**
 * Strategy is organisation based.
 */
public class OrganisationStrategy extends PortfolioStrategy {

	private Organisation Organisation;

	public Organisation getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation Organisation) {
		this.Organisation = Organisation;
	}
}