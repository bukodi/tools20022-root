package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesTradePartyRole;
import com.tools20022.repository.dict.entity.ExecutingBrokerRole;

/**
 * Trader that executes a trade for an organisation.
 */
public class ExecutingTrader extends SecuritiesTradePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ExecutingBrokerRole ExecutingBroker;

	public ExecutingBrokerRole getExecutingBroker() {
		return ExecutingBroker;
	}

	public void setExecutingBroker(ExecutingBrokerRole ExecutingBroker) {
		this.ExecutingBroker = ExecutingBroker;
	}
}