package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionEntitlement;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.codeset.RenounceableStatusCode;

/**
 * Rights for securities entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 */
public class CorporateActionSecuritiesEntitlement
		extends
			CorporateActionEntitlement {

	private SecuritiesQuantity EntitledSecuritiesQuantity;
	private RenounceableStatusCode RenounceableEntitlementStatusType;

	public SecuritiesQuantity getEntitledSecuritiesQuantity() {
		return EntitledSecuritiesQuantity;
	}

	public void setEntitledSecuritiesQuantity(
			SecuritiesQuantity EntitledSecuritiesQuantity) {
		this.EntitledSecuritiesQuantity = EntitledSecuritiesQuantity;
	}

	public RenounceableStatusCode getRenounceableEntitlementStatusType() {
		return RenounceableEntitlementStatusType;
	}

	public void setRenounceableEntitlementStatusType(
			RenounceableStatusCode RenounceableEntitlementStatusType) {
		this.RenounceableEntitlementStatusType = RenounceableEntitlementStatusType;
	}
}