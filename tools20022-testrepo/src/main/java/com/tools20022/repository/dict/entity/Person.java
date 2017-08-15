package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.InstanceOf;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.codeset.GenderCode;
import com.tools20022.repository.dict.codeset.LanguageCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ResidentialStatusCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CivilStatusCode;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 */
public class Person implements InstanceOf<MMBusinessComponent> {

	private GenderCode Gender;
	private LanguageCode Language;
	private ISODateTime BirthDate;
	private Max35Text Profession;
	private ResidentialStatusCode ResidentialStatus;
	private YesNoIndicator MinorIndicator;
	private Max35Text BusinessFunctionTitle;
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