package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PendingStatus3Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PendingStatus40Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Specifies whether the status is provided with a reason or not.
 */
@PreviousVersion(PendingStatus3Choice.class)
@NextVersion(PendingStatus40Choice.class)
public class PendingStatus15Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}