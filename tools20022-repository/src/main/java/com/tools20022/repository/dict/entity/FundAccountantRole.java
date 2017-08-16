package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.InvestmentFundPartyRole;

/**
 * Party that keeps accounting records of available assets and liabilities of a
 * fund. It calculates dealing prices, the net asset value (NAV) of the fund,
 * and may provide fund performance and tax data. Can be sub-contracted by the
 * fund administrator.
 */
public class FundAccountantRole extends InvestmentFundPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}