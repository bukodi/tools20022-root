package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardTransactionAmount2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardTransactionAmount5;
import com.tools20022.repository.dict.msg.CardTransactionAmount3;

/**
 * Amounts of the transaction expressed within the terminal currency.
 */
@NextVersion(CardTransactionAmount2.class)
@NextVersion(CardTransactionAmount5.class)
@NextVersion(CardTransactionAmount3.class)
public class CardTransactionAmount1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}