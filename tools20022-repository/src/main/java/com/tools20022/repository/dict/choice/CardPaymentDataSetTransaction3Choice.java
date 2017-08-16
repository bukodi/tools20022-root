package com.tools20022.repository.dict.choice;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.repository.dict.choice.CardPaymentDataSetTransaction2Choice;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.choice.CardPaymentDataSetTransaction4Choice;
import com.tools20022.core.repo.NextVersion;

/**
 * Card payment transaction choice between cancellation, authorisation request
 * and authorisation response.
 */
@PreviousVersion(CardPaymentDataSetTransaction2Choice.class)
@NextVersion(CardPaymentDataSetTransaction4Choice.class)
public class CardPaymentDataSetTransaction3Choice
		implements
			GeneratedRepoBean<MMChoiceComponent> {
}