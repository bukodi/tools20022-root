package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.RejectionStatus1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.RejectionStatus13Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.RejectionStatus17Choice;

/**
 * Specifies whether the status is provided with a reason or not.
 */
@PreviousVersion(RejectionStatus1Choice.class)
@NextVersion(RejectionStatus13Choice.class)
@NextVersion(RejectionStatus17Choice.class)
public class RejectionStatus5Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}