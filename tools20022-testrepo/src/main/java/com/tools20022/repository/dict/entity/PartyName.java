package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max140Text;

/**
 * Name by which a party is known and which is usually used to identify that
 * party.
 */
public class PartyName {

	private Max140Text Name;

	public Max140Text getName() {
		return Name;
	}

	public void setName(Max140Text Name) {
		this.Name = Name;
	}
}