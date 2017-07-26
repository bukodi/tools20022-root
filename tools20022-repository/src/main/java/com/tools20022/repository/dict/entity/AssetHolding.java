package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.entity.HaircutValuation;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.codeset.UnrealisedCode;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.dict.codeset.BlockedReasonCode;

/**
 * Specifies in terms of value and quantity the assets.
 */
public class AssetHolding {

	private ActiveOrHistoricCurrencyAndAmount HoldingValue;
	private CurrencyAndAmount BookValue;
	private CurrencyAndAmount FaceAmount;
	private CurrencyAndAmount AmortisedFaceValue;
	private ActiveCurrencyAndAmount MarketValue;
	private Balance Balance;
	private CurrencyAndAmount UnrealisedGainOrLoss;
	private Asset Asset;
	private HaircutValuation Haircut;
	private ActiveCurrencyAndAmount EligibleCollateralValue;
	private CurrencyExchange ExchangeRate;
	private CurrencyAndAmount CapValue;
	private ActiveCurrencyAndAmount RiskAdjustedValue;
	private CurrencyAndAmount RealisedGainOrLoss;
	private UnrealisedCode UnrealisedType;
	private CurrencyAndAmount PostHaircutValue;
	private Interest Interest;
	private Collateral Collateral;
	private FinancialAssetBalanceTypeCode FinancialAssetType;
	private Collateral VariationMarginCollateral;
	private Collateral IndependentAmountCollateral;
	private BlockedReasonCode HoldingType;
	private CurrencyAndAmount GuaranteeAmount;

	public ActiveOrHistoricCurrencyAndAmount getHoldingValue() {
		return HoldingValue;
	}

	public void setHoldingValue(ActiveOrHistoricCurrencyAndAmount HoldingValue) {
		this.HoldingValue = HoldingValue;
	}

	public CurrencyAndAmount getBookValue() {
		return BookValue;
	}

	public void setBookValue(CurrencyAndAmount BookValue) {
		this.BookValue = BookValue;
	}

	public CurrencyAndAmount getFaceAmount() {
		return FaceAmount;
	}

	public void setFaceAmount(CurrencyAndAmount FaceAmount) {
		this.FaceAmount = FaceAmount;
	}

	public CurrencyAndAmount getAmortisedFaceValue() {
		return AmortisedFaceValue;
	}

	public void setAmortisedFaceValue(CurrencyAndAmount AmortisedFaceValue) {
		this.AmortisedFaceValue = AmortisedFaceValue;
	}

	public ActiveCurrencyAndAmount getMarketValue() {
		return MarketValue;
	}

	public void setMarketValue(ActiveCurrencyAndAmount MarketValue) {
		this.MarketValue = MarketValue;
	}

	public Balance getBalance() {
		return Balance;
	}

	public void setBalance(Balance Balance) {
		this.Balance = Balance;
	}

	public CurrencyAndAmount getUnrealisedGainOrLoss() {
		return UnrealisedGainOrLoss;
	}

	public void setUnrealisedGainOrLoss(CurrencyAndAmount UnrealisedGainOrLoss) {
		this.UnrealisedGainOrLoss = UnrealisedGainOrLoss;
	}

	public Asset getAsset() {
		return Asset;
	}

	public void setAsset(Asset Asset) {
		this.Asset = Asset;
	}

	public HaircutValuation getHaircut() {
		return Haircut;
	}

	public void setHaircut(HaircutValuation Haircut) {
		this.Haircut = Haircut;
	}

	public ActiveCurrencyAndAmount getEligibleCollateralValue() {
		return EligibleCollateralValue;
	}

	public void setEligibleCollateralValue(
			ActiveCurrencyAndAmount EligibleCollateralValue) {
		this.EligibleCollateralValue = EligibleCollateralValue;
	}

	public CurrencyExchange getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(CurrencyExchange ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}

	public CurrencyAndAmount getCapValue() {
		return CapValue;
	}

	public void setCapValue(CurrencyAndAmount CapValue) {
		this.CapValue = CapValue;
	}

	public ActiveCurrencyAndAmount getRiskAdjustedValue() {
		return RiskAdjustedValue;
	}

	public void setRiskAdjustedValue(ActiveCurrencyAndAmount RiskAdjustedValue) {
		this.RiskAdjustedValue = RiskAdjustedValue;
	}

	public CurrencyAndAmount getRealisedGainOrLoss() {
		return RealisedGainOrLoss;
	}

	public void setRealisedGainOrLoss(CurrencyAndAmount RealisedGainOrLoss) {
		this.RealisedGainOrLoss = RealisedGainOrLoss;
	}

	public UnrealisedCode getUnrealisedType() {
		return UnrealisedType;
	}

	public void setUnrealisedType(UnrealisedCode UnrealisedType) {
		this.UnrealisedType = UnrealisedType;
	}

	public CurrencyAndAmount getPostHaircutValue() {
		return PostHaircutValue;
	}

	public void setPostHaircutValue(CurrencyAndAmount PostHaircutValue) {
		this.PostHaircutValue = PostHaircutValue;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}

	public FinancialAssetBalanceTypeCode getFinancialAssetType() {
		return FinancialAssetType;
	}

	public void setFinancialAssetType(
			FinancialAssetBalanceTypeCode FinancialAssetType) {
		this.FinancialAssetType = FinancialAssetType;
	}

	public Collateral getVariationMarginCollateral() {
		return VariationMarginCollateral;
	}

	public void setVariationMarginCollateral(
			Collateral VariationMarginCollateral) {
		this.VariationMarginCollateral = VariationMarginCollateral;
	}

	public Collateral getIndependentAmountCollateral() {
		return IndependentAmountCollateral;
	}

	public void setIndependentAmountCollateral(
			Collateral IndependentAmountCollateral) {
		this.IndependentAmountCollateral = IndependentAmountCollateral;
	}

	public BlockedReasonCode getHoldingType() {
		return HoldingType;
	}

	public void setHoldingType(BlockedReasonCode HoldingType) {
		this.HoldingType = HoldingType;
	}

	public CurrencyAndAmount getGuaranteeAmount() {
		return GuaranteeAmount;
	}

	public void setGuaranteeAmount(CurrencyAndAmount GuaranteeAmount) {
		this.GuaranteeAmount = GuaranteeAmount;
	}
}