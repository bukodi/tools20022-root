package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesSettlementPartyRole;

/**
 * Party which holds securities and settles trades for non-resident customers.
 * The customers' securities are held in one omnibus account or in sub accounts
 * at the local central securities depository.
 */
public class LocalSettlementAgentRole extends SecuritiesSettlementPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}