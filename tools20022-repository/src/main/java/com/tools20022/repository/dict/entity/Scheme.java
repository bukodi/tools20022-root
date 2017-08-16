package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.Rating;
import com.tools20022.repository.dict.entity.CreditorRole;
import com.tools20022.repository.dict.entity.InformationPartyRole;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.entity.Sector;
import com.tools20022.repository.dict.entity.AssetClassification;

/**
 * Information regarding an enumerated code list and its owner.
 */
public class Scheme extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text NameShort;
	private Max35Text Code;
	private GenericIdentification Identification;
	private Rating Rating;
	private CreditorRole CreditorRole;
	private InformationPartyRole InformationPartyRole;
	private Max35Text Version;
	private DateTimePeriod AssessmentValidityPeriod;
	private Max70Text NameLong;
	private Max350Text Description;
	private Max35Text DomainValueCode;
	private Max70Text DomainValueName;
	private Sector Sector;
	private AssetClassification AssetClassification;

	public Max35Text getNameShort() {
		return NameShort;
	}

	public void setNameShort(Max35Text NameShort) {
		this.NameShort = NameShort;
	}

	public Max35Text getCode() {
		return Code;
	}

	public void setCode(Max35Text Code) {
		this.Code = Code;
	}

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}

	public Rating getRating() {
		return Rating;
	}

	public void setRating(Rating Rating) {
		this.Rating = Rating;
	}

	public CreditorRole getCreditorRole() {
		return CreditorRole;
	}

	public void setCreditorRole(CreditorRole CreditorRole) {
		this.CreditorRole = CreditorRole;
	}

	public InformationPartyRole getInformationPartyRole() {
		return InformationPartyRole;
	}

	public void setInformationPartyRole(
			InformationPartyRole InformationPartyRole) {
		this.InformationPartyRole = InformationPartyRole;
	}

	public Max35Text getVersion() {
		return Version;
	}

	public void setVersion(Max35Text Version) {
		this.Version = Version;
	}

	public DateTimePeriod getAssessmentValidityPeriod() {
		return AssessmentValidityPeriod;
	}

	public void setAssessmentValidityPeriod(
			DateTimePeriod AssessmentValidityPeriod) {
		this.AssessmentValidityPeriod = AssessmentValidityPeriod;
	}

	public Max70Text getNameLong() {
		return NameLong;
	}

	public void setNameLong(Max70Text NameLong) {
		this.NameLong = NameLong;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public Max35Text getDomainValueCode() {
		return DomainValueCode;
	}

	public void setDomainValueCode(Max35Text DomainValueCode) {
		this.DomainValueCode = DomainValueCode;
	}

	public Max70Text getDomainValueName() {
		return DomainValueName;
	}

	public void setDomainValueName(Max70Text DomainValueName) {
		this.DomainValueName = DomainValueName;
	}

	public Sector getSector() {
		return Sector;
	}

	public void setSector(Sector Sector) {
		this.Sector = Sector;
	}

	public AssetClassification getAssetClassification() {
		return AssetClassification;
	}

	public void setAssetClassification(AssetClassification AssetClassification) {
		this.AssetClassification = AssetClassification;
	}
}