package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Meeting;
import com.tools20022.repository.dict.entity.Person;

/**
 * Person to be contacted in a given organisation. In the corporate action
 * domain (including meeting notifications) , it is the contact person at the
 * party organising the meeting, at the issuer or at an intermediary.
 */
public class ContactPersonRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Role Role;
	private Meeting Meeting;
	private Person Person;

	public Role getRole() {
		return Role;
	}

	public void setRole(Role Role) {
		this.Role = Role;
	}

	public Meeting getMeeting() {
		return Meeting;
	}

	public void setMeeting(Meeting Meeting) {
		this.Meeting = Meeting;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person Person) {
		this.Person = Person;
	}
}