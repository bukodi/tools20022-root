package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.entity.Sector;

/**
 * Strategy is sector based.
 */
public class SectorStrategy extends PortfolioStrategy {

	private Sector Sector;

	public Sector getSector() {
		return Sector;
	}

	public void setSector(Sector Sector) {
		this.Sector = Sector;
	}
}