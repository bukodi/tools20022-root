package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.SecuritiesSwapLeg;
import com.tools20022.repository.dict.entity.Quote;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.codeset.InterestComputationMethodCode;

/**
 * Characteristics and conditions by which a borrower can exchange one type of
 * financial instrument for another.
 */
public class FinancialInstrumentSwap {

	private DateTimePeriod Maturity;
	private SecuritiesSwapLeg SpotSell;
	private SecuritiesSwapLeg SpotBuy;
	private SecuritiesSwapLeg ForwardBuyBack;
	private SecuritiesSwapLeg ForwardSellBack;
	private Quote RelatedQuote;
	private FrequencyCode ForwardSellBackFrequency;
	private FrequencyCode ForwardBuyBackFrequency;
	private InterestComputationMethodCode InterestComputation;

	public DateTimePeriod getMaturity() {
		return Maturity;
	}

	public void setMaturity(DateTimePeriod Maturity) {
		this.Maturity = Maturity;
	}

	public SecuritiesSwapLeg getSpotSell() {
		return SpotSell;
	}

	public void setSpotSell(SecuritiesSwapLeg SpotSell) {
		this.SpotSell = SpotSell;
	}

	public SecuritiesSwapLeg getSpotBuy() {
		return SpotBuy;
	}

	public void setSpotBuy(SecuritiesSwapLeg SpotBuy) {
		this.SpotBuy = SpotBuy;
	}

	public SecuritiesSwapLeg getForwardBuyBack() {
		return ForwardBuyBack;
	}

	public void setForwardBuyBack(SecuritiesSwapLeg ForwardBuyBack) {
		this.ForwardBuyBack = ForwardBuyBack;
	}

	public SecuritiesSwapLeg getForwardSellBack() {
		return ForwardSellBack;
	}

	public void setForwardSellBack(SecuritiesSwapLeg ForwardSellBack) {
		this.ForwardSellBack = ForwardSellBack;
	}

	public Quote getRelatedQuote() {
		return RelatedQuote;
	}

	public void setRelatedQuote(Quote RelatedQuote) {
		this.RelatedQuote = RelatedQuote;
	}

	public FrequencyCode getForwardSellBackFrequency() {
		return ForwardSellBackFrequency;
	}

	public void setForwardSellBackFrequency(
			FrequencyCode ForwardSellBackFrequency) {
		this.ForwardSellBackFrequency = ForwardSellBackFrequency;
	}

	public FrequencyCode getForwardBuyBackFrequency() {
		return ForwardBuyBackFrequency;
	}

	public void setForwardBuyBackFrequency(FrequencyCode ForwardBuyBackFrequency) {
		this.ForwardBuyBackFrequency = ForwardBuyBackFrequency;
	}

	public InterestComputationMethodCode getInterestComputation() {
		return InterestComputation;
	}

	public void setInterestComputation(
			InterestComputationMethodCode InterestComputation) {
		this.InterestComputation = InterestComputation;
	}
}