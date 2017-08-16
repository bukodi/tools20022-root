package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Order placed by an investor to buy or sell an asset at a price specified or
 * not.
 */
public class Order extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Trade Trade;
	private Max35Text MasterIdentification;

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}

	public Max35Text getMasterIdentification() {
		return MasterIdentification;
	}

	public void setMasterIdentification(Max35Text MasterIdentification) {
		this.MasterIdentification = MasterIdentification;
	}
}