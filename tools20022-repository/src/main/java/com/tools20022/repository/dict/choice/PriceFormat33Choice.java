package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.PriceFormat21Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.PriceFormat49Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a percentage price or an amount price or an unspecified price
 * or an amount price per amount or an amount price per financial instrument
 * quantity.
 */
@PreviousVersion(PriceFormat21Choice.class)
@NextVersion(PriceFormat49Choice.class)
public class PriceFormat33Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}