package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentDataSetTransaction2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardPaymentDataSetTransaction3;

/**
 * Transaction to capture in the batch.
 */
@NextVersion(CardPaymentDataSetTransaction2.class)
@NextVersion(CardPaymentDataSetTransaction3.class)
public class CardPaymentDataSetTransaction1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}