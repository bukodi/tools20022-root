package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesPricing;

/**
 * Expression of amount.
 */
public class AmountAndPrice extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

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