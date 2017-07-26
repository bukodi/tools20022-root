package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SubscriptionExecution;
import com.tools20022.repository.dict.entity.SwitchExecution;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Execution of the subscription part, in a switch between investment funds or
 * investment fund classes.
 */
public class SwitchExecutionSubscriptionLeg extends SubscriptionExecution {

	private SwitchExecution RelatedSwitchExecution;
	private PercentageRate PercentageOfTotalRedemptionAmount;

	public SwitchExecution getRelatedSwitchExecution() {
		return RelatedSwitchExecution;
	}

	public void setRelatedSwitchExecution(SwitchExecution RelatedSwitchExecution) {
		this.RelatedSwitchExecution = RelatedSwitchExecution;
	}

	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return PercentageOfTotalRedemptionAmount;
	}

	public void setPercentageOfTotalRedemptionAmount(
			PercentageRate PercentageOfTotalRedemptionAmount) {
		this.PercentageOfTotalRedemptionAmount = PercentageOfTotalRedemptionAmount;
	}
}