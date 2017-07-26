package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PortfolioStrategy;
import com.tools20022.repository.dict.codeset.CurrencyCode;

/**
 * Strategy is currency based.
 */
public class CurrencyStrategy extends PortfolioStrategy {

	private CurrencyCode Currency;

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}
}