package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.Account;

/**
 * Role played by a party in the context of a corporate action.
 */
public class CorporateActionPartyRole extends Role {

	private CorporateActionEvent CorporateActionEvent;
	private Account Account;

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}
}