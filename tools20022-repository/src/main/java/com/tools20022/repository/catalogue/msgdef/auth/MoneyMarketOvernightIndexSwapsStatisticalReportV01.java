package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.dict.choice.OvernightIndexSwap3Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The MoneyMarketOvernightIndexSwapsStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report the daily
 * overnight index swaps (OIS) transactions.
 */
public class MoneyMarketOvernightIndexSwapsStatisticalReportV01 {

	private MoneyMarketReportHeader1 ReportHeader;
	private OvernightIndexSwap3Choice OvernightIndexSwapsReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public MoneyMarketReportHeader1 getReportHeader() {
		return ReportHeader;
	}

	public void setReportHeader(MoneyMarketReportHeader1 ReportHeader) {
		this.ReportHeader = ReportHeader;
	}

	public OvernightIndexSwap3Choice getOvernightIndexSwapsReport() {
		return OvernightIndexSwapsReport;
	}

	public void setOvernightIndexSwapsReport(
			OvernightIndexSwap3Choice OvernightIndexSwapsReport) {
		this.OvernightIndexSwapsReport = OvernightIndexSwapsReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}