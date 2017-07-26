package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.OptionStyleCode;
import com.tools20022.repository.dict.codeset.OptionTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Financial instrument providing the holder the privilege to subscribe to or to
 * receive specific assets on terms specified.
 */
public class Entitlement extends Security {

	private SecuritiesPricing StrikePrice;
	private YesNoIndicator CoveredIndicator;
	private OptionStyleCode OptionStyle;
	private OptionTypeCode OptionType;
	private CurrencyAndAmount CappedValue;
	private YesNoIndicator CappedIndicator;

	public SecuritiesPricing getStrikePrice() {
		return StrikePrice;
	}

	public void setStrikePrice(SecuritiesPricing StrikePrice) {
		this.StrikePrice = StrikePrice;
	}

	public YesNoIndicator getCoveredIndicator() {
		return CoveredIndicator;
	}

	public void setCoveredIndicator(YesNoIndicator CoveredIndicator) {
		this.CoveredIndicator = CoveredIndicator;
	}

	public OptionStyleCode getOptionStyle() {
		return OptionStyle;
	}

	public void setOptionStyle(OptionStyleCode OptionStyle) {
		this.OptionStyle = OptionStyle;
	}

	public OptionTypeCode getOptionType() {
		return OptionType;
	}

	public void setOptionType(OptionTypeCode OptionType) {
		this.OptionType = OptionType;
	}

	public CurrencyAndAmount getCappedValue() {
		return CappedValue;
	}

	public void setCappedValue(CurrencyAndAmount CappedValue) {
		this.CappedValue = CappedValue;
	}

	public YesNoIndicator getCappedIndicator() {
		return CappedIndicator;
	}

	public void setCappedIndicator(YesNoIndicator CappedIndicator) {
		this.CappedIndicator = CappedIndicator;
	}
}