package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.MeetingPartyRole;
import com.tools20022.repository.dict.entity.Person;

/**
 * Security holder who will attend and vote at the meeting in person and/or a
 * person assigned by the security holder to attend the meeting without having
 * any voting rights or taking any action.
 */
public class MeetingAttendeeRole extends MeetingPartyRole {

	private Person Person;

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person Person) {
		this.Person = Person;
	}
}