package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.ListTrading;
import com.tools20022.repository.dict.codeset.LiquidityIndicatorTypeCode;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Ability of a financial instrument to be easily traded and converted to cash,
 * at conditions that do not affect its price.
 */
public class Liquidity {

	private SecuritiesQuantity Quantity;
	private ListTrading ListTrading;
	private LiquidityIndicatorTypeCode IndicatorType;
	private PercentageRate Upper;
	private PercentageRate Lower;
	private CurrencyAndAmount Value;
	private PercentageRate WeightedAverageLiquidity;

	public SecuritiesQuantity getQuantity() {
		return Quantity;
	}

	public void setQuantity(SecuritiesQuantity Quantity) {
		this.Quantity = Quantity;
	}

	public ListTrading getListTrading() {
		return ListTrading;
	}

	public void setListTrading(ListTrading ListTrading) {
		this.ListTrading = ListTrading;
	}

	public LiquidityIndicatorTypeCode getIndicatorType() {
		return IndicatorType;
	}

	public void setIndicatorType(LiquidityIndicatorTypeCode IndicatorType) {
		this.IndicatorType = IndicatorType;
	}

	public PercentageRate getUpper() {
		return Upper;
	}

	public void setUpper(PercentageRate Upper) {
		this.Upper = Upper;
	}

	public PercentageRate getLower() {
		return Lower;
	}

	public void setLower(PercentageRate Lower) {
		this.Lower = Lower;
	}

	public CurrencyAndAmount getValue() {
		return Value;
	}

	public void setValue(CurrencyAndAmount Value) {
		this.Value = Value;
	}

	public PercentageRate getWeightedAverageLiquidity() {
		return WeightedAverageLiquidity;
	}

	public void setWeightedAverageLiquidity(
			PercentageRate WeightedAverageLiquidity) {
		this.WeightedAverageLiquidity = WeightedAverageLiquidity;
	}
}