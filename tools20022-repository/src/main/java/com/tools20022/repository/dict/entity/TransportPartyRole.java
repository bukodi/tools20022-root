package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Transport;

/**
 * Role played by a party in the context of transporting goods.
 */
public class TransportPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Transport Transport;

	public Transport getTransport() {
		return Transport;
	}

	public void setTransport(Transport Transport) {
		this.Transport = Transport;
	}
}