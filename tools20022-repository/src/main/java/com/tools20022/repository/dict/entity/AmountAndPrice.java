package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesPricing;

/**
 * Expression of amount.
 */
public class AmountAndPrice {

	private CurrencyAndAmount Amount;
	private SecuritiesPricing Price;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}
}