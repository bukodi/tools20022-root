package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.codeset.PartyTypeCode;
import com.tools20022.repository.dict.datatype.LEIIdentifier;

/**
 * Unique and unambiguous way to identify a party
 */
public class PartyIdentificationInformation {

	private GenericIdentification OtherIdentification;
	private Max35Text TaxIdentificationNumber;
	private Max35Text NationalRegistrationNumber;
	private TypeOfIdentificationCode TypeOfIdentification;
	private Max350Text Declaration;
	private PartyTypeCode PartyType;
	private LEIIdentifier LEI;

	public GenericIdentification getOtherIdentification() {
		return OtherIdentification;
	}

	public void setOtherIdentification(GenericIdentification OtherIdentification) {
		this.OtherIdentification = OtherIdentification;
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

	public LEIIdentifier getLEI() {
		return LEI;
	}

	public void setLEI(LEIIdentifier LEI) {
		this.LEI = LEI;
	}
}