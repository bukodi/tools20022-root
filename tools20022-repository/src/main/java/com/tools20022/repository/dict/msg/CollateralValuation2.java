package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CollateralValuation1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CollateralValuation5;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 */
@PreviousVersion(CollateralValuation1.class)
@NextVersion(CollateralValuation5.class)
public class CollateralValuation2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}