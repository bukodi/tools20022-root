package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 */
public class PartyName {

	private Max140Text Name;
	private PartyIdentificationInformation PartyIdentification;

	public Max140Text getName() {
		return Name;
	}

	public void setName(Max140Text Name) {
		this.Name = Name;
	}

	public PartyIdentificationInformation getPartyIdentification() {
		return PartyIdentification;
	}

	public void setPartyIdentification(
			PartyIdentificationInformation PartyIdentification) {
		this.PartyIdentification = PartyIdentification;
	}
}