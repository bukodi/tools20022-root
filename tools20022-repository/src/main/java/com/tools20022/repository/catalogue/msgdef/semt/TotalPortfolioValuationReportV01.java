package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.msg.Report4;
import com.tools20022.repository.dict.msg.SecuritiesAccount21;
import com.tools20022.repository.dict.msg.TotalPortfolioValuation1;
import com.tools20022.repository.dict.choice.PortfolioBalance1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a TotalPortfolioValuationReport to an account
 * owner to provide detailed valuation information for a portfolio. Usage The
 * TotalPortfolioValuationReport will be sent by the account servicer to the
 * account owner on an agreed basis. The report may also be requested using a
 * SecuritiesStatementQuery. The TotalPortfolioValuationReport is used to report
 * on a portfolio without Investment Funds; or to report on a portfolio when an
 * investment fund is regarded as a portfolio containing, only one or multiple
 * investment funds The TotalPortfolioValuationReport may also be used to: -
 * re-send a message previously sent (the CopyDuplicate value is DUPL), -
 * provide a third party with a copy of a message for information (the
 * CopyDuplicate value is COPY), - re-send to a third party a copy of a message
 * for information (the CopyDuplicate value is CODU).
 */
public class TotalPortfolioValuationReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Pagination Pagination;
	private Report4 ReportGeneralDetails;
	private SecuritiesAccount21 AccountDetails;
	private TotalPortfolioValuation1 TotalPortfolioValuation;
	private Optional<PortfolioBalance1> Balance;
	private Optional<SupplementaryData1> SupplementaryData;

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Report4 getReportGeneralDetails() {
		return ReportGeneralDetails;
	}

	public void setReportGeneralDetails(Report4 ReportGeneralDetails) {
		this.ReportGeneralDetails = ReportGeneralDetails;
	}

	public SecuritiesAccount21 getAccountDetails() {
		return AccountDetails;
	}

	public void setAccountDetails(SecuritiesAccount21 AccountDetails) {
		this.AccountDetails = AccountDetails;
	}

	public TotalPortfolioValuation1 getTotalPortfolioValuation() {
		return TotalPortfolioValuation;
	}

	public void setTotalPortfolioValuation(
			TotalPortfolioValuation1 TotalPortfolioValuation) {
		this.TotalPortfolioValuation = TotalPortfolioValuation;
	}

	public Optional<PortfolioBalance1> getBalance() {
		return Balance;
	}

	public void setBalance(Optional<PortfolioBalance1> Balance) {
		this.Balance = Balance;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}