package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Collateral;

/**
 * Role played by a party in the context of collateral.
 */
public class CollateralPartyRole extends Role {

	private Collateral Collateral;

	public Collateral getCollateral() {
		return Collateral;
	}

	public void setCollateral(Collateral Collateral) {
		this.Collateral = Collateral;
	}
}