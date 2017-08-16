package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.UnmatchedStatus1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.UnmatchedStatus12Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.UnmatchedStatus17Choice;

/**
 * Specifies whether the status is provided with a reason or not.
 */
@PreviousVersion(UnmatchedStatus1Choice.class)
@NextVersion(UnmatchedStatus12Choice.class)
@NextVersion(UnmatchedStatus17Choice.class)
public class UnmatchedStatus5Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}