package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.UndertakingPartyRole;
import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Party that takes responsibility for indemnifying the issuer.
 */
public class UndertakingUltimateObligor extends UndertakingPartyRole {

	private CashAccount CashAccount;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}
}