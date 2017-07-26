package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Document;
import com.tools20022.repository.dict.codeset.CertificateTypeCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.codeset.EventFrequencyCode;
import com.tools20022.repository.dict.entity.PersonProfile;

/**
 * Specifies the parameters associated with the production of a certificate to
 * identify the profile of a customer.
 */
public class PrivateCertificate extends Document {

	private CertificateTypeCode CertificateType;
	private YesNoIndicator CertificationIndicator;
	private ISODate CheckingDate;
	private EventFrequencyCode CheckingFrequency;
	private ISODate NextRevisionDate;
	private PersonProfile Person;

	public CertificateTypeCode getCertificateType() {
		return CertificateType;
	}

	public void setCertificateType(CertificateTypeCode CertificateType) {
		this.CertificateType = CertificateType;
	}

	public YesNoIndicator getCertificationIndicator() {
		return CertificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator CertificationIndicator) {
		this.CertificationIndicator = CertificationIndicator;
	}

	public ISODate getCheckingDate() {
		return CheckingDate;
	}

	public void setCheckingDate(ISODate CheckingDate) {
		this.CheckingDate = CheckingDate;
	}

	public EventFrequencyCode getCheckingFrequency() {
		return CheckingFrequency;
	}

	public void setCheckingFrequency(EventFrequencyCode CheckingFrequency) {
		this.CheckingFrequency = CheckingFrequency;
	}

	public ISODate getNextRevisionDate() {
		return NextRevisionDate;
	}

	public void setNextRevisionDate(ISODate NextRevisionDate) {
		this.NextRevisionDate = NextRevisionDate;
	}

	public PersonProfile getPerson() {
		return Person;
	}

	public void setPerson(PersonProfile Person) {
		this.Person = Person;
	}
}