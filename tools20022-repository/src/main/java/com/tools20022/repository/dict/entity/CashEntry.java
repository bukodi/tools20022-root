package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Entry;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.BookEntry;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.CashAvailability;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.dict.entity.PaymentInvestigationCase;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.dict.datatype.ChargeIncludedIndicator;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 */
public class CashEntry extends Entry {

	private CashAccount CashAccount;
	private CurrencyAndAmount Amount;
	private BookEntry RelatedBookEntry;
	private CashBalance CashBalance;
	private CurrencyExchange CurrencyExchange;
	private Charges Charges;
	private CashAvailability Availability;
	private Interest Interest;
	private BookEntry DebitRelatedBookEntry;
	private BookEntry CreditRelatedBookEntry;
	private InvoiceFinancingAgreement RelatedInvoiceFinancingTransaction;
	private PaymentInvestigationCase RelatedInvestigationCase;
	private PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution;
	private ChargeIncludedIndicator ChargesIncluded;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public BookEntry getRelatedBookEntry() {
		return RelatedBookEntry;
	}

	public void setRelatedBookEntry(BookEntry RelatedBookEntry) {
		this.RelatedBookEntry = RelatedBookEntry;
	}

	public CashBalance getCashBalance() {
		return CashBalance;
	}

	public void setCashBalance(CashBalance CashBalance) {
		this.CashBalance = CashBalance;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public Charges getCharges() {
		return Charges;
	}

	public void setCharges(Charges Charges) {
		this.Charges = Charges;
	}

	public CashAvailability getAvailability() {
		return Availability;
	}

	public void setAvailability(CashAvailability Availability) {
		this.Availability = Availability;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public BookEntry getDebitRelatedBookEntry() {
		return DebitRelatedBookEntry;
	}

	public void setDebitRelatedBookEntry(BookEntry DebitRelatedBookEntry) {
		this.DebitRelatedBookEntry = DebitRelatedBookEntry;
	}

	public BookEntry getCreditRelatedBookEntry() {
		return CreditRelatedBookEntry;
	}

	public void setCreditRelatedBookEntry(BookEntry CreditRelatedBookEntry) {
		this.CreditRelatedBookEntry = CreditRelatedBookEntry;
	}

	public InvoiceFinancingAgreement getRelatedInvoiceFinancingTransaction() {
		return RelatedInvoiceFinancingTransaction;
	}

	public void setRelatedInvoiceFinancingTransaction(
			InvoiceFinancingAgreement RelatedInvoiceFinancingTransaction) {
		this.RelatedInvoiceFinancingTransaction = RelatedInvoiceFinancingTransaction;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return RelatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(
			PaymentInvestigationCase RelatedInvestigationCase) {
		this.RelatedInvestigationCase = RelatedInvestigationCase;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return RelatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(
			PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution) {
		this.RelatedInvestigationCaseResolution = RelatedInvestigationCaseResolution;
	}

	public ChargeIncludedIndicator getChargesIncluded() {
		return ChargesIncluded;
	}

	public void setChargesIncluded(ChargeIncludedIndicator ChargesIncluded) {
		this.ChargesIncluded = ChargesIncluded;
	}
}