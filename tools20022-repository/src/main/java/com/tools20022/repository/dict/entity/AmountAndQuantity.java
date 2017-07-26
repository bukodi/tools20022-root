package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Value expressed as an amount or a quantity. For example, the value of a
 * financial instrument.
 */
public class AmountAndQuantity {

	private SecuritiesPricing SecuritiesPricing;
	private CurrencyAndAmount Amount;
	private DecimalNumber Quantity;

	public SecuritiesPricing getSecuritiesPricing() {
		return SecuritiesPricing;
	}

	public void setSecuritiesPricing(SecuritiesPricing SecuritiesPricing) {
		this.SecuritiesPricing = SecuritiesPricing;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public DecimalNumber getQuantity() {
		return Quantity;
	}

	public void setQuantity(DecimalNumber Quantity) {
		this.Quantity = Quantity;
	}
}