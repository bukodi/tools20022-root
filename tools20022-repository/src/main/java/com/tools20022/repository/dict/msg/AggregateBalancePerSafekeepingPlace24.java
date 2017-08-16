package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AggregateBalancePerSafekeepingPlace20;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AggregateBalancePerSafekeepingPlace28;
import com.tools20022.core.repo.NextVersion;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account at a specified place of
 * safekeeping.
 */
@PreviousVersion(AggregateBalancePerSafekeepingPlace20.class)
@NextVersion(AggregateBalancePerSafekeepingPlace28.class)
public class AggregateBalancePerSafekeepingPlace24
		implements
			GeneratedRepoBean<MMMessageComponent> {
}