package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.OrganisationIdentification;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 */
public class Organisation {

	private OrganisationIdentification OrganisationIdentification;

	public OrganisationIdentification getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}
}