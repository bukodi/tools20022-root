package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.RejectedReason5Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.RejectedReason13Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a standard code or proprietary code to specify the reason why
 * the instruction or cancellation request has a rejected status.
 */
@PreviousVersion(RejectedReason5Choice.class)
@NextVersion(RejectedReason13Choice.class)
public class RejectedReason9Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}