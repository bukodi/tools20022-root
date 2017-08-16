package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundOrder;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SwitchRedemptionLeg;
import com.tools20022.repository.dict.entity.SwitchSubscriptionLeg;

/**
 * Transfer from one investment fund/fund class to another investment fund or
 * investment fund class by the investor. A switch is composed of one or several
 * subscription legs, and one or several redemption legs.
 */
public class SwitchOrder extends InvestmentFundOrder
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount AdditionalCashIn;
	private CurrencyAndAmount ResultingCashOut;
	private CurrencyAndAmount TotalRedemptionAmount;
	private CurrencyAndAmount TotalSubscriptionAmount;
	private SwitchRedemptionLeg RedemptionLeg;
	private SwitchSubscriptionLeg SubscriptionLeg;

	public CurrencyAndAmount getAdditionalCashIn() {
		return AdditionalCashIn;
	}

	public void setAdditionalCashIn(CurrencyAndAmount AdditionalCashIn) {
		this.AdditionalCashIn = AdditionalCashIn;
	}

	public CurrencyAndAmount getResultingCashOut() {
		return ResultingCashOut;
	}

	public void setResultingCashOut(CurrencyAndAmount ResultingCashOut) {
		this.ResultingCashOut = ResultingCashOut;
	}

	public CurrencyAndAmount getTotalRedemptionAmount() {
		return TotalRedemptionAmount;
	}

	public void setTotalRedemptionAmount(CurrencyAndAmount TotalRedemptionAmount) {
		this.TotalRedemptionAmount = TotalRedemptionAmount;
	}

	public CurrencyAndAmount getTotalSubscriptionAmount() {
		return TotalSubscriptionAmount;
	}

	public void setTotalSubscriptionAmount(
			CurrencyAndAmount TotalSubscriptionAmount) {
		this.TotalSubscriptionAmount = TotalSubscriptionAmount;
	}

	public SwitchRedemptionLeg getRedemptionLeg() {
		return RedemptionLeg;
	}

	public void setRedemptionLeg(SwitchRedemptionLeg RedemptionLeg) {
		this.RedemptionLeg = RedemptionLeg;
	}

	public SwitchSubscriptionLeg getSubscriptionLeg() {
		return SubscriptionLeg;
	}

	public void setSubscriptionLeg(SwitchSubscriptionLeg SubscriptionLeg) {
		this.SubscriptionLeg = SubscriptionLeg;
	}
}