package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.System;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;

/**
 * Specifies the status of trades and their value inside a system.
 */
public class Position {

	private SecuritiesQuantity NetQuantity;
	private CurrencyAndAmount NetPositionAmount;
	private System System;
	private SecuritiesPricing Price;
	private SecuritiesSettlement SecuritiesSettlement;
	private CurrencyAndAmount InitialPositionAmount;

	public SecuritiesQuantity getNetQuantity() {
		return NetQuantity;
	}

	public void setNetQuantity(SecuritiesQuantity NetQuantity) {
		this.NetQuantity = NetQuantity;
	}

	public CurrencyAndAmount getNetPositionAmount() {
		return NetPositionAmount;
	}

	public void setNetPositionAmount(CurrencyAndAmount NetPositionAmount) {
		this.NetPositionAmount = NetPositionAmount;
	}

	public System getSystem() {
		return System;
	}

	public void setSystem(System System) {
		this.System = System;
	}

	public SecuritiesPricing getPrice() {
		return Price;
	}

	public void setPrice(SecuritiesPricing Price) {
		this.Price = Price;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public CurrencyAndAmount getInitialPositionAmount() {
		return InitialPositionAmount;
	}

	public void setInitialPositionAmount(CurrencyAndAmount InitialPositionAmount) {
		this.InitialPositionAmount = InitialPositionAmount;
	}
}