package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Person;

/**
 * Specifies the members of a household in relation with the ownership of an
 * account.
 */
public class Household {

	private Person Member;

	public Person getMember() {
		return Member;
	}

	public void setMember(Person Member) {
		this.Member = Member;
	}
}