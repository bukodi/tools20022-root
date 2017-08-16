package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.AcceptedReason3Choice;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.choice.AcceptedReason4Choice;

/**
 * Choice between a standard code or proprietary code to specify the reason why
 * the instruction or cancellation request has a accepted status.
 */
@NextVersion(AcceptedReason3Choice.class)
@NextVersion(AcceptedReason4Choice.class)
public class AcceptedReason1Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}