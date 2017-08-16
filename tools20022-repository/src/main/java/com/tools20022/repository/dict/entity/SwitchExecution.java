package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.entity.SwitchExecutionRedemptionLeg;
import com.tools20022.repository.dict.entity.SwitchExecutionSubscriptionLeg;

/**
 * Execution of a switch order.
 */
public class SwitchExecution extends InvestmentFundOrderExecution
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SwitchExecutionRedemptionLeg RedemptionLeg;
	private SwitchExecutionSubscriptionLeg SubscriptionLeg;

	public SwitchExecutionRedemptionLeg getRedemptionLeg() {
		return RedemptionLeg;
	}

	public void setRedemptionLeg(SwitchExecutionRedemptionLeg RedemptionLeg) {
		this.RedemptionLeg = RedemptionLeg;
	}

	public SwitchExecutionSubscriptionLeg getSubscriptionLeg() {
		return SubscriptionLeg;
	}

	public void setSubscriptionLeg(
			SwitchExecutionSubscriptionLeg SubscriptionLeg) {
		this.SubscriptionLeg = SubscriptionLeg;
	}
}