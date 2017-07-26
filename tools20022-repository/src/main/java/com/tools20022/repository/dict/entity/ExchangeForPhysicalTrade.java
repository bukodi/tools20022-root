package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Technique whereby a position in the underlying is traded for a futures
 * position in the physical commodity markets.
 */
public class ExchangeForPhysicalTrade {

	private PercentageRate OutsideIndex;
	private CurrencyAndAmount FairValue;
	private CurrencyAndAmount ValueForFutures;
	private CurrencyAndAmount OutMainCountryIndex;
	private SecuritiesOrder SecuritiesOrder;

	public PercentageRate getOutsideIndex() {
		return OutsideIndex;
	}

	public void setOutsideIndex(PercentageRate OutsideIndex) {
		this.OutsideIndex = OutsideIndex;
	}

	public CurrencyAndAmount getFairValue() {
		return FairValue;
	}

	public void setFairValue(CurrencyAndAmount FairValue) {
		this.FairValue = FairValue;
	}

	public CurrencyAndAmount getValueForFutures() {
		return ValueForFutures;
	}

	public void setValueForFutures(CurrencyAndAmount ValueForFutures) {
		this.ValueForFutures = ValueForFutures;
	}

	public CurrencyAndAmount getOutMainCountryIndex() {
		return OutMainCountryIndex;
	}

	public void setOutMainCountryIndex(CurrencyAndAmount OutMainCountryIndex) {
		this.OutMainCountryIndex = OutMainCountryIndex;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}
}