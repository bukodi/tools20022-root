package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.dict.entity.Commission;

/**
 * Party that identifies a broker when required (for example, authorised broker,
 * prime broker, etc).
 */
public class Broker extends TradePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ActiveCurrencyAndAmount RemunerationAmount;
	private Commission Commission;

	public ActiveCurrencyAndAmount getRemunerationAmount() {
		return RemunerationAmount;
	}

	public void setRemunerationAmount(ActiveCurrencyAndAmount RemunerationAmount) {
		this.RemunerationAmount = RemunerationAmount;
	}

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}
}