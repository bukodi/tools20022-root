package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.Sector;

/**
 * Strategy is sector based.
 */
public class SectorStrategy extends PortfolioStrategy
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Sector Sector;

	public Sector getSector() {
		return Sector;
	}

	public void setSector(Sector Sector) {
		this.Sector = Sector;
	}
}