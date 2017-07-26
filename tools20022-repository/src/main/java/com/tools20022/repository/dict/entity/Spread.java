package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.Index;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.BuyOrSellIndicationOfInterest;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.entity.Curve;
import com.tools20022.repository.dict.datatype.DecimalNumber;

/**
 * Margin over or under an index which determines a rate.
 */
public class Spread {

	private Security BenchmarkSecurity;
	private SecuritiesFinancing SecuritiesFinancing;
	private PercentageRate SpreadRate;
	private Number BasisPointSpread;
	private Index Index;
	private SecuritiesPricing BenchmarkPrice;
	private BuyOrSellIndicationOfInterest RelatedIndicationOfInterest;
	private BuyOrSellIndicationOfInterest IndicationOfInterest;
	private InterestCalculation RelatedInterest;
	private Curve BenchmarkCurve;
	private DecimalNumber PriceOffset;

	public Security getBenchmarkSecurity() {
		return BenchmarkSecurity;
	}

	public void setBenchmarkSecurity(Security BenchmarkSecurity) {
		this.BenchmarkSecurity = BenchmarkSecurity;
	}

	public SecuritiesFinancing getSecuritiesFinancing() {
		return SecuritiesFinancing;
	}

	public void setSecuritiesFinancing(SecuritiesFinancing SecuritiesFinancing) {
		this.SecuritiesFinancing = SecuritiesFinancing;
	}

	public PercentageRate getSpreadRate() {
		return SpreadRate;
	}

	public void setSpreadRate(PercentageRate SpreadRate) {
		this.SpreadRate = SpreadRate;
	}

	public Number getBasisPointSpread() {
		return BasisPointSpread;
	}

	public void setBasisPointSpread(Number BasisPointSpread) {
		this.BasisPointSpread = BasisPointSpread;
	}

	public Index getIndex() {
		return Index;
	}

	public void setIndex(Index Index) {
		this.Index = Index;
	}

	public SecuritiesPricing getBenchmarkPrice() {
		return BenchmarkPrice;
	}

	public void setBenchmarkPrice(SecuritiesPricing BenchmarkPrice) {
		this.BenchmarkPrice = BenchmarkPrice;
	}

	public BuyOrSellIndicationOfInterest getRelatedIndicationOfInterest() {
		return RelatedIndicationOfInterest;
	}

	public void setRelatedIndicationOfInterest(
			BuyOrSellIndicationOfInterest RelatedIndicationOfInterest) {
		this.RelatedIndicationOfInterest = RelatedIndicationOfInterest;
	}

	public BuyOrSellIndicationOfInterest getIndicationOfInterest() {
		return IndicationOfInterest;
	}

	public void setIndicationOfInterest(
			BuyOrSellIndicationOfInterest IndicationOfInterest) {
		this.IndicationOfInterest = IndicationOfInterest;
	}

	public InterestCalculation getRelatedInterest() {
		return RelatedInterest;
	}

	public void setRelatedInterest(InterestCalculation RelatedInterest) {
		this.RelatedInterest = RelatedInterest;
	}

	public Curve getBenchmarkCurve() {
		return BenchmarkCurve;
	}

	public void setBenchmarkCurve(Curve BenchmarkCurve) {
		this.BenchmarkCurve = BenchmarkCurve;
	}

	public DecimalNumber getPriceOffset() {
		return PriceOffset;
	}

	public void setPriceOffset(DecimalNumber PriceOffset) {
		this.PriceOffset = PriceOffset;
	}
}