package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;

/**
 * Ratio expressed as a quotient of amounts.
 */
public class AmountRatio {

	private SecuritiesPricing SecuritiesPricing;
	private ActiveCurrencyAndAmount Amount1;
	private ActiveCurrencyAndAmount Amount2;

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}

	public ActiveCurrencyAndAmount getAmount1() {
		return Amount1;
	}

	public void setAmount1(ActiveCurrencyAndAmount Amount1) {
		this.Amount1 = Amount1;
	}

	public ActiveCurrencyAndAmount getAmount2() {
		return Amount2;
	}

	public void setAmount2(ActiveCurrencyAndAmount Amount2) {
		this.Amount2 = Amount2;
	}
}