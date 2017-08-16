package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 */
public class RedemptionOrder extends InvestmentFundOrder
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PercentageRate HoldingsRedemptionRate;

	public PercentageRate getHoldingsRedemptionRate() {
		return HoldingsRedemptionRate;
	}

	public void setHoldingsRedemptionRate(PercentageRate HoldingsRedemptionRate) {
		this.HoldingsRedemptionRate = HoldingsRedemptionRate;
	}
}