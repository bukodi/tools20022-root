package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.CollateralMovement2Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.CollateralMovement4Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides the collateral movement direction that is a delivery and optionaly a
 * return, or a return only.
 */
@PreviousVersion(CollateralMovement2Choice.class)
@NextVersion(CollateralMovement4Choice.class)
public class CollateralMovement3Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}