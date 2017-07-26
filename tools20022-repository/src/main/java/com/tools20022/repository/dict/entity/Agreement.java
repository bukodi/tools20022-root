package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.entity.CommercialTrade;
import com.tools20022.repository.dict.entity.Jurisdiction;

/**
 * Contractual details related to an agreement between parties.
 */
public class Agreement {

	private ISODate DateSigned;
	private Max350Text Description;
	private Max35Text Version;
	private DateTimePeriod ValidityPeriod;
	private Document Document;
	private CommercialTrade Trade;
	private Jurisdiction Jurisdiction;

	public ISODate getDateSigned() {
		return DateSigned;
	}

	public void setDateSigned(ISODate DateSigned) {
		this.DateSigned = DateSigned;
	}

	public Max350Text getDescription() {
		return Description;
	}

	public void setDescription(Max350Text Description) {
		this.Description = Description;
	}

	public Max35Text getVersion() {
		return Version;
	}

	public void setVersion(Max35Text Version) {
		this.Version = Version;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public Document getDocument() {
		return Document;
	}

	public void setDocument(Document Document) {
		this.Document = Document;
	}

	public CommercialTrade getTrade() {
		return Trade;
	}

	public void setTrade(CommercialTrade Trade) {
		this.Trade = Trade;
	}

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}
}