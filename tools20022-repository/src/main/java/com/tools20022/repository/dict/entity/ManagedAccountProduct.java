package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.FinancialProduct;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.InvestmentAccountContract;

/**
 * Product which provides guidance to investors to manage their portfolios.
 */
public class ManagedAccountProduct extends FinancialProduct {

	private Account Account;
	private InvestmentAccountContract InvestmentAccountContract;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public InvestmentAccountContract getInvestmentAccountContract() {
		return InvestmentAccountContract;
	}

	public void setInvestmentAccountContract(
			InvestmentAccountContract InvestmentAccountContract) {
		this.InvestmentAccountContract = InvestmentAccountContract;
	}
}