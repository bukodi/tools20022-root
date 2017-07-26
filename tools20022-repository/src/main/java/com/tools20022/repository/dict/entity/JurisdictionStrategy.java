package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.Jurisdiction;

/**
 * Strategy is jurisdiction based.
 */
public class JurisdictionStrategy extends PortfolioStrategy {

	private Jurisdiction Jurisdiction;

	public Jurisdiction getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(Jurisdiction Jurisdiction) {
		this.Jurisdiction = Jurisdiction;
	}
}