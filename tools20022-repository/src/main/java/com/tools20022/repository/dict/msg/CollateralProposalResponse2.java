package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CollateralProposalResponse1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CollateralProposalResponse3;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides the collateral proposal response for the variation margin and
 * optionaly the segregated independent amount.
 */
@PreviousVersion(CollateralProposalResponse1.class)
@NextVersion(CollateralProposalResponse3.class)
public class CollateralProposalResponse2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}