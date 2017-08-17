package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.OfferTypeFormat1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.OfferTypeFormat5Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Choice between a standard code or proprietary code to specify the type of
 * offer.
 */
@PreviousVersion(OfferTypeFormat1Choice.class)
@NextVersion(OfferTypeFormat5Choice.class)
public class OfferTypeFormat3Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}