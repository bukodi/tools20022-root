package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.AmountRangeBoundary;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.InterestCalculation;

/**
 * Range of amount values.
 */
public class AmountRange {

	private AmountRangeBoundary FromAmount;
	private AmountRangeBoundary ToAmount;
	private CurrencyAndAmount EqualAmount;
	private CurrencyAndAmount NotEqualAmount;
	private DebitCreditCode CreditDebitIndicator;
	private CurrencyCode Currency;
	private InterestCalculation RelatedInterest;

	public AmountRangeBoundary getFromAmount() {
		return FromAmount;
	}

	public void setFromAmount(AmountRangeBoundary FromAmount) {
		this.FromAmount = FromAmount;
	}

	public AmountRangeBoundary getToAmount() {
		return ToAmount;
	}

	public void setToAmount(AmountRangeBoundary ToAmount) {
		this.ToAmount = ToAmount;
	}

	public CurrencyAndAmount getEqualAmount() {
		return EqualAmount;
	}

	public void setEqualAmount(CurrencyAndAmount EqualAmount) {
		this.EqualAmount = EqualAmount;
	}

	public CurrencyAndAmount getNotEqualAmount() {
		return NotEqualAmount;
	}

	public void setNotEqualAmount(CurrencyAndAmount NotEqualAmount) {
		this.NotEqualAmount = NotEqualAmount;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public InterestCalculation getRelatedInterest() {
		return RelatedInterest;
	}

	public void setRelatedInterest(InterestCalculation RelatedInterest) {
		this.RelatedInterest = RelatedInterest;
	}
}