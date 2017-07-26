package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.Jurisdiction;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.codeset.GeographicalEnvironmentCode;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;

/**
 * Context or geographic environment in which trading parties execute trades.
 */
public class Market {

	private Trade Trade;
	private Jurisdiction Jurisdiction;
	private Country Country;
	private GeographicalEnvironmentCode GeographicalEnvironment;
	private PartyIdentificationInformation Identification;

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}

	public GeographicalEnvironmentCode getGeographicalEnvironment() {
		return GeographicalEnvironment;
	}

	public void setGeographicalEnvironment(
			GeographicalEnvironmentCode GeographicalEnvironment) {
		this.GeographicalEnvironment = GeographicalEnvironment;
	}

	public PartyIdentificationInformation getIdentification() {
		return Identification;
	}

	public void setIdentification(PartyIdentificationInformation Identification) {
		this.Identification = Identification;
	}
}