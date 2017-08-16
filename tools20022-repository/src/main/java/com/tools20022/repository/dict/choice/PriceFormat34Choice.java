package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PriceFormat7Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PriceFormat48Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a percentage price or an amount price or an amount price per
 * amount or an amount price per financial instrument quantity.
 */
@PreviousVersion(PriceFormat7Choice.class)
@NextVersion(PriceFormat48Choice.class)
public class PriceFormat34Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}