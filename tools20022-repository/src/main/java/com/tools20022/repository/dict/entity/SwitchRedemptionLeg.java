package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.RedemptionOrder;
import com.tools20022.repository.dict.entity.SwitchOrder;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Redemption leg, or switch-out, of a switch transaction.
 */
public class SwitchRedemptionLeg extends RedemptionOrder {

	private SwitchOrder RedemptionRelatedSwitchOrder;
	private PercentageRate PercentageOfTotalSubscriptionAmount;

	public SwitchOrder getRedemptionRelatedSwitchOrder() {
		return RedemptionRelatedSwitchOrder;
	}

	public void setRedemptionRelatedSwitchOrder(
			SwitchOrder RedemptionRelatedSwitchOrder) {
		this.RedemptionRelatedSwitchOrder = RedemptionRelatedSwitchOrder;
	}

	public PercentageRate getPercentageOfTotalSubscriptionAmount() {
		return PercentageOfTotalSubscriptionAmount;
	}

	public void setPercentageOfTotalSubscriptionAmount(
			PercentageRate PercentageOfTotalSubscriptionAmount) {
		this.PercentageOfTotalSubscriptionAmount = PercentageOfTotalSubscriptionAmount;
	}
}