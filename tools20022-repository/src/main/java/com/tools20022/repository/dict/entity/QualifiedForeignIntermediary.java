package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.codeset.CountryCode;

/**
 * Foreign financial institution that has been authorised by local authorities
 * to act as account management institution in the country.
 */
public class QualifiedForeignIntermediary extends TradePartyRole {

	private CountryCode Country;

	public CountryCode getCountry() {
		return Country;
	}

	public void setCountry(CountryCode Country) {
		this.Country = Country;
	}
}