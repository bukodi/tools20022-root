package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.TradePartyRole;
import com.tools20022.repository.dict.codeset.OriginatorRoleCode;

/**
 * Specifies the trading party at the source of the transaction.
 */
public class TradeOriginatorRole extends TradePartyRole {

	private OriginatorRoleCode OriginatorRole;

	public OriginatorRoleCode getOriginatorRole() {
		return OriginatorRole;
	}

	public void setOriginatorRole(OriginatorRoleCode OriginatorRole) {
		this.OriginatorRole = OriginatorRole;
	}
}