package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.DisabledStatusReason2Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PendingOpeningStatusReason2Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.AcceptedStatusReason1Choice;

/**
 * Choice of formats for pending reason code.
 */
@PreviousVersion(DisabledStatusReason2Choice.class)
@NextVersion(PendingOpeningStatusReason2Choice.class)
@NextVersion(AcceptedStatusReason1Choice.class)
public class PendingStatusReason2Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}