package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentContext3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentContext7;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardPaymentContext13;

/**
 * Context in which the transaction is performed (payment and sale).
 */
@PreviousVersion(CardPaymentContext3.class)
@NextVersion(CardPaymentContext7.class)
@NextVersion(CardPaymentContext13.class)
public class CardPaymentContext4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}