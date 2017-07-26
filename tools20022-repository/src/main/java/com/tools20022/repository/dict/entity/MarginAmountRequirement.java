package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ExposureCalculation;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;

/**
 * Amount of expected margin required by any of the parties of the margin
 * calculation.
 */
public class MarginAmountRequirement {

	private ExposureCalculation VariationMarginAmountRequirementCalculation;
	private ActiveCurrencyAndAmount DeliverMarginAmount;
	private ActiveCurrencyAndAmount ReturnMarginAmount;
	private ExposureCalculation SegregatedAmountRequirementCalculation;

	public ExposureCalculation getVariationMarginAmountRequirementCalculation() {
		return VariationMarginAmountRequirementCalculation;
	}

	public void setVariationMarginAmountRequirementCalculation(
			ExposureCalculation VariationMarginAmountRequirementCalculation) {
		this.VariationMarginAmountRequirementCalculation = VariationMarginAmountRequirementCalculation;
	}

	public ActiveCurrencyAndAmount getDeliverMarginAmount() {
		return DeliverMarginAmount;
	}

	public void setDeliverMarginAmount(
			ActiveCurrencyAndAmount DeliverMarginAmount) {
		this.DeliverMarginAmount = DeliverMarginAmount;
	}

	public ActiveCurrencyAndAmount getReturnMarginAmount() {
		return ReturnMarginAmount;
	}

	public void setReturnMarginAmount(ActiveCurrencyAndAmount ReturnMarginAmount) {
		this.ReturnMarginAmount = ReturnMarginAmount;
	}

	public ExposureCalculation getSegregatedAmountRequirementCalculation() {
		return SegregatedAmountRequirementCalculation;
	}

	public void setSegregatedAmountRequirementCalculation(
			ExposureCalculation SegregatedAmountRequirementCalculation) {
		this.SegregatedAmountRequirementCalculation = SegregatedAmountRequirementCalculation;
	}
}