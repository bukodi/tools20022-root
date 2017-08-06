package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;

/**
 * Entity involved in an activity.
 */
public class Party {

	private ContactPoint ContactPoint;
	private PartyIdentificationInformation Identification;

	public ContactPoint getContactPoint() {
		return ContactPoint;
	}

	public void setContactPoint(ContactPoint ContactPoint) {
		this.ContactPoint = ContactPoint;
	}

	public PartyIdentificationInformation getIdentification() {
		return Identification;
	}

	public void setIdentification(PartyIdentificationInformation Identification) {
		this.Identification = Identification;
	}
}