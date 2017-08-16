package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.SubBalanceInformation5;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SubBalanceInformation11;
import com.tools20022.core.repo.NextVersion;

/**
 * Net position of a segregated holding of a single security within the overall
 * position held in the securities account, eg, sub-balance per status.
 */
@PreviousVersion(SubBalanceInformation5.class)
@NextVersion(SubBalanceInformation11.class)
public class SubBalanceInformation9
		implements
			GeneratedRepoBean<MMMessageComponent> {
}