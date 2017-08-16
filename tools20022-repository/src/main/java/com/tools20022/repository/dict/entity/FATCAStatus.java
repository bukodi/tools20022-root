package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.FATCAStatusCode;
import com.tools20022.repository.dict.codeset.FATCASourceStatusCode;
import com.tools20022.repository.dict.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.dict.datatype.ISODate;

/**
 * Foreign Account Tax Compliance Act (FATCA) status and the status source of
 * the investor.
 */
public class FATCAStatus extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private FATCAStatusCode FATCAStatus;
	private FATCASourceStatusCode FATCASourceStatus;
	private InvestmentAccountPartyRole InvestmentAccountParty;
	private ISODate FATCAReportingDate;

	public FATCAStatusCode getFATCAStatus() {
		return FATCAStatus;
	}

	public void setFATCAStatus(FATCAStatusCode FATCAStatus) {
		this.FATCAStatus = FATCAStatus;
	}

	public FATCASourceStatusCode getFATCASourceStatus() {
		return FATCASourceStatus;
	}

	public void setFATCASourceStatus(FATCASourceStatusCode FATCASourceStatus) {
		this.FATCASourceStatus = FATCASourceStatus;
	}

	public InvestmentAccountPartyRole getInvestmentAccountParty() {
		return InvestmentAccountParty;
	}

	public void setInvestmentAccountParty(
			InvestmentAccountPartyRole InvestmentAccountParty) {
		this.InvestmentAccountParty = InvestmentAccountParty;
	}

	public ISODate getFATCAReportingDate() {
		return FATCAReportingDate;
	}

	public void setFATCAReportingDate(ISODate FATCAReportingDate) {
		this.FATCAReportingDate = FATCAReportingDate;
	}
}