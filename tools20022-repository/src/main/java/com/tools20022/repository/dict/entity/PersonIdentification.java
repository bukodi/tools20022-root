package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.entity.PersonName;

/**
 * Unique and unambiguous way to identify a person.
 */
public class PersonIdentification extends PartyIdentificationInformation
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text SocialSecurityNumber;
	private Person Person;
	private PersonName PersonName;
	private Max35Text DriversLicenseNumber;
	private Max35Text AlienRegistrationNumber;
	private Max35Text PassportNumber;
	private Max35Text IdentityCardNumber;
	private Max35Text EmployerIdentificationNumber;

	public Max35Text getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public void setSocialSecurityNumber(Max35Text SocialSecurityNumber) {
		this.SocialSecurityNumber = SocialSecurityNumber;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person Person) {
		this.Person = Person;
	}

	public PersonName getPersonName() {
		return PersonName;
	}

	public void setPersonName(PersonName PersonName) {
		this.PersonName = PersonName;
	}

	public Max35Text getDriversLicenseNumber() {
		return DriversLicenseNumber;
	}

	public void setDriversLicenseNumber(Max35Text DriversLicenseNumber) {
		this.DriversLicenseNumber = DriversLicenseNumber;
	}

	public Max35Text getAlienRegistrationNumber() {
		return AlienRegistrationNumber;
	}

	public void setAlienRegistrationNumber(Max35Text AlienRegistrationNumber) {
		this.AlienRegistrationNumber = AlienRegistrationNumber;
	}

	public Max35Text getPassportNumber() {
		return PassportNumber;
	}

	public void setPassportNumber(Max35Text PassportNumber) {
		this.PassportNumber = PassportNumber;
	}

	public Max35Text getIdentityCardNumber() {
		return IdentityCardNumber;
	}

	public void setIdentityCardNumber(Max35Text IdentityCardNumber) {
		this.IdentityCardNumber = IdentityCardNumber;
	}

	public Max35Text getEmployerIdentificationNumber() {
		return EmployerIdentificationNumber;
	}

	public void setEmployerIdentificationNumber(
			Max35Text EmployerIdentificationNumber) {
		this.EmployerIdentificationNumber = EmployerIdentificationNumber;
	}
}