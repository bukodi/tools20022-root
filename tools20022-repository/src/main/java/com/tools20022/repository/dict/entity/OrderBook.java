package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.datatype.Max16Text;

/**
 * Record of orders to buy and sell a financial instrument.
 */
public class OrderBook extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesOrder Order;
	private Max16Text PriceTimePriority;

	public SecuritiesOrder getOrder() {
		return Order;
	}

	public void setOrder(SecuritiesOrder Order) {
		this.Order = Order;
	}

	public Max16Text getPriceTimePriority() {
		return PriceTimePriority;
	}

	public void setPriceTimePriority(Max16Text PriceTimePriority) {
		this.PriceTimePriority = PriceTimePriority;
	}
}