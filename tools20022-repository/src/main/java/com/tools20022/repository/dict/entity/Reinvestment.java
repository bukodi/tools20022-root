package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestmentAccountService;
import com.tools20022.repository.dict.entity.InvestmentFundClass;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Parameters of the reinvestment of the income on the fund.
 */
public class Reinvestment {

	private InvestmentAccountService RelatedinvestmentAccountService;
	private InvestmentFundClass InvestmentFundClass;
	private PercentageRate Percentage;

	public InvestmentAccountService getRelatedinvestmentAccountService() {
		return RelatedinvestmentAccountService;
	}

	public void setRelatedinvestmentAccountService(
			InvestmentAccountService RelatedinvestmentAccountService) {
		this.RelatedinvestmentAccountService = RelatedinvestmentAccountService;
	}

	public InvestmentFundClass getInvestmentFundClass() {
		return InvestmentFundClass;
	}

	public void setInvestmentFundClass(InvestmentFundClass InvestmentFundClass) {
		this.InvestmentFundClass = InvestmentFundClass;
	}

	public PercentageRate getPercentage() {
		return Percentage;
	}

	public void setPercentage(PercentageRate Percentage) {
		this.Percentage = Percentage;
	}
}