package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CRSStatusCode;
import com.tools20022.repository.dict.codeset.CountryCode;
import com.tools20022.repository.dict.codeset.CRSSourceStatusCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.InvestmentAccountPartyRole;

/**
 * Common Reporting Standard (CRS) status and the status source of the investor.
 */
public class CRSStatus extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CRSStatusCode CRSStatus;
	private CountryCode ExceptionalReportingCountry;
	private CRSSourceStatusCode CRSSourceStatus;
	private ISODate CRSReportingDate;
	private InvestmentAccountPartyRole InvestmentAccountParty;

	public CRSStatusCode getCRSStatus() {
		return CRSStatus;
	}

	public void setCRSStatus(CRSStatusCode CRSStatus) {
		this.CRSStatus = CRSStatus;
	}

	public CountryCode getExceptionalReportingCountry() {
		return ExceptionalReportingCountry;
	}

	public void setExceptionalReportingCountry(
			CountryCode ExceptionalReportingCountry) {
		this.ExceptionalReportingCountry = ExceptionalReportingCountry;
	}

	public CRSSourceStatusCode getCRSSourceStatus() {
		return CRSSourceStatus;
	}

	public void setCRSSourceStatus(CRSSourceStatusCode CRSSourceStatus) {
		this.CRSSourceStatus = CRSSourceStatus;
	}

	public ISODate getCRSReportingDate() {
		return CRSReportingDate;
	}

	public void setCRSReportingDate(ISODate CRSReportingDate) {
		this.CRSReportingDate = CRSReportingDate;
	}

	public InvestmentAccountPartyRole getInvestmentAccountParty() {
		return InvestmentAccountParty;
	}

	public void setInvestmentAccountParty(
			InvestmentAccountPartyRole InvestmentAccountParty) {
		this.InvestmentAccountParty = InvestmentAccountParty;
	}
}