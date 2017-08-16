package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CollateralAccount1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CollateralAccount3;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides additional information on the collateral account of the party
 * delivering/receiving the collateral.
 */
@PreviousVersion(CollateralAccount1.class)
@NextVersion(CollateralAccount3.class)
public class CollateralAccount2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}