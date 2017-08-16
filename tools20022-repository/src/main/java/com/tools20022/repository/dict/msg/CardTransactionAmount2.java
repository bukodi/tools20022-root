package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardTransactionAmount1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardTransactionAmount4;
import com.tools20022.core.repo.NextVersion;

/**
 * Amounts of the transaction expressed within the terminal currency.
 */
@PreviousVersion(CardTransactionAmount1.class)
@NextVersion(CardTransactionAmount4.class)
public class CardTransactionAmount2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}