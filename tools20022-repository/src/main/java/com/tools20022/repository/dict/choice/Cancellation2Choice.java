package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.Cancellation1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.Cancellation5Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between cancellation by reference or by transfer details.
 */
@PreviousVersion(Cancellation1Choice.class)
@NextVersion(Cancellation5Choice.class)
public class Cancellation2Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}