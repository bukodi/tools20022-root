package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.codeset.DebitCreditCode;

/**
 * Part of an investor's subscription amount that is held by the fund in order
 * to pay incentive / performance fees at the end of the fiscal year.
 */
public class Equalisation {

	private CurrencyAndAmount Amount;
	private ISODateTime Date;
	private PercentageRate Rate;
	private InvestmentFundClass RelatedInvestmentFundTransaction;
	private DebitCreditCode CreditDebitIndicator;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public ISODateTime getDate() {
		return Date;
	}

	public void setDate(ISODateTime Date) {
		this.Date = Date;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public InvestmentFundClass getRelatedInvestmentFundTransaction() {
		return RelatedInvestmentFundTransaction;
	}

	public void setRelatedInvestmentFundTransaction(
			InvestmentFundClass RelatedInvestmentFundTransaction) {
		this.RelatedInvestmentFundTransaction = RelatedInvestmentFundTransaction;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}
}