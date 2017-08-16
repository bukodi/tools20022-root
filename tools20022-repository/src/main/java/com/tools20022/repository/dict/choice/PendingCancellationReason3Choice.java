package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PendingCancellationReason1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PendingCancellationReason5Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a standard code or a proprietary code to specify the reason
 * why a cancellation request sent for the related instruction is pending.
 */
@PreviousVersion(PendingCancellationReason1Choice.class)
@NextVersion(PendingCancellationReason5Choice.class)
public class PendingCancellationReason3Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}