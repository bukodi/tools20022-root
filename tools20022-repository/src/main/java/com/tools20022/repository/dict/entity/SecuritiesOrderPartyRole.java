package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.SecuritiesOrder;

/**
 * Role played by a party associated with an order to buy or sell securities.
 */
public class SecuritiesOrderPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesOrder SecuritiesOrder;

	public SecuritiesOrder getSecuritiesOrder() {
		return SecuritiesOrder;
	}

	public void setSecuritiesOrder(SecuritiesOrder SecuritiesOrder) {
		this.SecuritiesOrder = SecuritiesOrder;
	}
}