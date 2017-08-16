package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Derivative;
import com.tools20022.repository.dict.entity.IssuerRole;
import com.tools20022.repository.dict.entity.Obligation;

/**
 * Derivative contract through which two parties exchange financial instruments.
 */
public class Swaps extends Derivative
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private IssuerRole SovereignIssuer;
	private Obligation Obligation;

	public IssuerRole getSovereignIssuer() {
		return SovereignIssuer;
	}

	public void setSovereignIssuer(IssuerRole SovereignIssuer) {
		this.SovereignIssuer = SovereignIssuer;
	}

	public Obligation getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation Obligation) {
		this.Obligation = Obligation;
	}
}