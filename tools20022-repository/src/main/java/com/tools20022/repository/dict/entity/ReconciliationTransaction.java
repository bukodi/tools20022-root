package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Reconciliation;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.TypeTransactionTotalsCode;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.entity.CardPayment;

/**
 * Totals performed during the reconciliation period, for a certain type of
 * transaction.
 */
public class ReconciliationTransaction extends Reconciliation {

	private Max35Text ReconciliationIdentification;
	private CurrencyCode Currency;
	private TypeTransactionTotalsCode TransactionType;
	private Max35Text TotalNumber;
	private ImpliedCurrencyAndAmount CumulativeAmount;
	private TrueFalseIndicator ClosePeriod;
	private CardPayment CardPaymentTotal;

	public Max35Text getReconciliationIdentification() {
		return ReconciliationIdentification;
	}

	public void setReconciliationIdentification(
			Max35Text ReconciliationIdentification) {
		this.ReconciliationIdentification = ReconciliationIdentification;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public TypeTransactionTotalsCode getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(TypeTransactionTotalsCode TransactionType) {
		this.TransactionType = TransactionType;
	}

	public Max35Text getTotalNumber() {
		return TotalNumber;
	}

	public void setTotalNumber(Max35Text TotalNumber) {
		this.TotalNumber = TotalNumber;
	}

	public ImpliedCurrencyAndAmount getCumulativeAmount() {
		return CumulativeAmount;
	}

	public void setCumulativeAmount(ImpliedCurrencyAndAmount CumulativeAmount) {
		this.CumulativeAmount = CumulativeAmount;
	}

	public TrueFalseIndicator getClosePeriod() {
		return ClosePeriod;
	}

	public void setClosePeriod(TrueFalseIndicator ClosePeriod) {
		this.ClosePeriod = ClosePeriod;
	}

	public CardPayment getCardPaymentTotal() {
		return CardPaymentTotal;
	}

	public void setCardPaymentTotal(CardPayment CardPaymentTotal) {
		this.CardPaymentTotal = CardPaymentTotal;
	}
}