package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Collateral;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.ExposureCalculation;
import com.tools20022.repository.dict.entity.CollateralInterestAdministration;

/**
 * Specifies the different values taken into account to calculate the current
 * collateral.
 */
public class CollateralBalance {

	private Collateral CollateralDescription;
	private ActiveCurrencyAndAmount HeldAmount;
	private ActiveCurrencyAndAmount PriorAgreed;
	private ExposureCalculation VariationMarginRelatedRiskCalculation;
	private ActiveCurrencyAndAmount InTransit;
	private ExposureCalculation SegregatedIndependentAmountRelatedRiskCalculation;
	private CollateralInterestAdministration RelatedCollateralInterestManagement;
	private CollateralInterestAdministration CollateralInterestManagement;

	public Collateral getCollateralDescription() {
		return CollateralDescription;
	}

	public void setCollateralDescription(Collateral CollateralDescription) {
		this.CollateralDescription = CollateralDescription;
	}

	public ActiveCurrencyAndAmount getHeldAmount() {
		return HeldAmount;
	}

	public void setHeldAmount(ActiveCurrencyAndAmount HeldAmount) {
		this.HeldAmount = HeldAmount;
	}

	public ActiveCurrencyAndAmount getPriorAgreed() {
		return PriorAgreed;
	}

	public void setPriorAgreed(ActiveCurrencyAndAmount PriorAgreed) {
		this.PriorAgreed = PriorAgreed;
	}

	public ExposureCalculation getVariationMarginRelatedRiskCalculation() {
		return VariationMarginRelatedRiskCalculation;
	}

	public void setVariationMarginRelatedRiskCalculation(
			ExposureCalculation VariationMarginRelatedRiskCalculation) {
		this.VariationMarginRelatedRiskCalculation = VariationMarginRelatedRiskCalculation;
	}

	public ActiveCurrencyAndAmount getInTransit() {
		return InTransit;
	}

	public void setInTransit(ActiveCurrencyAndAmount InTransit) {
		this.InTransit = InTransit;
	}

	public ExposureCalculation getSegregatedIndependentAmountRelatedRiskCalculation() {
		return SegregatedIndependentAmountRelatedRiskCalculation;
	}

	public void setSegregatedIndependentAmountRelatedRiskCalculation(
			ExposureCalculation SegregatedIndependentAmountRelatedRiskCalculation) {
		this.SegregatedIndependentAmountRelatedRiskCalculation = SegregatedIndependentAmountRelatedRiskCalculation;
	}

	public CollateralInterestAdministration getRelatedCollateralInterestManagement() {
		return RelatedCollateralInterestManagement;
	}

	public void setRelatedCollateralInterestManagement(
			CollateralInterestAdministration RelatedCollateralInterestManagement) {
		this.RelatedCollateralInterestManagement = RelatedCollateralInterestManagement;
	}

	public CollateralInterestAdministration getCollateralInterestManagement() {
		return CollateralInterestManagement;
	}

	public void setCollateralInterestManagement(
			CollateralInterestAdministration CollateralInterestManagement) {
		this.CollateralInterestManagement = CollateralInterestManagement;
	}
}