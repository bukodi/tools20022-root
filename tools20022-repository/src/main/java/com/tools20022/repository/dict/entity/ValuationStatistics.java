package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.codeset.TypeOfPriceCode;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;

/**
 * Statistical data related to the price change of a security.
 */
public class ValuationStatistics extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyCode Currency;
	private TypeOfPriceCode PriceTypeChangeBasis;
	private SecuritiesPricing PriceChange;
	private PercentageRate Yield;
	private SecuritiesPricing HighestPriceValue;
	private SecuritiesPricing LowestPriceValue;
	private DateTimePeriod Period;
	private NetAssetValueCalculation NetAssetValueCalculation;
	private PercentageRate NetAssetValueChangeRate;

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public TypeOfPriceCode getPriceTypeChangeBasis() {
		return PriceTypeChangeBasis;
	}

	public void setPriceTypeChangeBasis(TypeOfPriceCode PriceTypeChangeBasis) {
		this.PriceTypeChangeBasis = PriceTypeChangeBasis;
	}

	public SecuritiesPricing getPriceChange() {
		return PriceChange;
	}

	public void setPriceChange(SecuritiesPricing PriceChange) {
		this.PriceChange = PriceChange;
	}

	public PercentageRate getYield() {
		return Yield;
	}

	public void setYield(PercentageRate Yield) {
		this.Yield = Yield;
	}

	public SecuritiesPricing getHighestPriceValue() {
		return HighestPriceValue;
	}

	public void setHighestPriceValue(SecuritiesPricing HighestPriceValue) {
		this.HighestPriceValue = HighestPriceValue;
	}

	public SecuritiesPricing getLowestPriceValue() {
		return LowestPriceValue;
	}

	public void setLowestPriceValue(SecuritiesPricing LowestPriceValue) {
		this.LowestPriceValue = LowestPriceValue;
	}

	public DateTimePeriod getPeriod() {
		return Period;
	}

	public void setPeriod(DateTimePeriod Period) {
		this.Period = Period;
	}

	public NetAssetValueCalculation getNetAssetValueCalculation() {
		return NetAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(
			NetAssetValueCalculation NetAssetValueCalculation) {
		this.NetAssetValueCalculation = NetAssetValueCalculation;
	}

	public PercentageRate getNetAssetValueChangeRate() {
		return NetAssetValueChangeRate;
	}

	public void setNetAssetValueChangeRate(
			PercentageRate NetAssetValueChangeRate) {
		this.NetAssetValueChangeRate = NetAssetValueChangeRate;
	}
}