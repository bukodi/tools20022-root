package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.InvoiceTaxStatusReportHeader1;
import com.tools20022.repository.dict.msg.InvoiceTaxReportTransactionStatus1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The InvoiceTaxReportStatusAdvice message is sent by the matching application
 * to the party from which it received a message. This message is used to
 * acknowledge the InvoiceTaxReport message.
 */
public class InvoiceTaxReportStatusAdviceV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private InvoiceTaxStatusReportHeader1 StatusReportHeader;
	private Optional<InvoiceTaxReportTransactionStatus1> TransactionStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public InvoiceTaxStatusReportHeader1 getStatusReportHeader() {
		return StatusReportHeader;
	}

	public void setStatusReportHeader(
			InvoiceTaxStatusReportHeader1 StatusReportHeader) {
		this.StatusReportHeader = StatusReportHeader;
	}

	public Optional<InvoiceTaxReportTransactionStatus1> getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(
			Optional<InvoiceTaxReportTransactionStatus1> TransactionStatus) {
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