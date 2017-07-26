package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Guarantee;

/**
 * Role played by a party in the context of guarantees.
 */
public class GuaranteePartyRole extends Role {

	private Guarantee Guarantee;

	public Guarantee getGuarantee() {
		return Guarantee;
	}

	public void setGuarantee(Guarantee Guarantee) {
		this.Guarantee = Guarantee;
	}
}