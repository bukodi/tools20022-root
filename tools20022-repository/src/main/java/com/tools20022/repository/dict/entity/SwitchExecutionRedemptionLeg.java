package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.RedemptionExecution;
import com.tools20022.repository.dict.entity.SwitchExecution;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Execution of the redemption part, in a switch between investment funds or
 * investment fund classes.
 */
public class SwitchExecutionRedemptionLeg extends RedemptionExecution {

	private SwitchExecution RelatedSwitchExecution;
	private PercentageRate PercentageOfTotalSubscriptionAmount;

	public SwitchExecution getRelatedSwitchExecution() {
		return RelatedSwitchExecution;
	}

	public void setRelatedSwitchExecution(SwitchExecution RelatedSwitchExecution) {
		this.RelatedSwitchExecution = RelatedSwitchExecution;
	}

	public PercentageRate getPercentageOfTotalSubscriptionAmount() {
		return PercentageOfTotalSubscriptionAmount;
	}

	public void setPercentageOfTotalSubscriptionAmount(
			PercentageRate PercentageOfTotalSubscriptionAmount) {
		this.PercentageOfTotalSubscriptionAmount = PercentageOfTotalSubscriptionAmount;
	}
}