package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.MeetingPartyRole;
import com.tools20022.repository.dict.entity.Person;

/**
 * Party appointed by the rights holder to attend a meeting and vote in its
 * name. The proxy can be the chairman of the meeting or another party selected
 * by the issuer. The proxy can also be a third party selected by the rights
 * holder. The proxy can be assigned by a specific instruction or pre-assigned
 * by the issuer of the meeting.
 */
public class AssignedProxyRole extends MeetingPartyRole {

	private Person ProxyPerson;
	private Person PreAssignedProxyRole;

	public Person getProxyPerson() {
		return ProxyPerson;
	}

	public void setProxyPerson(Person ProxyPerson) {
		this.ProxyPerson = ProxyPerson;
	}

	public Person getPreAssignedProxyRole() {
		return PreAssignedProxyRole;
	}

	public void setPreAssignedProxyRole(Person PreAssignedProxyRole) {
		this.PreAssignedProxyRole = PreAssignedProxyRole;
	}
}