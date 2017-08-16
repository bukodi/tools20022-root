package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Execution of a subscription order.
 */
public class SubscriptionExecution extends InvestmentFundOrderExecution
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount EquityComponent;
	private CurrencyAndAmount CashComponent;
	private CurrencyAndAmount InvestedNetAmount;
	private CurrencyAndAmount Refund;
	private CurrencyAndAmount SubscriptionInterest;

	public CurrencyAndAmount getEquityComponent() {
		return EquityComponent;
	}

	public void setEquityComponent(CurrencyAndAmount EquityComponent) {
		this.EquityComponent = EquityComponent;
	}

	public CurrencyAndAmount getCashComponent() {
		return CashComponent;
	}

	public void setCashComponent(CurrencyAndAmount CashComponent) {
		this.CashComponent = CashComponent;
	}

	public CurrencyAndAmount getInvestedNetAmount() {
		return InvestedNetAmount;
	}

	public void setInvestedNetAmount(CurrencyAndAmount InvestedNetAmount) {
		this.InvestedNetAmount = InvestedNetAmount;
	}

	public CurrencyAndAmount getRefund() {
		return Refund;
	}

	public void setRefund(CurrencyAndAmount Refund) {
		this.Refund = Refund;
	}

	public CurrencyAndAmount getSubscriptionInterest() {
		return SubscriptionInterest;
	}

	public void setSubscriptionInterest(CurrencyAndAmount SubscriptionInterest) {
		this.SubscriptionInterest = SubscriptionInterest;
	}
}