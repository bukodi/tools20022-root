package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.PercentageRate;

/**
 * Instruction from an investor to sell investment fund units back to the fund.
 */
public class RedemptionOrder extends InvestmentFundOrder {

	private PercentageRate HoldingsRedemptionRate;

	public PercentageRate getHoldingsRedemptionRate() {
		return HoldingsRedemptionRate;
	}

	public void setHoldingsRedemptionRate(PercentageRate HoldingsRedemptionRate) {
		this.HoldingsRedemptionRate = HoldingsRedemptionRate;
	}
}