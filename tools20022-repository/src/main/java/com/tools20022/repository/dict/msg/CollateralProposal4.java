package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CollateralProposal3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CollateralProposal5;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides details about the proposal for the variation margin and optionaly
 * the segregated independent amount.
 */
@PreviousVersion(CollateralProposal3.class)
@NextVersion(CollateralProposal5.class)
public class CollateralProposal4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}