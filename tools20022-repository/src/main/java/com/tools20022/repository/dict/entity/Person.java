package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.codeset.GenderCode;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ResidentialStatusCode;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.PersonIdentification;
import com.tools20022.repository.dict.entity.EmployingPartyRole;
import com.tools20022.repository.dict.entity.MeetingAttendeeRole;
import com.tools20022.repository.dict.entity.AssignedProxyRole;
import com.tools20022.repository.dict.entity.PersonProfile;
import com.tools20022.repository.dict.entity.ContactPersonRole;
import com.tools20022.repository.dict.entity.Household;
import com.tools20022.repository.dict.codeset.CivilStatusCode;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 */
public class Person extends Party {

	private GenderCode Gender;
	private LanguageCode Language;
	private ISODateTime BirthDate;
	private Location PlaceOfBirth;
	private Max35Text Profession;
	private ResidentialStatusCode ResidentialStatus;
	private Country Nationality;
	private YesNoIndicator MinorIndicator;
	private Max35Text BusinessFunctionTitle;
	private PersonIdentification PersonIdentification;
	private EmployingPartyRole EmployingParty;
	private MeetingAttendeeRole MeetingAttendee;
	private AssignedProxyRole RelatedRole;
	private AssignedProxyRole PreAssignedProxyPerson;
	private PersonProfile PersonProfile;
	private ContactPersonRole ContactPersonRole;
	private Household Household;
	private CivilStatusCode CivilStatus;
	private ISODateTime DeathDate;

	public GenderCode getGender() {
		return Gender;
	}

	public void setGender(GenderCode Gender) {
		this.Gender = Gender;
	}

	public LanguageCode getLanguage() {
		return Language;
	}

	public void setLanguage(LanguageCode Language) {
		this.Language = Language;
	}

	public ISODateTime getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(ISODateTime BirthDate) {
		this.BirthDate = BirthDate;
	}

	public Location getPlaceOfBirth() {
		return PlaceOfBirth;
	}

	public void setPlaceOfBirth(Location PlaceOfBirth) {
		this.PlaceOfBirth = PlaceOfBirth;
	}

	public Max35Text getProfession() {
		return Profession;
	}

	public void setProfession(Max35Text Profession) {
		this.Profession = Profession;
	}

	public ResidentialStatusCode getResidentialStatus() {
		return ResidentialStatus;
	}

	public void setResidentialStatus(ResidentialStatusCode ResidentialStatus) {
		this.ResidentialStatus = ResidentialStatus;
	}

	public Country getNationality() {
		return Nationality;
	}

	public void setNationality(Country Nationality) {
		this.Nationality = Nationality;
	}

	public YesNoIndicator getMinorIndicator() {
		return MinorIndicator;
	}

	public void setMinorIndicator(YesNoIndicator MinorIndicator) {
		this.MinorIndicator = MinorIndicator;
	}

	public Max35Text getBusinessFunctionTitle() {
		return BusinessFunctionTitle;
	}

	public void setBusinessFunctionTitle(Max35Text BusinessFunctionTitle) {
		this.BusinessFunctionTitle = BusinessFunctionTitle;
	}

	public PersonIdentification getPersonIdentification() {
		return PersonIdentification;
	}

	public void setPersonIdentification(
			PersonIdentification PersonIdentification) {
		this.PersonIdentification = PersonIdentification;
	}

	public EmployingPartyRole getEmployingParty() {
		return EmployingParty;
	}

	public void setEmployingParty(EmployingPartyRole EmployingParty) {
		this.EmployingParty = EmployingParty;
	}

	public MeetingAttendeeRole getMeetingAttendee() {
		return MeetingAttendee;
	}

	public void setMeetingAttendee(MeetingAttendeeRole MeetingAttendee) {
		this.MeetingAttendee = MeetingAttendee;
	}

	public AssignedProxyRole getRelatedRole() {
		return RelatedRole;
	}

	public void setRelatedRole(AssignedProxyRole RelatedRole) {
		this.RelatedRole = RelatedRole;
	}

	public AssignedProxyRole getPreAssignedProxyPerson() {
		return PreAssignedProxyPerson;
	}

	public void setPreAssignedProxyPerson(
			AssignedProxyRole PreAssignedProxyPerson) {
		this.PreAssignedProxyPerson = PreAssignedProxyPerson;
	}

	public PersonProfile getPersonProfile() {
		return PersonProfile;
	}

	public void setPersonProfile(PersonProfile PersonProfile) {
		this.PersonProfile = PersonProfile;
	}

	public ContactPersonRole getContactPersonRole() {
		return ContactPersonRole;
	}

	public void setContactPersonRole(ContactPersonRole ContactPersonRole) {
		this.ContactPersonRole = ContactPersonRole;
	}

	public Household getHousehold() {
		return Household;
	}

	public void setHousehold(Household Household) {
		this.Household = Household;
	}

	public CivilStatusCode getCivilStatus() {
		return CivilStatus;
	}

	public void setCivilStatus(CivilStatusCode CivilStatus) {
		this.CivilStatus = CivilStatus;
	}

	public ISODateTime getDeathDate() {
		return DeathDate;
	}

	public void setDeathDate(ISODateTime DeathDate) {
		this.DeathDate = DeathDate;
	}
}