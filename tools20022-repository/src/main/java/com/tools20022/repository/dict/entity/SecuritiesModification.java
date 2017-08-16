package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Modification of the reference data of a security or of the organisation that
 * issued it.
 */
public class SecuritiesModification extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CorporateActionChangeTypeCode ChangeType;
	private Organisation NewOrganisationInformation;
	private CorporateActionEvent RelatedCorporateEvent;
	private Security NewSecurityReferenceData;
	private Number NumberOfSharesIssued;
	private ISODateTime LastTradingDate;

	public CorporateActionChangeTypeCode getChangeType() {
		return ChangeType;
	}

	public void setChangeType(CorporateActionChangeTypeCode ChangeType) {
		this.ChangeType = ChangeType;
	}

	public Organisation getNewOrganisationInformation() {
		return NewOrganisationInformation;
	}

	public void setNewOrganisationInformation(
			Organisation NewOrganisationInformation) {
		this.NewOrganisationInformation = NewOrganisationInformation;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return RelatedCorporateEvent;
	}

	public void setRelatedCorporateEvent(
			CorporateActionEvent RelatedCorporateEvent) {
		this.RelatedCorporateEvent = RelatedCorporateEvent;
	}

	public Security getNewSecurityReferenceData() {
		return NewSecurityReferenceData;
	}

	public void setNewSecurityReferenceData(Security NewSecurityReferenceData) {
		this.NewSecurityReferenceData = NewSecurityReferenceData;
	}

	public Number getNumberOfSharesIssued() {
		return NumberOfSharesIssued;
	}

	public void setNumberOfSharesIssued(Number NumberOfSharesIssued) {
		this.NumberOfSharesIssued = NumberOfSharesIssued;
	}

	public ISODateTime getLastTradingDate() {
		return LastTradingDate;
	}

	public void setLastTradingDate(ISODateTime LastTradingDate) {
		this.LastTradingDate = LastTradingDate;
	}
}