package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SubscriptionOrder;
import com.tools20022.repository.dict.entity.SwitchOrder;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Subscription leg, or switch-in, of a switch order.
 */
public class SwitchSubscriptionLeg extends SubscriptionOrder {

	private SwitchOrder SubscriptionRelatedSwitchOrder;
	private PercentageRate PercentageOfTotalRedemptionAmount;

	public SwitchOrder getSubscriptionRelatedSwitchOrder() {
		return SubscriptionRelatedSwitchOrder;
	}

	public void setSubscriptionRelatedSwitchOrder(
			SwitchOrder SubscriptionRelatedSwitchOrder) {
		this.SubscriptionRelatedSwitchOrder = SubscriptionRelatedSwitchOrder;
	}

	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return PercentageOfTotalRedemptionAmount;
	}

	public void setPercentageOfTotalRedemptionAmount(
			PercentageRate PercentageOfTotalRedemptionAmount) {
		this.PercentageOfTotalRedemptionAmount = PercentageOfTotalRedemptionAmount;
	}
}