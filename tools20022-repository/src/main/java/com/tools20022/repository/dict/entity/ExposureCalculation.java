package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.IndependentAmount;
import com.tools20022.repository.dict.entity.CollateralBalance;
import com.tools20022.repository.dict.entity.MarginAmountRequirement;
import com.tools20022.repository.dict.entity.CollateralManagement;
import com.tools20022.repository.dict.entity.CounterpartyRisk;
import com.tools20022.repository.dict.entity.TransactionRisk;

/**
 * Description of the calculation of the amounts representing the risk that
 * needs to be covered, together with the calculation of the existing coverage.
 */
public class ExposureCalculation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount TotalCollateralCurrentValue;
	private ActiveCurrencyAndAmount TotalExposedAmount;
	private IndependentAmount CurrentIndependentAmount;
	private CollateralBalance CurrentVariationMargin;
	private CollateralBalance CurrentSegregatedIndependentAmount;
	private MarginAmountRequirement VariationMarginAmountRequirement;
	private MarginAmountRequirement SegregatedAmountRequirement;
	private CollateralManagement CollateralManagement;
	private CounterpartyRisk CounterpartyRisk;
	private TransactionRisk TransactionRisk;
	private ActiveCurrencyAndAmount TotalCollateralAfterHaircut;

	public ActiveCurrencyAndAmount getTotalCollateralCurrentValue() {
		return TotalCollateralCurrentValue;
	}

	public void setTotalCollateralCurrentValue(
			ActiveCurrencyAndAmount TotalCollateralCurrentValue) {
		this.TotalCollateralCurrentValue = TotalCollateralCurrentValue;
	}

	public ActiveCurrencyAndAmount getTotalExposedAmount() {
		return TotalExposedAmount;
	}

	public void setTotalExposedAmount(ActiveCurrencyAndAmount TotalExposedAmount) {
		this.TotalExposedAmount = TotalExposedAmount;
	}

	public IndependentAmount getCurrentIndependentAmount() {
		return CurrentIndependentAmount;
	}

	public void setCurrentIndependentAmount(
			IndependentAmount CurrentIndependentAmount) {
		this.CurrentIndependentAmount = CurrentIndependentAmount;
	}

	public CollateralBalance getCurrentVariationMargin() {
		return CurrentVariationMargin;
	}

	public void setCurrentVariationMargin(
			CollateralBalance CurrentVariationMargin) {
		this.CurrentVariationMargin = CurrentVariationMargin;
	}

	public CollateralBalance getCurrentSegregatedIndependentAmount() {
		return CurrentSegregatedIndependentAmount;
	}

	public void setCurrentSegregatedIndependentAmount(
			CollateralBalance CurrentSegregatedIndependentAmount) {
		this.CurrentSegregatedIndependentAmount = CurrentSegregatedIndependentAmount;
	}

	public MarginAmountRequirement getVariationMarginAmountRequirement() {
		return VariationMarginAmountRequirement;
	}

	public void setVariationMarginAmountRequirement(
			MarginAmountRequirement VariationMarginAmountRequirement) {
		this.VariationMarginAmountRequirement = VariationMarginAmountRequirement;
	}

	public MarginAmountRequirement getSegregatedAmountRequirement() {
		return SegregatedAmountRequirement;
	}

	public void setSegregatedAmountRequirement(
			MarginAmountRequirement SegregatedAmountRequirement) {
		this.SegregatedAmountRequirement = SegregatedAmountRequirement;
	}

	public CollateralManagement getCollateralManagement() {
		return CollateralManagement;
	}

	public void setCollateralManagement(
			CollateralManagement CollateralManagement) {
		this.CollateralManagement = CollateralManagement;
	}

	public CounterpartyRisk getCounterpartyRisk() {
		return CounterpartyRisk;
	}

	public void setCounterpartyRisk(CounterpartyRisk CounterpartyRisk) {
		this.CounterpartyRisk = CounterpartyRisk;
	}

	public TransactionRisk getTransactionRisk() {
		return TransactionRisk;
	}

	public void setTransactionRisk(TransactionRisk TransactionRisk) {
		this.TransactionRisk = TransactionRisk;
	}

	public ActiveCurrencyAndAmount getTotalCollateralAfterHaircut() {
		return TotalCollateralAfterHaircut;
	}

	public void setTotalCollateralAfterHaircut(
			ActiveCurrencyAndAmount TotalCollateralAfterHaircut) {
		this.TotalCollateralAfterHaircut = TotalCollateralAfterHaircut;
	}
}