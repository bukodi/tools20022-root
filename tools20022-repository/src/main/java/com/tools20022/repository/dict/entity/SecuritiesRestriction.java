package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.LegalRestrictionsCode;
import com.tools20022.repository.dict.entity.Jurisdiction;
import com.tools20022.repository.dict.codeset.RestrictionTypeCode;
import com.tools20022.repository.dict.codeset.InvestorRestrictionTypeCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.InvestorTypeCode;

/**
 * Restrictions applicable to the security.
 */
public class SecuritiesRestriction extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Security Security;
	private LegalRestrictionsCode LegalRestrictionType;
	private Jurisdiction Jurisdiction;
	private RestrictionTypeCode RestrictionType;
	private InvestorRestrictionTypeCode InvestorStatusRestrictionType;
	private DateTimePeriod EffectivePeriod;
	private PercentageRate Rate;
	private InvestorTypeCode InvestorType;

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public LegalRestrictionsCode getLegalRestrictionType() {
		return LegalRestrictionType;
	}

	public void setLegalRestrictionType(
			LegalRestrictionsCode LegalRestrictionType) {
		this.LegalRestrictionType = LegalRestrictionType;
	}

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}

	public RestrictionTypeCode getRestrictionType() {
		return RestrictionType;
	}

	public void setRestrictionType(RestrictionTypeCode RestrictionType) {
		this.RestrictionType = RestrictionType;
	}

	public InvestorRestrictionTypeCode getInvestorStatusRestrictionType() {
		return InvestorStatusRestrictionType;
	}

	public void setInvestorStatusRestrictionType(
			InvestorRestrictionTypeCode InvestorStatusRestrictionType) {
		this.InvestorStatusRestrictionType = InvestorStatusRestrictionType;
	}

	public DateTimePeriod getEffectivePeriod() {
		return EffectivePeriod;
	}

	public void setEffectivePeriod(DateTimePeriod EffectivePeriod) {
		this.EffectivePeriod = EffectivePeriod;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public InvestorTypeCode getInvestorType() {
		return InvestorType;
	}

	public void setInvestorType(InvestorTypeCode InvestorType) {
		this.InvestorType = InvestorType;
	}
}