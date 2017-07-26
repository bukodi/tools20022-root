package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.Incoterms;
import com.tools20022.repository.dict.entity.Transport;
import com.tools20022.repository.dict.entity.InsuranceCertificate;
import com.tools20022.repository.dict.entity.Expiry;
import com.tools20022.repository.dict.entity.Jurisdiction;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.UTCOffset;

/**
 * Specifies a place.
 */
public class Location {

	private Person NativePerson;
	private System System;
	private Party DomiciledParty;
	private Organisation OperatingOrganisation;
	private PostalAddress Address;
	private Document IssuedDocument;
	private Incoterms Incoterms;
	private Transport DepartureTransportParameters;
	private Transport DestinationTransportParameters;
	private InsuranceCertificate InsuranceCertificate;
	private Party Party;
	private Expiry RelatedExpiry;
	private Jurisdiction RelatedJurisdiction;
	private GenericIdentification Identification;
	private Party TaxableParty;
	private Organisation RegisteredOrganisation;
	private Transport RelatedTransport;
	private UTCOffset TimeZone;

	public Person getNativePerson() {
		return NativePerson;
	}

	public void setNativePerson(Person NativePerson) {
		this.NativePerson = NativePerson;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public Party getDomiciledParty() {
		return DomiciledParty;
	}

	public void setDomiciledParty(Party DomiciledParty) {
		this.DomiciledParty = DomiciledParty;
	}

	public Organisation getOperatingOrganisation() {
		return OperatingOrganisation;
	}

	public void setOperatingOrganisation(Organisation OperatingOrganisation) {
		this.OperatingOrganisation = OperatingOrganisation;
	}

	public PostalAddress getAddress() {
		return Address;
	}

	public void setAddress(PostalAddress Address) {
		this.Address = Address;
	}

	public Document getIssuedDocument() {
		return IssuedDocument;
	}

	public void setIssuedDocument(Document IssuedDocument) {
		this.IssuedDocument = IssuedDocument;
	}

	public Incoterms getIncoterms() {
		return Incoterms;
	}

	public void setIncoterms(Incoterms Incoterms) {
		this.Incoterms = Incoterms;
	}

	public Transport getDepartureTransportParameters() {
		return DepartureTransportParameters;
	}

	public void setDepartureTransportParameters(
			Transport DepartureTransportParameters) {
		this.DepartureTransportParameters = DepartureTransportParameters;
	}

	public Transport getDestinationTransportParameters() {
		return DestinationTransportParameters;
	}

	public void setDestinationTransportParameters(
			Transport DestinationTransportParameters) {
		this.DestinationTransportParameters = DestinationTransportParameters;
	}

	public InsuranceCertificate getInsuranceCertificate() {
		return InsuranceCertificate;
	}

	public void setInsuranceCertificate(
			InsuranceCertificate InsuranceCertificate) {
		this.InsuranceCertificate = InsuranceCertificate;
	}

	public Party getParty() {
		return Party;
	}

	public void setParty(Party Party) {
		this.Party = Party;
	}

	public Expiry getRelatedExpiry() {
		return RelatedExpiry;
	}

	public void setRelatedExpiry(Expiry RelatedExpiry) {
		this.RelatedExpiry = RelatedExpiry;
	}

	public Jurisdiction getRelatedJurisdiction() {
		return RelatedJurisdiction;
	}

	public void setRelatedJurisdiction(Jurisdiction RelatedJurisdiction) {
		this.RelatedJurisdiction = RelatedJurisdiction;
	}

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}

	public Party getTaxableParty() {
		return TaxableParty;
	}

	public void setTaxableParty(Party TaxableParty) {
		this.TaxableParty = TaxableParty;
	}

	public Organisation getRegisteredOrganisation() {
		return RegisteredOrganisation;
	}

	public void setRegisteredOrganisation(Organisation RegisteredOrganisation) {
		this.RegisteredOrganisation = RegisteredOrganisation;
	}

	public Transport getRelatedTransport() {
		return RelatedTransport;
	}

	public void setRelatedTransport(Transport RelatedTransport) {
		this.RelatedTransport = RelatedTransport;
	}

	public UTCOffset getTimeZone() {
		return TimeZone;
	}

	public void setTimeZone(UTCOffset TimeZone) {
		this.TimeZone = TimeZone;
	}
}