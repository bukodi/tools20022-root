package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Commission;

/**
 * Role played by a party in the context of a payment of commission.
 */
public class CommissionPartyRole extends Role {

	private Commission Commission;

	public Commission getCommission() {
		return Commission;
	}

	public void setCommission(Commission Commission) {
		this.Commission = Commission;
	}
}