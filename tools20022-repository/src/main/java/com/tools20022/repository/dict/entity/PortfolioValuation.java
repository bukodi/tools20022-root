package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.entity.DateTimePeriod;

/**
 * Valuation information of the portfolio.
 */
public class PortfolioValuation {

	private CurrencyAndAmount TotalPortfolioValue;
	private CurrencyAndAmount TotalBookValue;
	private CurrencyAndAmount TotalReceipts;
	private CurrencyAndAmount TotalDisbursements;
	private CurrencyAndAmount IncomeReceived;
	private CurrencyAndAmount ExpensesPaid;
	private Portfolio Portfolio;
	private DateTimePeriod ValuationPeriod;

	public CurrencyAndAmount getTotalPortfolioValue() {
		return TotalPortfolioValue;
	}

	public void setTotalPortfolioValue(CurrencyAndAmount TotalPortfolioValue) {
		this.TotalPortfolioValue = TotalPortfolioValue;
	}

	public CurrencyAndAmount getTotalBookValue() {
		return TotalBookValue;
	}

	public void setTotalBookValue(CurrencyAndAmount TotalBookValue) {
		this.TotalBookValue = TotalBookValue;
	}

	public CurrencyAndAmount getTotalReceipts() {
		return TotalReceipts;
	}

	public void setTotalReceipts(CurrencyAndAmount TotalReceipts) {
		this.TotalReceipts = TotalReceipts;
	}

	public CurrencyAndAmount getTotalDisbursements() {
		return TotalDisbursements;
	}

	public void setTotalDisbursements(CurrencyAndAmount TotalDisbursements) {
		this.TotalDisbursements = TotalDisbursements;
	}

	public CurrencyAndAmount getIncomeReceived() {
		return IncomeReceived;
	}

	public void setIncomeReceived(CurrencyAndAmount IncomeReceived) {
		this.IncomeReceived = IncomeReceived;
	}

	public CurrencyAndAmount getExpensesPaid() {
		return ExpensesPaid;
	}

	public void setExpensesPaid(CurrencyAndAmount ExpensesPaid) {
		this.ExpensesPaid = ExpensesPaid;
	}

	public Portfolio getPortfolio() {
		return Portfolio;
	}

	public void setPortfolio(Portfolio Portfolio) {
		this.Portfolio = Portfolio;
	}

	public DateTimePeriod getValuationPeriod() {
		return ValuationPeriod;
	}

	public void setValuationPeriod(DateTimePeriod ValuationPeriod) {
		this.ValuationPeriod = ValuationPeriod;
	}
}