package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.FinancialDocument;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.CommercialTradeSettlement;
import com.tools20022.repository.dict.entity.LineItem;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.codeset.ExternalBillingCompensationTypeCode;
import com.tools20022.repository.dict.entity.InvoicePartyRole;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.dict.entity.InvoiceStatus;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.codeset.DebitCreditCode;

/**
 * General information about an invoice, such as number, issue date date and
 * monetary amounts.
 */
public class Invoice extends FinancialDocument {

	private CurrencyAndAmount CreditDebitNoteAmount;
	private CurrencyAndAmount TotalTaxAmount;
	private CurrencyAndAmount TotalInvoiceAmount;
	private CurrencyCode InvoiceCurrency;
	private DateTimePeriod PeriodCovered;
	private CommercialTradeSettlement TradeSettlement;
	private CurrencyAndAmount TotalCharge;
	private CurrencyAndAmount TotalPrepaidAmount;
	private LineItem LineItem;
	private CurrencyAndAmount TotalNetAmount;
	private CurrencyExchange CurrencyExchange;
	private ExternalBillingCompensationTypeCode BillingCompensationType;
	private InvoicePartyRole InvoicePartyRole;
	private Invoice OriginalInvoice;
	private Invoice RelatedInvoice;
	private InvoiceFinancingAgreement InvoiceFinancingTransaction;
	private CurrencyAndAmount BillingCompensationAmount;
	private InvoiceStatus InvoiceStatus;
	private Payment Payment;
	private DebitCreditCode CreditDebitIndicator;

	public CurrencyAndAmount getCreditDebitNoteAmount() {
		return CreditDebitNoteAmount;
	}

	public void setCreditDebitNoteAmount(CurrencyAndAmount CreditDebitNoteAmount) {
		this.CreditDebitNoteAmount = CreditDebitNoteAmount;
	}

	public CurrencyAndAmount getTotalTaxAmount() {
		return TotalTaxAmount;
	}

	public void setTotalTaxAmount(CurrencyAndAmount TotalTaxAmount) {
		this.TotalTaxAmount = TotalTaxAmount;
	}

	public CurrencyAndAmount getTotalInvoiceAmount() {
		return TotalInvoiceAmount;
	}

	public void setTotalInvoiceAmount(CurrencyAndAmount TotalInvoiceAmount) {
		this.TotalInvoiceAmount = TotalInvoiceAmount;
	}

	public CurrencyCode getInvoiceCurrency() {
		return InvoiceCurrency;
	}

	public void setInvoiceCurrency(CurrencyCode InvoiceCurrency) {
		this.InvoiceCurrency = InvoiceCurrency;
	}

	public DateTimePeriod getPeriodCovered() {
		return PeriodCovered;
	}

	public void setPeriodCovered(DateTimePeriod PeriodCovered) {
		this.PeriodCovered = PeriodCovered;
	}

	public CommercialTradeSettlement getTradeSettlement() {
		return TradeSettlement;
	}

	public void setTradeSettlement(CommercialTradeSettlement TradeSettlement) {
		this.TradeSettlement = TradeSettlement;
	}

	public CurrencyAndAmount getTotalCharge() {
		return TotalCharge;
	}

	public void setTotalCharge(CurrencyAndAmount TotalCharge) {
		this.TotalCharge = TotalCharge;
	}

	public CurrencyAndAmount getTotalPrepaidAmount() {
		return TotalPrepaidAmount;
	}

	public void setTotalPrepaidAmount(CurrencyAndAmount TotalPrepaidAmount) {
		this.TotalPrepaidAmount = TotalPrepaidAmount;
	}

	public LineItem getLineItem() {
		return LineItem;
	}

	public void setLineItem(LineItem LineItem) {
		this.LineItem = LineItem;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return TotalNetAmount;
	}

	public void setTotalNetAmount(CurrencyAndAmount TotalNetAmount) {
		this.TotalNetAmount = TotalNetAmount;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public ExternalBillingCompensationTypeCode getBillingCompensationType() {
		return BillingCompensationType;
	}

	public void setBillingCompensationType(
			ExternalBillingCompensationTypeCode BillingCompensationType) {
		this.BillingCompensationType = BillingCompensationType;
	}

	public InvoicePartyRole getInvoicePartyRole() {
		return InvoicePartyRole;
	}

	public void setInvoicePartyRole(InvoicePartyRole InvoicePartyRole) {
		this.InvoicePartyRole = InvoicePartyRole;
	}

	public Invoice getOriginalInvoice() {
		return OriginalInvoice;
	}

	public void setOriginalInvoice(Invoice OriginalInvoice) {
		this.OriginalInvoice = OriginalInvoice;
	}

	public Invoice getRelatedInvoice() {
		return RelatedInvoice;
	}

	public void setRelatedInvoice(Invoice RelatedInvoice) {
		this.RelatedInvoice = RelatedInvoice;
	}

	public InvoiceFinancingAgreement getInvoiceFinancingTransaction() {
		return InvoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(
			InvoiceFinancingAgreement InvoiceFinancingTransaction) {
		this.InvoiceFinancingTransaction = InvoiceFinancingTransaction;
	}

	public CurrencyAndAmount getBillingCompensationAmount() {
		return BillingCompensationAmount;
	}

	public void setBillingCompensationAmount(
			CurrencyAndAmount BillingCompensationAmount) {
		this.BillingCompensationAmount = BillingCompensationAmount;
	}

	public InvoiceStatus getInvoiceStatus() {
		return InvoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatus InvoiceStatus) {
		this.InvoiceStatus = InvoiceStatus;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}
}