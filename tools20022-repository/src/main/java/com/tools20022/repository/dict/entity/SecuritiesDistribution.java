package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Distribution;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.codeset.PaymentTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesAndCashDistribution;
import com.tools20022.repository.dict.codeset.RoundingDirectionCode;

/**
 * Characteristics for a securities distribution event.
 */
public class SecuritiesDistribution extends Distribution {

	private SecuritiesQuantity MaximumHolding;
	private SecuritiesQuantity IntermediateToUnderlyingNumerator;
	private SecuritiesQuantity IntermediateToUnderlyingDenominator;
	private SecuritiesQuantity DistributedToUnderlyingDenominator;
	private SecuritiesQuantity DistributedToUnderlyingNumerator;
	private SecuritiesQuantity MinimumHolding;
	private SecuritiesPricing CashFractionsPrice;
	private SecuritiesPricing SubscriptionPrice;
	private SecuritiesPricing ReinvestmentPrice;
	private ISODateTime IntermediateSecurityExpiryDate;
	private ISODateTime TradingAvailabilityDate;
	private ISODateTime OfferExpiryDate;
	private PercentageRate OversubscriptionRate;
	private CurrencyAndAmount OversubscriptionAmount;
	private CurrencyAndAmount ReinvestmentAmount;
	private BaseOneRate ReinvestmentRate;
	private YesNoIndicator LoyalityPremiumIndicator;
	private YesNoIndicator OversubscriptionIndicator;
	private YesNoIndicator RenounceableIndicator;
	private Number DecimalPrecision;
	private PaymentTypeCode ReinvestmentType;
	private YesNoIndicator RevocableIndicator;
	private SecuritiesAndCashDistribution SecuritiesAndCashDistribution;
	private RoundingDirectionCode FractionTreatment;
	private YesNoIndicator IntermediateSecurityDistributionIndicator;

	public SecuritiesQuantity getMaximumHolding() {
		return MaximumHolding;
	}

	public void setMaximumHolding(SecuritiesQuantity MaximumHolding) {
		this.MaximumHolding = MaximumHolding;
	}

	public SecuritiesQuantity getIntermediateToUnderlyingNumerator() {
		return IntermediateToUnderlyingNumerator;
	}

	public void setIntermediateToUnderlyingNumerator(
			SecuritiesQuantity IntermediateToUnderlyingNumerator) {
		this.IntermediateToUnderlyingNumerator = IntermediateToUnderlyingNumerator;
	}

	public SecuritiesQuantity getIntermediateToUnderlyingDenominator() {
		return IntermediateToUnderlyingDenominator;
	}

	public void setIntermediateToUnderlyingDenominator(
			SecuritiesQuantity IntermediateToUnderlyingDenominator) {
		this.IntermediateToUnderlyingDenominator = IntermediateToUnderlyingDenominator;
	}

	public SecuritiesQuantity getDistributedToUnderlyingDenominator() {
		return DistributedToUnderlyingDenominator;
	}

	public void setDistributedToUnderlyingDenominator(
			SecuritiesQuantity DistributedToUnderlyingDenominator) {
		this.DistributedToUnderlyingDenominator = DistributedToUnderlyingDenominator;
	}

	public SecuritiesQuantity getDistributedToUnderlyingNumerator() {
		return DistributedToUnderlyingNumerator;
	}

	public void setDistributedToUnderlyingNumerator(
			SecuritiesQuantity DistributedToUnderlyingNumerator) {
		this.DistributedToUnderlyingNumerator = DistributedToUnderlyingNumerator;
	}

	public SecuritiesQuantity getMinimumHolding() {
		return MinimumHolding;
	}

	public void setMinimumHolding(SecuritiesQuantity MinimumHolding) {
		this.MinimumHolding = MinimumHolding;
	}

	public SecuritiesPricing getCashFractionsPrice() {
		return CashFractionsPrice;
	}

	public void setCashFractionsPrice(SecuritiesPricing CashFractionsPrice) {
		this.CashFractionsPrice = CashFractionsPrice;
	}

	public SecuritiesPricing getSubscriptionPrice() {
		return SubscriptionPrice;
	}

	public void setSubscriptionPrice(SecuritiesPricing SubscriptionPrice) {
		this.SubscriptionPrice = SubscriptionPrice;
	}

	public SecuritiesPricing getReinvestmentPrice() {
		return ReinvestmentPrice;
	}

	public void setReinvestmentPrice(SecuritiesPricing ReinvestmentPrice) {
		this.ReinvestmentPrice = ReinvestmentPrice;
	}

	public ISODateTime getIntermediateSecurityExpiryDate() {
		return IntermediateSecurityExpiryDate;
	}

	public void setIntermediateSecurityExpiryDate(
			ISODateTime IntermediateSecurityExpiryDate) {
		this.IntermediateSecurityExpiryDate = IntermediateSecurityExpiryDate;
	}

	public ISODateTime getTradingAvailabilityDate() {
		return TradingAvailabilityDate;
	}

	public void setTradingAvailabilityDate(ISODateTime TradingAvailabilityDate) {
		this.TradingAvailabilityDate = TradingAvailabilityDate;
	}

	public ISODateTime getOfferExpiryDate() {
		return OfferExpiryDate;
	}

	public void setOfferExpiryDate(ISODateTime OfferExpiryDate) {
		this.OfferExpiryDate = OfferExpiryDate;
	}

	public PercentageRate getOversubscriptionRate() {
		return OversubscriptionRate;
	}

	public void setOversubscriptionRate(PercentageRate OversubscriptionRate) {
		this.OversubscriptionRate = OversubscriptionRate;
	}

	public CurrencyAndAmount getOversubscriptionAmount() {
		return OversubscriptionAmount;
	}

	public void setOversubscriptionAmount(
			CurrencyAndAmount OversubscriptionAmount) {
		this.OversubscriptionAmount = OversubscriptionAmount;
	}

	public CurrencyAndAmount getReinvestmentAmount() {
		return ReinvestmentAmount;
	}

	public void setReinvestmentAmount(CurrencyAndAmount ReinvestmentAmount) {
		this.ReinvestmentAmount = ReinvestmentAmount;
	}

	public BaseOneRate getReinvestmentRate() {
		return ReinvestmentRate;
	}

	public void setReinvestmentRate(BaseOneRate ReinvestmentRate) {
		this.ReinvestmentRate = ReinvestmentRate;
	}

	public YesNoIndicator getLoyalityPremiumIndicator() {
		return LoyalityPremiumIndicator;
	}

	public void setLoyalityPremiumIndicator(
			YesNoIndicator LoyalityPremiumIndicator) {
		this.LoyalityPremiumIndicator = LoyalityPremiumIndicator;
	}

	public YesNoIndicator getOversubscriptionIndicator() {
		return OversubscriptionIndicator;
	}

	public void setOversubscriptionIndicator(
			YesNoIndicator OversubscriptionIndicator) {
		this.OversubscriptionIndicator = OversubscriptionIndicator;
	}

	public YesNoIndicator getRenounceableIndicator() {
		return RenounceableIndicator;
	}

	public void setRenounceableIndicator(YesNoIndicator RenounceableIndicator) {
		this.RenounceableIndicator = RenounceableIndicator;
	}

	public Number getDecimalPrecision() {
		return DecimalPrecision;
	}

	public void setDecimalPrecision(Number DecimalPrecision) {
		this.DecimalPrecision = DecimalPrecision;
	}

	public PaymentTypeCode getReinvestmentType() {
		return ReinvestmentType;
	}

	public void setReinvestmentType(PaymentTypeCode ReinvestmentType) {
		this.ReinvestmentType = ReinvestmentType;
	}

	public YesNoIndicator getRevocableIndicator() {
		return RevocableIndicator;
	}

	public void setRevocableIndicator(YesNoIndicator RevocableIndicator) {
		this.RevocableIndicator = RevocableIndicator;
	}

	public SecuritiesAndCashDistribution getSecuritiesAndCashDistribution() {
		return SecuritiesAndCashDistribution;
	}

	public void setSecuritiesAndCashDistribution(
			SecuritiesAndCashDistribution SecuritiesAndCashDistribution) {
		this.SecuritiesAndCashDistribution = SecuritiesAndCashDistribution;
	}

	public RoundingDirectionCode getFractionTreatment() {
		return FractionTreatment;
	}

	public void setFractionTreatment(RoundingDirectionCode FractionTreatment) {
		this.FractionTreatment = FractionTreatment;
	}

	public YesNoIndicator getIntermediateSecurityDistributionIndicator() {
		return IntermediateSecurityDistributionIndicator;
	}

	public void setIntermediateSecurityDistributionIndicator(
			YesNoIndicator IntermediateSecurityDistributionIndicator) {
		this.IntermediateSecurityDistributionIndicator = IntermediateSecurityDistributionIndicator;
	}
}