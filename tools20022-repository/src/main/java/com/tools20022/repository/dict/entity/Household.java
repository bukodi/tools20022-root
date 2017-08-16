package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Person;

/**
 * Specifies the members of a household in relation with the ownership of an
 * account.
 */
public class Household extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Person Member;

	public Person getMember() {
		return Member;
	}

	public void setMember(Person Member) {
		this.Member = Member;
	}
}