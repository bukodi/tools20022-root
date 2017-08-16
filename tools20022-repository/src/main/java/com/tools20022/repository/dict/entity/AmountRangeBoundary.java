package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.AmountRange;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.YesNoIndicator;

/**
 * Limit for an amount range.
 */
public class AmountRangeBoundary extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AmountRange FromAmountRange;
	private ImpliedCurrencyAndAmount BoundaryAmount;
	private YesNoIndicator Included;
	private AmountRange ToAmountRange;

	public AmountRange getFromAmountRange() {
		return FromAmountRange;
	}

	public void setFromAmountRange(AmountRange FromAmountRange) {
		this.FromAmountRange = FromAmountRange;
	}

	public ImpliedCurrencyAndAmount getBoundaryAmount() {
		return BoundaryAmount;
	}

	public void setBoundaryAmount(ImpliedCurrencyAndAmount BoundaryAmount) {
		this.BoundaryAmount = BoundaryAmount;
	}

	public YesNoIndicator getIncluded() {
		return Included;
	}

	public void setIncluded(YesNoIndicator Included) {
		this.Included = Included;
	}

	public AmountRange getToAmountRange() {
		return ToAmountRange;
	}

	public void setToAmountRange(AmountRange ToAmountRange) {
		this.ToAmountRange = ToAmountRange;
	}
}