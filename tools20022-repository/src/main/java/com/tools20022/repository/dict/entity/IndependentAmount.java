package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.ExposureCalculation;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;

/**
 * Amount applied as an add-on to the exposure usually intended to cover a
 * possible increase in exposure before the next valuation date.
 */
public class IndependentAmount extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ExposureCalculation RelatedRiskCalculation;
	private ActiveCurrencyAndAmount IndependentAmountPerTrade;
	private ActiveCurrencyAndAmount IndependentAmountValueAtRisk;
	private ActiveCurrencyAndAmount IndependentAmountNetOpenPosition;

	public ExposureCalculation getRelatedRiskCalculation() {
		return RelatedRiskCalculation;
	}

	public void setRelatedRiskCalculation(
			ExposureCalculation RelatedRiskCalculation) {
		this.RelatedRiskCalculation = RelatedRiskCalculation;
	}

	public ActiveCurrencyAndAmount getIndependentAmountPerTrade() {
		return IndependentAmountPerTrade;
	}

	public void setIndependentAmountPerTrade(
			ActiveCurrencyAndAmount IndependentAmountPerTrade) {
		this.IndependentAmountPerTrade = IndependentAmountPerTrade;
	}

	public ActiveCurrencyAndAmount getIndependentAmountValueAtRisk() {
		return IndependentAmountValueAtRisk;
	}

	public void setIndependentAmountValueAtRisk(
			ActiveCurrencyAndAmount IndependentAmountValueAtRisk) {
		this.IndependentAmountValueAtRisk = IndependentAmountValueAtRisk;
	}

	public ActiveCurrencyAndAmount getIndependentAmountNetOpenPosition() {
		return IndependentAmountNetOpenPosition;
	}

	public void setIndependentAmountNetOpenPosition(
			ActiveCurrencyAndAmount IndependentAmountNetOpenPosition) {
		this.IndependentAmountNetOpenPosition = IndependentAmountNetOpenPosition;
	}
}