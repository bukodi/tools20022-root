package com.tools20022.repository.catalogue.msgdef.auth;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.TaxReportHeader1;
import com.tools20022.repository.dict.msg.TaxReport1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * The InvoiceTaxReport message is sent by tax responsible to tax authority. Tax
 * authorities require corporates to report their sales based value added tax
 * (VAT). This message is targeted to this reporting based on information in
 * sales invoices and card transactions.
 */
public class InvoiceTaxReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TaxReportHeader1 InvoiceTaxReportHeader;
	private TaxReport1 TaxReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public TaxReportHeader1 getInvoiceTaxReportHeader() {
		return InvoiceTaxReportHeader;
	}

	public void setInvoiceTaxReportHeader(
			TaxReportHeader1 InvoiceTaxReportHeader) {
		this.InvoiceTaxReportHeader = InvoiceTaxReportHeader;
	}

	public TaxReport1 getTaxReport() {
		return TaxReport;
	}

	public void setTaxReport(TaxReport1 TaxReport) {
		this.TaxReport = TaxReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}