package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PriceFormat20Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PriceFormat47Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a percentage price or an amount price or an unspecified price
 * or an amount price per amount or an amount price per financial instrument
 * quantity.
 */
@PreviousVersion(PriceFormat20Choice.class)
@NextVersion(PriceFormat47Choice.class)
public class PriceFormat32Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}