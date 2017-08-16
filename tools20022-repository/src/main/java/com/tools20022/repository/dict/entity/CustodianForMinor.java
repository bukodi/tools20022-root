package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentAccountPartyRole;

/**
 * Entity that holds shares/units on behalf of a legal minor. Although the
 * account is registered under the name of the minor, the custodian retains
 * control of the account.
 */
public class CustodianForMinor extends InvestmentAccountPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}