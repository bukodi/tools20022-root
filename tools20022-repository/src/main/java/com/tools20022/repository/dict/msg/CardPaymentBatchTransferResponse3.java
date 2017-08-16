package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransferResponse4;
import com.tools20022.core.repo.NextVersion;

/**
 * Status of the transactions sent in a previous batch of card payment
 * transactions.
 */
@PreviousVersion(CardPaymentBatchTransferResponse2.class)
@NextVersion(CardPaymentBatchTransferResponse4.class)
public class CardPaymentBatchTransferResponse3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}