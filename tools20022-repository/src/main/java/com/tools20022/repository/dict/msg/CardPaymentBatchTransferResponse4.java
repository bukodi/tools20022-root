package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse5;
import com.tools20022.core.repo.NextVersion;

/**
 * Status of the transactions sent in a previous batch of card payment
 * transactions.
 */
@PreviousVersion(CardPaymentBatchTransferResponse3.class)
@NextVersion(CardPaymentBatchTransferResponse5.class)
public class CardPaymentBatchTransferResponse4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}