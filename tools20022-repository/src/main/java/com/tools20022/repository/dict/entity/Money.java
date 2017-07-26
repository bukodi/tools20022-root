package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Currency (banknotes and coins) and demand deposits or 'bank money' (the
 * balance held in checking accounts and savings accounts).
 */
public class Money extends Asset {

	private CurrencyAndAmount CashAmount;

	public CurrencyAndAmount getCashAmount() {
		return CashAmount;
	}

	public void setCashAmount(CurrencyAndAmount CashAmount) {
		this.CashAmount = CashAmount;
	}
}