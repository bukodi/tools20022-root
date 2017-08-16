package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.GovernanceRules;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.JurisdictionStrategy;
import com.tools20022.repository.dict.entity.SecuritiesRestriction;
import com.tools20022.repository.dict.entity.SecuritiesTax;
import com.tools20022.repository.dict.entity.Market;
import com.tools20022.repository.dict.entity.Agreement;

/**
 * Specifies the jurisdiction (country, county, state, province, city).
 */
public class Jurisdiction extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private GovernanceRules GovernanceRules;
	private Location Identification;
	private Security RegisteredSecurities;
	private JurisdictionStrategy AssociatedStrategy;
	private SecuritiesRestriction SecuritiesRestriction;
	private SecuritiesTax RelatedSecuritiesTax;
	private Market RelatedMarket;
	private Agreement RelatedAgreement;

	public GovernanceRules getGovernanceRules() {
		return GovernanceRules;
	}

	public void setGovernanceRules(GovernanceRules GovernanceRules) {
		this.GovernanceRules = GovernanceRules;
	}

	public Location getIdentification() {
		return Identification;
	}

	public void setIdentification(Location Identification) {
		this.Identification = Identification;
	}

	public Security getRegisteredSecurities() {
		return RegisteredSecurities;
	}

	public void setRegisteredSecurities(Security RegisteredSecurities) {
		this.RegisteredSecurities = RegisteredSecurities;
	}

	public JurisdictionStrategy getAssociatedStrategy() {
		return AssociatedStrategy;
	}

	public void setAssociatedStrategy(JurisdictionStrategy AssociatedStrategy) {
		this.AssociatedStrategy = AssociatedStrategy;
	}

	public SecuritiesRestriction getSecuritiesRestriction() {
		return SecuritiesRestriction;
	}

	public void setSecuritiesRestriction(
			SecuritiesRestriction SecuritiesRestriction) {
		this.SecuritiesRestriction = SecuritiesRestriction;
	}

	public SecuritiesTax getRelatedSecuritiesTax() {
		return RelatedSecuritiesTax;
	}

	public void setRelatedSecuritiesTax(SecuritiesTax RelatedSecuritiesTax) {
		this.RelatedSecuritiesTax = RelatedSecuritiesTax;
	}

	public Market getRelatedMarket() {
		return RelatedMarket;
	}

	public void setRelatedMarket(Market RelatedMarket) {
		this.RelatedMarket = RelatedMarket;
	}

	public Agreement getRelatedAgreement() {
		return RelatedAgreement;
	}

	public void setRelatedAgreement(Agreement RelatedAgreement) {
		this.RelatedAgreement = RelatedAgreement;
	}
}