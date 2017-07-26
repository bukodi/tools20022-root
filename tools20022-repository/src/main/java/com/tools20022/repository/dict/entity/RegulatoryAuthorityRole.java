package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.RegulatoryReport;
import com.tools20022.repository.dict.entity.Country;

/**
 * Entity requiring the regulatory reporting information.
 */
public class RegulatoryAuthorityRole extends Role {

	private RegulatoryReport RegulatoryReport;
	private Country Country;

	public RegulatoryReport getRegulatoryReport() {
		return RegulatoryReport;
	}

	public void setRegulatoryReport(RegulatoryReport RegulatoryReport) {
		this.RegulatoryReport = RegulatoryReport;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}
}