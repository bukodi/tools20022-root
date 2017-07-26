package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.Scheme;
import com.tools20022.repository.dict.entity.Organisation;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.SectorStrategy;

/**
 * Type of business of the organisation, for example, pharmaceutical.
 */
public class Sector {

	private Security Security;
	private Scheme Scheme;
	private Organisation Organisation;
	private Max35Text Identification;
	private SectorStrategy Strategy;

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public Scheme getScheme() {
		return Scheme;
	}

	public void setScheme(Scheme Scheme) {
		this.Scheme = Scheme;
	}

	public Organisation getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(Organisation Organisation) {
		this.Organisation = Organisation;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public SectorStrategy getStrategy() {
		return Strategy;
	}

	public void setStrategy(SectorStrategy Strategy) {
		this.Strategy = Strategy;
	}
}