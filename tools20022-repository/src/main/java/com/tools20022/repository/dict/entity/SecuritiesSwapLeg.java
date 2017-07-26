package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.dict.datatype.Max256Text;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.entity.FinancialInstrumentSwap;

/**
 * Contains the details of one of the legs of a swap, both in time (spot versus
 * [partial] forward details) and the side (sell versus buy).
 */
public class SecuritiesSwapLeg {

	private CurrencyAndAmount Amount;
	private BenchmarkCurveNameCode Benchmark;
	private Max256Text CurvePoint;
	private PercentageRate BenchmarkYield;
	private BaseOneRate BenchmarkOffset;
	private FinancialInstrumentSwap SpotSellSwap;
	private FinancialInstrumentSwap SpotBuySwap;
	private FinancialInstrumentSwap ForwardBuyBackSwap;
	private FinancialInstrumentSwap ForwardSellBackSwap;

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public BenchmarkCurveNameCode getBenchmark() {
		return Benchmark;
	}

	public void setBenchmark(BenchmarkCurveNameCode Benchmark) {
		this.Benchmark = Benchmark;
	}

	public Max256Text getCurvePoint() {
		return CurvePoint;
	}

	public void setCurvePoint(Max256Text CurvePoint) {
		this.CurvePoint = CurvePoint;
	}

	public PercentageRate getBenchmarkYield() {
		return BenchmarkYield;
	}

	public void setBenchmarkYield(PercentageRate BenchmarkYield) {
		this.BenchmarkYield = BenchmarkYield;
	}

	public BaseOneRate getBenchmarkOffset() {
		return BenchmarkOffset;
	}

	public void setBenchmarkOffset(BaseOneRate BenchmarkOffset) {
		this.BenchmarkOffset = BenchmarkOffset;
	}

	public FinancialInstrumentSwap getSpotSellSwap() {
		return SpotSellSwap;
	}

	public void setSpotSellSwap(FinancialInstrumentSwap SpotSellSwap) {
		this.SpotSellSwap = SpotSellSwap;
	}

	public FinancialInstrumentSwap getSpotBuySwap() {
		return SpotBuySwap;
	}

	public void setSpotBuySwap(FinancialInstrumentSwap SpotBuySwap) {
		this.SpotBuySwap = SpotBuySwap;
	}

	public FinancialInstrumentSwap getForwardBuyBackSwap() {
		return ForwardBuyBackSwap;
	}

	public void setForwardBuyBackSwap(FinancialInstrumentSwap ForwardBuyBackSwap) {
		this.ForwardBuyBackSwap = ForwardBuyBackSwap;
	}

	public FinancialInstrumentSwap getForwardSellBackSwap() {
		return ForwardSellBackSwap;
	}

	public void setForwardSellBackSwap(
			FinancialInstrumentSwap ForwardSellBackSwap) {
		this.ForwardSellBackSwap = ForwardSellBackSwap;
	}
}