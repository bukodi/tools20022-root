package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.repository.dict.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.dict.choice.ForeignExchangeSwap2Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all daily
 * Foreign Exchange Swaps (FX Swaps) transactions.
 */
public class MoneyMarketForeignExchangeSwapsStatisticalReportV01 {

	private MoneyMarketReportHeader1 ReportHeader;
	private ForeignExchangeSwap2Choice ForeignExchangeSwapsReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public MoneyMarketReportHeader1 getReportHeader() {
		return ReportHeader;
	}

	public void setReportHeader(MoneyMarketReportHeader1 ReportHeader) {
		this.ReportHeader = ReportHeader;
	}

	public ForeignExchangeSwap2Choice getForeignExchangeSwapsReport() {
		return ForeignExchangeSwapsReport;
	}

	public void setForeignExchangeSwapsReport(
			ForeignExchangeSwap2Choice ForeignExchangeSwapsReport) {
		this.ForeignExchangeSwapsReport = ForeignExchangeSwapsReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}