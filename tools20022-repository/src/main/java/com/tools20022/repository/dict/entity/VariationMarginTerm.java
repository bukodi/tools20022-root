package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ExposureTerm;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.codeset.ThresholdTypeCode;

/**
 * Defines the specific terms used to calculate a variation margin.
 */
public class VariationMarginTerm extends ExposureTerm
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount ThresholdAmount;
	private ThresholdTypeCode ThresholdType;

	public ActiveCurrencyAndAmount getThresholdAmount() {
		return ThresholdAmount;
	}

	public void setThresholdAmount(ActiveCurrencyAndAmount ThresholdAmount) {
		this.ThresholdAmount = ThresholdAmount;
	}

	public ThresholdTypeCode getThresholdType() {
		return ThresholdType;
	}

	public void setThresholdType(ThresholdTypeCode ThresholdType) {
		this.ThresholdType = ThresholdType;
	}
}