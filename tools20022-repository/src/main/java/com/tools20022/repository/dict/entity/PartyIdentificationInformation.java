package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.PartyTypeCode;
import com.tools20022.repository.dict.entity.PartyName;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Market;
import com.tools20022.repository.dict.datatype.LEIIdentifier;

/**
 * Unique and unambiguous way to identify a party
 */
public class PartyIdentificationInformation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private GenericIdentification OtherIdentification;
	private Party IdentifiedParty;
	private Max35Text TaxIdentificationNumber;
	private Max35Text NationalRegistrationNumber;
	private TypeOfIdentificationCode TypeOfIdentification;
	private Max350Text Declaration;
	private PartyTypeCode PartyType;
	private PartyName PartyName;
	private DateTimePeriod ValidityPeriod;
	private Market IdentifiedMarket;
	private LEIIdentifier LEI;

	public GenericIdentification getOtherIdentification() {
		return OtherIdentification;
	}

	public void setOtherIdentification(GenericIdentification OtherIdentification) {
		this.OtherIdentification = OtherIdentification;
	}

	public Party getIdentifiedParty() {
		return IdentifiedParty;
	}

	public void setIdentifiedParty(Party IdentifiedParty) {
		this.IdentifiedParty = IdentifiedParty;
	}

	public Max35Text getTaxIdentificationNumber() {
		return TaxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text TaxIdentificationNumber) {
		this.TaxIdentificationNumber = TaxIdentificationNumber;
	}

	public Max35Text getNationalRegistrationNumber() {
		return NationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(
			Max35Text NationalRegistrationNumber) {
		this.NationalRegistrationNumber = NationalRegistrationNumber;
	}

	public TypeOfIdentificationCode getTypeOfIdentification() {
		return TypeOfIdentification;
	}

	public void setTypeOfIdentification(
			TypeOfIdentificationCode TypeOfIdentification) {
		this.TypeOfIdentification = TypeOfIdentification;
	}

	public Max350Text getDeclaration() {
		return Declaration;
	}

	public void setDeclaration(Max350Text Declaration) {
		this.Declaration = Declaration;
	}

	public PartyTypeCode getPartyType() {
		return PartyType;
	}

	public void setPartyType(PartyTypeCode PartyType) {
		this.PartyType = PartyType;
	}

	public PartyName getPartyName() {
		return PartyName;
	}

	public void setPartyName(PartyName PartyName) {
		this.PartyName = PartyName;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public Market getIdentifiedMarket() {
		return IdentifiedMarket;
	}

	public void setIdentifiedMarket(Market IdentifiedMarket) {
		this.IdentifiedMarket = IdentifiedMarket;
	}

	public LEIIdentifier getLEI() {
		return LEI;
	}

	public void setLEI(LEIIdentifier LEI) {
		this.LEI = LEI;
	}
}