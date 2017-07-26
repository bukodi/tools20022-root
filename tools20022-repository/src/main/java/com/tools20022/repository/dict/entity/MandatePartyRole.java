package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Mandate;

/**
 * Role played by a party in the context of a mandate.
 */
public class MandatePartyRole extends Role {

	private Mandate Mandate;

	public Mandate getMandate() {
		return Mandate;
	}

	public void setMandate(Mandate Mandate) {
		this.Mandate = Mandate;
	}
}