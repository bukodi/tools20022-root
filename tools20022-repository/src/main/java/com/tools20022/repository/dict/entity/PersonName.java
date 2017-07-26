package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PartyName;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.NamePrefix1Code;
import com.tools20022.repository.dict.entity.PersonIdentification;

/**
 * Name by which a person is known and that is usually used to identify that
 * person.
 */
public class PersonName extends PartyName {

	private Max35Text BirthName;
	private NamePrefix1Code NamePrefix;
	private Max35Text GivenName;
	private Max35Text MiddleName;
	private Max35Text NameSuffix;
	private PersonIdentification Identification;

	public Max35Text getBirthName() {
		return BirthName;
	}

	public void setBirthName(Max35Text BirthName) {
		this.BirthName = BirthName;
	}

	public NamePrefix1Code getNamePrefix() {
		return NamePrefix;
	}

	public void setNamePrefix(NamePrefix1Code NamePrefix) {
		this.NamePrefix = NamePrefix;
	}

	public Max35Text getGivenName() {
		return GivenName;
	}

	public void setGivenName(Max35Text GivenName) {
		this.GivenName = GivenName;
	}

	public Max35Text getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(Max35Text MiddleName) {
		this.MiddleName = MiddleName;
	}

	public Max35Text getNameSuffix() {
		return NameSuffix;
	}

	public void setNameSuffix(Max35Text NameSuffix) {
		this.NameSuffix = NameSuffix;
	}

	public PersonIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(PersonIdentification Identification) {
		this.Identification = Identification;
	}
}