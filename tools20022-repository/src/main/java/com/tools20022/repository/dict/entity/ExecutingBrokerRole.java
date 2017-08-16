package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Broker;
import com.tools20022.repository.dict.entity.ExecutingTrader;

/**
 * Party responsible for executing an order (e.g. an executing or give-up
 * broker).
 */
public class ExecutingBrokerRole extends Broker
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ExecutingTrader ExecutingTrader;

	public ExecutingTrader getExecutingTrader() {
		return ExecutingTrader;
	}

	public void setExecutingTrader(ExecutingTrader ExecutingTrader) {
		this.ExecutingTrader = ExecutingTrader;
	}
}