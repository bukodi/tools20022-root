package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardTransactionEnvironment2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardTransactionEnvironment3;

/**
 * Environment of the transaction.
 */
@NextVersion(CardTransactionEnvironment2.class)
@NextVersion(CardTransactionEnvironment3.class)
public class CardTransactionEnvironment1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}