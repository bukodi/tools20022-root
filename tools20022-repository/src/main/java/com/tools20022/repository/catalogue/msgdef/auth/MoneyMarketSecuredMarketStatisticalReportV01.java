package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.dict.choice.SecuredMarketReport3Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all relevant
 * secured money market transactions.
 */
public class MoneyMarketSecuredMarketStatisticalReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MoneyMarketReportHeader1 ReportHeader;
	private SecuredMarketReport3Choice SecuredMarketReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public MoneyMarketReportHeader1 getReportHeader() {
		return ReportHeader;
	}

	public void setReportHeader(MoneyMarketReportHeader1 ReportHeader) {
		this.ReportHeader = ReportHeader;
	}

	public SecuredMarketReport3Choice getSecuredMarketReport() {
		return SecuredMarketReport;
	}

	public void setSecuredMarketReport(
			SecuredMarketReport3Choice SecuredMarketReport) {
		this.SecuredMarketReport = SecuredMarketReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}