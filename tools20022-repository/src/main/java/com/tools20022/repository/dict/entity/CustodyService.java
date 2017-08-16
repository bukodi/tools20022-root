package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.FinancialService;

/**
 * A service in which a financial institution holds securities on behalf of the
 * client. Custody provides an investor a place to store assets. Assets in
 * custody are not fungible for the brokerage because they remain on the
 * client's name.
 */
public class CustodyService extends FinancialService
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}