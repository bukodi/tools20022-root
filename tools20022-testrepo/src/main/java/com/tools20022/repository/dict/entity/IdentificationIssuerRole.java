package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Entity that assigns the identification.
 */
public class IdentificationIssuerRole {

	private CountryCode Country;
	private Max35Text EntityName;
	private Max35Text OwnerCode;

	public CountryCode getCountry() {
		return Country;
	}

	public void setCountry(CountryCode Country) {
		this.Country = Country;
	}

	public Max35Text getEntityName() {
		return EntityName;
	}

	public void setEntityName(Max35Text EntityName) {
		this.EntityName = EntityName;
	}

	public Max35Text getOwnerCode() {
		return OwnerCode;
	}

	public void setOwnerCode(Max35Text OwnerCode) {
		this.OwnerCode = OwnerCode;
	}
}