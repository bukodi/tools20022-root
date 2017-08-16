package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Account;

/**
 * Role played by a party in the context of account operations.
 */
public class AccountPartyRole extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Account Account;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}
}