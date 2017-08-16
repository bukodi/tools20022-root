package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.AccountLink;

/**
 * Multilateral system among participating institutions, including the operator
 * of the system, used for the purposes of clearing, settling, or recording
 * payments, securities, derivatives or other financial transactions.
 */
public class MarketInfrastructure extends Role
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AccountLink AccountLink;

	public AccountLink getAccountLink() {
		return AccountLink;
	}

	public void setAccountLink(AccountLink AccountLink) {
		this.AccountLink = AccountLink;
	}
}