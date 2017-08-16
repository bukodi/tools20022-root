package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.MarginCall;
import com.tools20022.repository.dict.codeset.CollateralTypeCode;

/**
 * Expected collateral type.
 */
public class ExpectedCollateralType extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private MarginCall VariationMarginRelatedCall;
	private CollateralTypeCode Delivery;
	private CollateralTypeCode Return;
	private MarginCall SegregatedIndependentAmountRelatedCall;

	public MarginCall getVariationMarginRelatedCall() {
		return VariationMarginRelatedCall;
	}

	public void setVariationMarginRelatedCall(
			MarginCall VariationMarginRelatedCall) {
		this.VariationMarginRelatedCall = VariationMarginRelatedCall;
	}

	public CollateralTypeCode getDelivery() {
		return Delivery;
	}

	public void setDelivery(CollateralTypeCode Delivery) {
		this.Delivery = Delivery;
	}

	public CollateralTypeCode getReturn() {
		return Return;
	}

	public void setReturn(CollateralTypeCode Return) {
		this.Return = Return;
	}

	public MarginCall getSegregatedIndependentAmountRelatedCall() {
		return SegregatedIndependentAmountRelatedCall;
	}

	public void setSegregatedIndependentAmountRelatedCall(
			MarginCall SegregatedIndependentAmountRelatedCall) {
		this.SegregatedIndependentAmountRelatedCall = SegregatedIndependentAmountRelatedCall;
	}
}