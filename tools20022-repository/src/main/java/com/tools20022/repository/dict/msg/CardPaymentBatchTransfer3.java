package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentBatchTransfer4;
import com.tools20022.core.repo.NextVersion;

/**
 * Card payment transactions from one or several data set of transactions.
 */
@PreviousVersion(CardPaymentBatchTransfer2.class)
@NextVersion(CardPaymentBatchTransfer4.class)
public class CardPaymentBatchTransfer3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}