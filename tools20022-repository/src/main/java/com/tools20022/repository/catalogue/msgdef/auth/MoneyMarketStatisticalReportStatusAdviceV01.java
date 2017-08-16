package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MoneyMarketStatusReportHeader1;
import com.tools20022.repository.dict.msg.MoneyMarketTransactionStatus2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The MoneyMarketStatisticalReportStatusAdvice message is sent by the relevant
 * competent authority to the reporting agents to provide the status on the
 * reported transactions.
 */
public class MoneyMarketStatisticalReportStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MoneyMarketStatusReportHeader1 StatusReportHeader;
	private Optional<MoneyMarketTransactionStatus2> TransactionStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public MoneyMarketStatusReportHeader1 getStatusReportHeader() {
		return StatusReportHeader;
	}

	public void setStatusReportHeader(
			MoneyMarketStatusReportHeader1 StatusReportHeader) {
		this.StatusReportHeader = StatusReportHeader;
	}

	public Optional<MoneyMarketTransactionStatus2> getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(
			Optional<MoneyMarketTransactionStatus2> TransactionStatus) {
		this.TransactionStatus = TransactionStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}