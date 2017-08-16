package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Adjustment;

/**
 * Role played by a party in the context of a paymentof charges.
 */
public class ChargePartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Adjustment Adjustment;

	public Adjustment getAdjustment() {
		return Adjustment;
	}

	public void setAdjustment(Adjustment Adjustment) {
		this.Adjustment = Adjustment;
	}
}