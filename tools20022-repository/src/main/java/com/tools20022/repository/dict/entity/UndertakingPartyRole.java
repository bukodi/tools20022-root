package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Undertaking;

/**
 * Role played by a party in the context of an undertaking.
 */
public class UndertakingPartyRole extends Role {

	private Undertaking Undertaking;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}
}