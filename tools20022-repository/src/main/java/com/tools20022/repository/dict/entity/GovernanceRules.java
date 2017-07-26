package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ModelForm;
import com.tools20022.repository.dict.codeset.GovernanceIdentificationCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.Jurisdiction;

/**
 * Rules governing an undertaking such as a guarantee or standby letter of
 * credit.
 */
public class GovernanceRules {

	private ModelForm ModelForm;
	private GovernanceIdentificationCode Identification;
	private Max35Text ApplicableLaw;
	private Jurisdiction Jurisdiction;
	private Max35Text PublicationAgency;

	public ModelForm getModelForm() {
		return ModelForm;
	}

	public void setModelForm(ModelForm ModelForm) {
		this.ModelForm = ModelForm;
	}

	public GovernanceIdentificationCode getIdentification() {
		return Identification;
	}

	public void setIdentification(GovernanceIdentificationCode Identification) {
		this.Identification = Identification;
	}

	public Max35Text getApplicableLaw() {
		return ApplicableLaw;
	}

	public void setApplicableLaw(Max35Text ApplicableLaw) {
		this.ApplicableLaw = ApplicableLaw;
	}

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}

	public Max35Text getPublicationAgency() {
		return PublicationAgency;
	}

	public void setPublicationAgency(Max35Text PublicationAgency) {
		this.PublicationAgency = PublicationAgency;
	}
}