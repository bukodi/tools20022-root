package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.AccountPartyRole;
import com.tools20022.repository.dict.entity.Organisation;

/**
 * Officer who has some rights to represent a given organisation. In account
 * management, it is the person to be contacted by the account servicer.
 */
public class RepresentativeOfficer extends AccountPartyRole
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