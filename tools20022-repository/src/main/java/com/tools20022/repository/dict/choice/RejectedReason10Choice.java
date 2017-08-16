package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.RejectedReason1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.RejectedReason14Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a standard code or proprietary code to specify the reason why
 * the instruction or cancellation request has a rejected status.
 */
@PreviousVersion(RejectedReason1Choice.class)
@NextVersion(RejectedReason14Choice.class)
public class RejectedReason10Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}