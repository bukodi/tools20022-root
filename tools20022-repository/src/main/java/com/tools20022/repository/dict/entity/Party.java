package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.RolePlayer;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import com.tools20022.repository.dict.codeset.MoneyLaunderingCheckCode;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.PowerOfAttorney;
import com.tools20022.repository.dict.entity.Security;

/**
 * Entity involved in an activity.
 */
public class Party extends RolePlayer
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ContactPoint ContactPoint;
	private PartyIdentificationInformation Identification;
	private MoneyLaunderingCheckCode MoneyLaunderingCheck;
	private Tax TaxationConditions;
	private Location Domicile;
	private Location Residence;
	private PowerOfAttorney PowerOfAttorney;
	private Location Location;
	private Security CloseLinkSecurity;

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

	public MoneyLaunderingCheckCode getMoneyLaunderingCheck() {
		return MoneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(
			MoneyLaunderingCheckCode MoneyLaunderingCheck) {
		this.MoneyLaunderingCheck = MoneyLaunderingCheck;
	}

	public Tax getTaxationConditions() {
		return TaxationConditions;
	}

	public void setTaxationConditions(Tax TaxationConditions) {
		this.TaxationConditions = TaxationConditions;
	}

	public Location getDomicile() {
		return Domicile;
	}

	public void setDomicile(Location Domicile) {
		this.Domicile = Domicile;
	}

	public Location getResidence() {
		return Residence;
	}

	public void setResidence(Location Residence) {
		this.Residence = Residence;
	}

	public PowerOfAttorney getPowerOfAttorney() {
		return PowerOfAttorney;
	}

	public void setPowerOfAttorney(PowerOfAttorney PowerOfAttorney) {
		this.PowerOfAttorney = PowerOfAttorney;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}

	public Security getCloseLinkSecurity() {
		return CloseLinkSecurity;
	}

	public void setCloseLinkSecurity(Security CloseLinkSecurity) {
		this.CloseLinkSecurity = CloseLinkSecurity;
	}
}