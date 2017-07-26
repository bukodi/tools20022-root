package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.RegistrationCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.SecuritiesCertificate;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Information related to registration of securities.
 */
public class BasicSecuritiesRegistration {

	private Security Security;
	private RegistrationCode RegistrationInstruction;
	private Max35Text CertificationIdentification;
	private ISODateTime CertificationDate;
	private SecuritiesCertificate SecuritiesCertificate;
	private DateTimePeriod SplitPeriod;

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public RegistrationCode getRegistrationInstruction() {
		return RegistrationInstruction;
	}

	public void setRegistrationInstruction(
			RegistrationCode RegistrationInstruction) {
		this.RegistrationInstruction = RegistrationInstruction;
	}

	public Max35Text getCertificationIdentification() {
		return CertificationIdentification;
	}

	public void setCertificationIdentification(
			Max35Text CertificationIdentification) {
		this.CertificationIdentification = CertificationIdentification;
	}

	public ISODateTime getCertificationDate() {
		return CertificationDate;
	}

	public void setCertificationDate(ISODateTime CertificationDate) {
		this.CertificationDate = CertificationDate;
	}

	public SecuritiesCertificate getSecuritiesCertificate() {
		return SecuritiesCertificate;
	}

	public void setSecuritiesCertificate(
			SecuritiesCertificate SecuritiesCertificate) {
		this.SecuritiesCertificate = SecuritiesCertificate;
	}

	public DateTimePeriod getSplitPeriod() {
		return SplitPeriod;
	}

	public void setSplitPeriod(DateTimePeriod SplitPeriod) {
		this.SplitPeriod = SplitPeriod;
	}
}