package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.entity.SecuritiesModification;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.LegalStructureCode;
import com.tools20022.repository.dict.entity.Sector;
import com.tools20022.repository.dict.entity.BuyOrSellIndicationOfInterest;
import com.tools20022.repository.dict.entity.OrganisationStrategy;
import com.tools20022.repository.dict.entity.OrganisationHierarchy;
import com.tools20022.repository.dict.entity.RepresentativeOfficer;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
 */
public class Organisation extends Party
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text Purpose;
	private ISODateTime RegistrationDate;
	private OrganisationIdentification OrganisationIdentification;
	private Organisation ParentOrganisation;
	private Organisation Branch;
	private SecuritiesModification SecuritiesModification;
	private Location PlaceOfOperation;
	private Location PlaceOfRegistration;
	private Max350Text Description;
	private LegalStructureCode LegalStructure;
	private Sector Sector;
	private BuyOrSellIndicationOfInterest RelatedIndicationOfInterest;
	private OrganisationStrategy Strategy;
	private OrganisationHierarchy OrganisationHierarchy;
	private RepresentativeOfficer RepresentativeOfficer;
	private ISODate EstablishmentDate;

	public Max35Text getPurpose() {
		return Purpose;
	}

	public void setPurpose(Max35Text Purpose) {
		this.Purpose = Purpose;
	}

	public ISODateTime getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(ISODateTime RegistrationDate) {
		this.RegistrationDate = RegistrationDate;
	}

	public OrganisationIdentification getOrganisationIdentification() {
		return OrganisationIdentification;
	}

	public void setOrganisationIdentification(
			OrganisationIdentification OrganisationIdentification) {
		this.OrganisationIdentification = OrganisationIdentification;
	}

	public Organisation getParentOrganisation() {
		return ParentOrganisation;
	}

	public void setParentOrganisation(Organisation ParentOrganisation) {
		this.ParentOrganisation = ParentOrganisation;
	}

	public Organisation getBranch() {
		return Branch;
	}

	public void setBranch(Organisation Branch) {
		this.Branch = Branch;
	}

	public SecuritiesModification getSecuritiesModification() {
		return SecuritiesModification;
	}

	public void setSecuritiesModification(
			SecuritiesModification SecuritiesModification) {
		this.SecuritiesModification = SecuritiesModification;
	}

	public Location getPlaceOfOperation() {
		return PlaceOfOperation;
	}

	public void setPlaceOfOperation(Location PlaceOfOperation) {
		this.PlaceOfOperation = PlaceOfOperation;
	}

	public Location getPlaceOfRegistration() {
		return PlaceOfRegistration;
	}

	public void setPlaceOfRegistration(Location PlaceOfRegistration) {
		this.PlaceOfRegistration = PlaceOfRegistration;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public LegalStructureCode getLegalStructure() {
		return LegalStructure;
	}

	public void setLegalStructure(LegalStructureCode LegalStructure) {
		this.LegalStructure = LegalStructure;
	}

	public Sector getSector() {
		return Sector;
	}

	public void setSector(Sector Sector) {
		this.Sector = Sector;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return RelatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(
			BuyOrSellIndicationOfInterest RelatedIndicationOfInterest) {
		this.RelatedIndicationOfInterest = RelatedIndicationOfInterest;
	}

	public OrganisationStrategy getStrategy() {
		return Strategy;
	}

	public void setStrategy(OrganisationStrategy Strategy) {
		this.Strategy = Strategy;
	}

	public OrganisationHierarchy getOrganisationHierarchy() {
		return OrganisationHierarchy;
	}

	public void setOrganisationHierarchy(
			OrganisationHierarchy OrganisationHierarchy) {
		this.OrganisationHierarchy = OrganisationHierarchy;
	}

	public RepresentativeOfficer getRepresentativeOfficer() {
		return RepresentativeOfficer;
	}

	public void setRepresentativeOfficer(
			RepresentativeOfficer RepresentativeOfficer) {
		this.RepresentativeOfficer = RepresentativeOfficer;
	}

	public ISODate getEstablishmentDate() {
		return EstablishmentDate;
	}

	public void setEstablishmentDate(ISODate EstablishmentDate) {
		this.EstablishmentDate = EstablishmentDate;
	}
}