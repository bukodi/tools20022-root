package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.ExposureTypeCode;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.RoundingMethodCode;
import com.tools20022.repository.dict.entity.CollateralAgreement;

/**
 * Specifies the terms used to calculate a risk exposure and its coverage.
 */
public class ExposureTerm {

	private ExposureTypeCode ExposureType;
	private ActiveCurrencyAndAmount MinimumTransferAmount;
	private ActiveCurrencyAndAmount RoundingAmount;
	private RoundingMethodCode RoundingMethod;
	private CollateralAgreement RelatedCollateralAgreement;
	private ActiveCurrencyAndAmount MinimumRequirementDeposit;

	public ExposureTypeCode getExposureType() {
		return ExposureType;
	}

	public void setExposureType(ExposureTypeCode ExposureType) {
		this.ExposureType = ExposureType;
	}

	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return MinimumTransferAmount;
	}

	public void setMinimumTransferAmount(
			ActiveCurrencyAndAmount MinimumTransferAmount) {
		this.MinimumTransferAmount = MinimumTransferAmount;
	}

	public ActiveCurrencyAndAmount getRoundingAmount() {
		return RoundingAmount;
	}

	public void setRoundingAmount(ActiveCurrencyAndAmount RoundingAmount) {
		this.RoundingAmount = RoundingAmount;
	}

	public RoundingMethodCode getRoundingMethod() {
		return RoundingMethod;
	}

	public void setRoundingMethod(RoundingMethodCode RoundingMethod) {
		this.RoundingMethod = RoundingMethod;
	}

	public CollateralAgreement getRelatedCollateralAgreement() {
		return RelatedCollateralAgreement;
	}

	public void setRelatedCollateralAgreement(
			CollateralAgreement RelatedCollateralAgreement) {
		this.RelatedCollateralAgreement = RelatedCollateralAgreement;
	}

	public ActiveCurrencyAndAmount getMinimumRequirementDeposit() {
		return MinimumRequirementDeposit;
	}

	public void setMinimumRequirementDeposit(
			ActiveCurrencyAndAmount MinimumRequirementDeposit) {
		this.MinimumRequirementDeposit = MinimumRequirementDeposit;
	}
}