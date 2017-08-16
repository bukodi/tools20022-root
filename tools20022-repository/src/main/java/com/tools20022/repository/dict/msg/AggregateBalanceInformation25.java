package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation21;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AggregateBalanceInformation30;
import com.tools20022.core.repo.NextVersion;

/**
 * Overall position, in a single security, held in a securities account at a
 * specified place of safekeeping.
 */
@PreviousVersion(AggregateBalanceInformation21.class)
@NextVersion(AggregateBalanceInformation30.class)
public class AggregateBalanceInformation25
		implements
			GeneratedRepoBean<MMMessageComponent> {
}