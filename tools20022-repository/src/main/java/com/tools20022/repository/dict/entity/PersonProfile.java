package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ProvidedCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.KnowYourCustomerCheckTypeCode;
import com.tools20022.repository.dict.codeset.RiskLevelCode;
import com.tools20022.repository.dict.entity.Person;
import com.tools20022.repository.dict.codeset.PoliticalExposureTypeCode;
import com.tools20022.repository.dict.codeset.ConductClassificationCode;
import com.tools20022.repository.dict.entity.PrivateCertificate;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Information to support Know Your Customer (KYC) processes.
 */
public class PersonProfile {

	private ProvidedCode ForeignStatusCertification;
	private YesNoIndicator EmployeeTerminationIndicator;
	private KnowYourCustomerCheckTypeCode KnowYourCustomerCheckType;
	private RiskLevelCode RiskLevel;
	private Person Person;
	private PoliticalExposureTypeCode PoliticalExposureType;
	private ConductClassificationCode CustomerConductClassification;
	private YesNoIndicator FamilyMedicalInsuranceIndicator;
	private PrivateCertificate ProfileCertification;
	private Max140Text SourceOfWealth;
	private Max35Text SalaryRange;

	public ProvidedCode getForeignStatusCertification() {
		return ForeignStatusCertification;
	}

	public void setForeignStatusCertification(
			ProvidedCode ForeignStatusCertification) {
		this.ForeignStatusCertification = ForeignStatusCertification;
	}

	public YesNoIndicator getEmployeeTerminationIndicator() {
		return EmployeeTerminationIndicator;
	}

	public void setEmployeeTerminationIndicator(
			YesNoIndicator EmployeeTerminationIndicator) {
		this.EmployeeTerminationIndicator = EmployeeTerminationIndicator;
	}

	public KnowYourCustomerCheckTypeCode getKnowYourCustomerCheckType() {
		return KnowYourCustomerCheckType;
	}

	public void setKnowYourCustomerCheckType(
			KnowYourCustomerCheckTypeCode KnowYourCustomerCheckType) {
		this.KnowYourCustomerCheckType = KnowYourCustomerCheckType;
	}

	public RiskLevelCode getRiskLevel() {
		return RiskLevel;
	}

	public void setRiskLevel(RiskLevelCode RiskLevel) {
		this.RiskLevel = RiskLevel;
	}

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person Person) {
		this.Person = Person;
	}

	public PoliticalExposureTypeCode getPoliticalExposureType() {
		return PoliticalExposureType;
	}

	public void setPoliticalExposureType(
			PoliticalExposureTypeCode PoliticalExposureType) {
		this.PoliticalExposureType = PoliticalExposureType;
	}

	public ConductClassificationCode getCustomerConductClassification() {
		return CustomerConductClassification;
	}

	public void setCustomerConductClassification(
			ConductClassificationCode CustomerConductClassification) {
		this.CustomerConductClassification = CustomerConductClassification;
	}

	public YesNoIndicator getFamilyMedicalInsuranceIndicator() {
		return FamilyMedicalInsuranceIndicator;
	}

	public void setFamilyMedicalInsuranceIndicator(
			YesNoIndicator FamilyMedicalInsuranceIndicator) {
		this.FamilyMedicalInsuranceIndicator = FamilyMedicalInsuranceIndicator;
	}

	public PrivateCertificate getProfileCertification() {
		return ProfileCertification;
	}

	public void setProfileCertification(PrivateCertificate ProfileCertification) {
		this.ProfileCertification = ProfileCertification;
	}

	public Max140Text getSourceOfWealth() {
		return SourceOfWealth;
	}

	public void setSourceOfWealth(Max140Text SourceOfWealth) {
		this.SourceOfWealth = SourceOfWealth;
	}

	public Max35Text getSalaryRange() {
		return SalaryRange;
	}

	public void setSalaryRange(Max35Text SalaryRange) {
		this.SalaryRange = SalaryRange;
	}
}