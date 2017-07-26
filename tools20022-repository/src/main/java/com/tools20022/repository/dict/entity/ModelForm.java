package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.GovernanceRules;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.codeset.ExternalModelFormIdentificationCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.ISO2ALanguageCode;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Identification of a model form.
 */
public class ModelForm {

	private GovernanceRules GovernanceRules;
	private Undertaking Undertaking;
	private ExternalModelFormIdentificationCode Identification;
	private Max35Text Version;
	private ISO2ALanguageCode RequestedWordingLanguage;
	private ISODate EffectiveDate;

	public GovernanceRules getGovernanceRules() {
		return GovernanceRules;
	}

	public void setGovernanceRules(GovernanceRules GovernanceRules) {
		this.GovernanceRules = GovernanceRules;
	}

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public ExternalModelFormIdentificationCode getIdentification() {
		return Identification;
	}

	public void setIdentification(
			ExternalModelFormIdentificationCode Identification) {
		this.Identification = Identification;
	}

	public Max35Text getVersion() {
		return Version;
	}

	public void setVersion(Max35Text Version) {
		this.Version = Version;
	}

	public ISO2ALanguageCode getRequestedWordingLanguage() {
		return RequestedWordingLanguage;
	}

	public void setRequestedWordingLanguage(
			ISO2ALanguageCode RequestedWordingLanguage) {
		this.RequestedWordingLanguage = RequestedWordingLanguage;
	}

	public ISODate getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(ISODate EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}
}