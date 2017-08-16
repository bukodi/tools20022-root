package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Agreement;
import com.tools20022.repository.dict.datatype.Max128Text;
import com.tools20022.repository.dict.datatype.Max350Text;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.InvoiceFinancingPartyRole;
import com.tools20022.repository.dict.entity.InvoiceFinancingStatus;
import com.tools20022.repository.dict.entity.Invoice;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.entity.Assignment;

/**
 * Set of characteristics that unambiguously identify an invoice financing
 * agreement. An invoice financing agreement between a factor and its client
 * allows to transfer a payment obligation that exists between the client and a
 * third party from the client to the factor.
 */
public class InvoiceFinancingAgreement extends Agreement
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max128Text Authorisation;
	private Max350Text FinancingMethod;
	private CurrencyAndAmount RequestedAmount;
	private PercentageRate RequestedPercentage;
	private PercentageRate AppliedPercentage;
	private CurrencyAndAmount FinancedAmount;
	private Max35Text Identification;
	private InvoiceFinancingPartyRole InvoiceFinancingPartyRole;
	private InvoiceFinancingStatus InvoiceFinancingStatus;
	private Invoice Invoice;
	private CashEntry ResultingCashEntry;
	private Assignment Assignment;

	public Max128Text getAuthorisation() {
		return Authorisation;
	}

	public void setAuthorisation(Max128Text Authorisation) {
		this.Authorisation = Authorisation;
	}

	public Max350Text getFinancingMethod() {
		return FinancingMethod;
	}

	public void setFinancingMethod(Max350Text FinancingMethod) {
		this.FinancingMethod = FinancingMethod;
	}

	public CurrencyAndAmount getRequestedAmount() {
		return RequestedAmount;
	}

	public void setRequestedAmount(CurrencyAndAmount RequestedAmount) {
		this.RequestedAmount = RequestedAmount;
	}

	public PercentageRate getRequestedPercentage() {
		return RequestedPercentage;
	}

	public void setRequestedPercentage(PercentageRate RequestedPercentage) {
		this.RequestedPercentage = RequestedPercentage;
	}

	public PercentageRate getAppliedPercentage() {
		return AppliedPercentage;
	}

	public void setAppliedPercentage(PercentageRate AppliedPercentage) {
		this.AppliedPercentage = AppliedPercentage;
	}

	public CurrencyAndAmount getFinancedAmount() {
		return FinancedAmount;
	}

	public void setFinancedAmount(CurrencyAndAmount FinancedAmount) {
		this.FinancedAmount = FinancedAmount;
	}

	public Max35Text getIdentification() {
		return Identification;
	}

	public void setIdentification(Max35Text Identification) {
		this.Identification = Identification;
	}

	public InvoiceFinancingPartyRole getInvoiceFinancingPartyRole() {
		return InvoiceFinancingPartyRole;
	}

	public void setInvoiceFinancingPartyRole(
			InvoiceFinancingPartyRole InvoiceFinancingPartyRole) {
		this.InvoiceFinancingPartyRole = InvoiceFinancingPartyRole;
	}

	public InvoiceFinancingStatus getInvoiceFinancingStatus() {
		return InvoiceFinancingStatus;
	}

	public void setInvoiceFinancingStatus(
			InvoiceFinancingStatus InvoiceFinancingStatus) {
		this.InvoiceFinancingStatus = InvoiceFinancingStatus;
	}

	public Invoice getInvoice() {
		return Invoice;
	}

	public void setInvoice(Invoice Invoice) {
		this.Invoice = Invoice;
	}

	public CashEntry getResultingCashEntry() {
		return ResultingCashEntry;
	}

	public void setResultingCashEntry(CashEntry ResultingCashEntry) {
		this.ResultingCashEntry = ResultingCashEntry;
	}

	public Assignment getAssignment() {
		return Assignment;
	}

	public void setAssignment(Assignment Assignment) {
		this.Assignment = Assignment;
	}
}