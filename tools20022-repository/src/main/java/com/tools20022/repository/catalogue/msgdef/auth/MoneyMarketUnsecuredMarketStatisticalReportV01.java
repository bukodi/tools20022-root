package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.dict.choice.UnsecuredMarketReport3Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The MoneyMarketUnsecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all relevant
 * unsecured money market transactions.
 */
public class MoneyMarketUnsecuredMarketStatisticalReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MoneyMarketReportHeader1 ReportHeader;
	private UnsecuredMarketReport3Choice UnsecuredMarketReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public MoneyMarketReportHeader1 getReportHeader() {
		return ReportHeader;
	}

	public void setReportHeader(MoneyMarketReportHeader1 ReportHeader) {
		this.ReportHeader = ReportHeader;
	}

	public UnsecuredMarketReport3Choice getUnsecuredMarketReport() {
		return UnsecuredMarketReport;
	}

	public void setUnsecuredMarketReport(
			UnsecuredMarketReport3Choice UnsecuredMarketReport) {
		this.UnsecuredMarketReport = UnsecuredMarketReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}