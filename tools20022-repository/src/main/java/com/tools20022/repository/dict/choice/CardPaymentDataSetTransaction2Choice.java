package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.CardPaymentDataSetTransaction1Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.CardPaymentDataSetTransaction3Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Card payment transaction choice between cancellation, authorisation request
 * and authorisation response.
 */
@PreviousVersion(CardPaymentDataSetTransaction1Choice.class)
@NextVersion(CardPaymentDataSetTransaction3Choice.class)
public class CardPaymentDataSetTransaction2Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}