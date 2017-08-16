package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.CancelledStatus3Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.CancelledStatus11Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a reason or no reason for the corporate action instruction or
 * instruction cancellation cancelled/cancellation completed status.
 */
@PreviousVersion(CancelledStatus3Choice.class)
@NextVersion(CancelledStatus11Choice.class)
public class CancelledStatus7Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}