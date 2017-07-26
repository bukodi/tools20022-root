package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.dict.codeset.ERISAEligibilityCode;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Characteristics of an individual or entity that is ultimately entitled to the
 * benefit of income and rights in a security, as opposed to a nominal or legal
 * owner.
 */
public class BeneficialOwner extends SecuritiesPartyRole {

	private BeneficiaryCertificationTypeCode CertificationType;
	private Country NonDomicileCountry;
	private YesNoIndicator CertificationIndicator;
	private CertificationFormatTypeCode CertificationFormat;
	private ERISAEligibilityCode ERISAEligibility;
	private PercentageRate ERISARate;
	private YesNoIndicator BenefitPlanDeclarationIndicator;

	public BeneficiaryCertificationTypeCode getCertificationType() {
		return CertificationType;
	}

	public void setCertificationType(
			BeneficiaryCertificationTypeCode CertificationType) {
		this.CertificationType = CertificationType;
	}

	public Country getNonDomicileCountry() {
		return NonDomicileCountry;
	}

	public void setNonDomicileCountry(Country NonDomicileCountry) {
		this.NonDomicileCountry = NonDomicileCountry;
	}

	public YesNoIndicator getCertificationIndicator() {
		return CertificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator CertificationIndicator) {
		this.CertificationIndicator = CertificationIndicator;
	}

	public CertificationFormatTypeCode getCertificationFormat() {
		return CertificationFormat;
	}

	public void setCertificationFormat(
			CertificationFormatTypeCode CertificationFormat) {
		this.CertificationFormat = CertificationFormat;
	}

	public ERISAEligibilityCode getERISAEligibility() {
		return ERISAEligibility;
	}

	public void setERISAEligibility(ERISAEligibilityCode ERISAEligibility) {
		this.ERISAEligibility = ERISAEligibility;
	}

	public PercentageRate getERISARate() {
		return ERISARate;
	}

	public void setERISARate(PercentageRate ERISARate) {
		this.ERISARate = ERISARate;
	}

	public YesNoIndicator getBenefitPlanDeclarationIndicator() {
		return BenefitPlanDeclarationIndicator;
	}

	public void setBenefitPlanDeclarationIndicator(
			YesNoIndicator BenefitPlanDeclarationIndicator) {
		this.BenefitPlanDeclarationIndicator = BenefitPlanDeclarationIndicator;
	}
}