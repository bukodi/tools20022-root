package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PendingStatus32Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PendingStatus42Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a reason or no reason for the corporate action instruction
 * processing pending status.
 */
@PreviousVersion(PendingStatus32Choice.class)
@NextVersion(PendingStatus42Choice.class)
public class PendingStatus34Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}