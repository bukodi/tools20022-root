package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.FinancingStatusReasonCode;
import com.tools20022.repository.dict.codeset.TechnicalValidationStatusCode;
import com.tools20022.repository.dict.codeset.RequestStatusCode;
import com.tools20022.repository.dict.datatype.Max105Text;
import com.tools20022.repository.dict.entity.InvoiceFinancingAgreement;

/**
 * Status of an invoice financing transaction and of the instructions related to
 * the invoice financing.
 */
public class InvoiceFinancingStatus extends Status {

	private FinancingStatusReasonCode ValidationStatusReason;
	private TechnicalValidationStatusCode ValidationStatus;
	private TechnicalValidationStatusCode CancellationStatus;
	private FinancingStatusReasonCode CancellationStatusReason;
	private RequestStatusCode FinancingTransactionStatus;
	private Max105Text CancellationRequestReason;
	private InvoiceFinancingAgreement InvoiceFinancingTransaction;
	private FinancingStatusReasonCode FinancingStatusReason;

	public FinancingStatusReasonCode getValidationStatusReason() {
		return ValidationStatusReason;
	}

	public void setValidationStatusReason(
			FinancingStatusReasonCode ValidationStatusReason) {
		this.ValidationStatusReason = ValidationStatusReason;
	}

	public TechnicalValidationStatusCode getValidationStatus() {
		return ValidationStatus;
	}

	public void setValidationStatus(
			TechnicalValidationStatusCode ValidationStatus) {
		this.ValidationStatus = ValidationStatus;
	}

	public TechnicalValidationStatusCode getCancellationStatus() {
		return CancellationStatus;
	}

	public void setCancellationStatus(
			TechnicalValidationStatusCode CancellationStatus) {
		this.CancellationStatus = CancellationStatus;
	}

	public FinancingStatusReasonCode getCancellationStatusReason() {
		return CancellationStatusReason;
	}

	public void setCancellationStatusReason(
			FinancingStatusReasonCode CancellationStatusReason) {
		this.CancellationStatusReason = CancellationStatusReason;
	}

	public RequestStatusCode getFinancingTransactionStatus() {
		return FinancingTransactionStatus;
	}

	public void setFinancingTransactionStatus(
			RequestStatusCode FinancingTransactionStatus) {
		this.FinancingTransactionStatus = FinancingTransactionStatus;
	}

	public Max105Text getCancellationRequestReason() {
		return CancellationRequestReason;
	}

	public void setCancellationRequestReason(
			Max105Text CancellationRequestReason) {
		this.CancellationRequestReason = CancellationRequestReason;
	}

	public InvoiceFinancingAgreement getInvoiceFinancingTransaction() {
		return InvoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(
			InvoiceFinancingAgreement InvoiceFinancingTransaction) {
		this.InvoiceFinancingTransaction = InvoiceFinancingTransaction;
	}

	public FinancingStatusReasonCode getFinancingStatusReason() {
		return FinancingStatusReason;
	}

	public void setFinancingStatusReason(
			FinancingStatusReasonCode FinancingStatusReason) {
		this.FinancingStatusReason = FinancingStatusReason;
	}
}