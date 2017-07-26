package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.SecuritiesBalance;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;

/**
 * Organisation used as the safekeeping place for the securities.
 */
public class SafekeepingPlace extends SecuritiesPartyRole {

	private SafekeepingPlaceCode SafekeepingPlaceType;
	private Country Country;
	private SecuritiesAccount RelatedSecuritiesAccount;
	private SecuritiesBalance SecuritiesBalance;
	private SecuritiesSettlement SecuritiesSettlement;

	public SafekeepingPlaceCode getSafekeepingPlaceType() {
		return SafekeepingPlaceType;
	}

	public void setSafekeepingPlaceType(
			SafekeepingPlaceCode SafekeepingPlaceType) {
		this.SafekeepingPlaceType = SafekeepingPlaceType;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}

	public SecuritiesAccount getRelatedSecuritiesAccount() {
		return RelatedSecuritiesAccount;
	}

	public void setRelatedSecuritiesAccount(
			SecuritiesAccount RelatedSecuritiesAccount) {
		this.RelatedSecuritiesAccount = RelatedSecuritiesAccount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}
}