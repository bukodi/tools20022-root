package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardTransactionDetail5;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardTransactionDetail2;
import com.tools20022.repository.dict.msg.CardTransactionDetail3;

/**
 * Details of the card transaction.
 */
@NextVersion(CardTransactionDetail5.class)
@NextVersion(CardTransactionDetail2.class)
@NextVersion(CardTransactionDetail3.class)
public class CardTransactionDetail1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}