package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentContext1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentContext16;
import com.tools20022.core.repo.NextVersion;

/**
 * Context in which the transaction is performed (payment and sale).
 */
@PreviousVersion(CardPaymentContext1.class)
@NextVersion(CardPaymentContext16.class)
public class CardPaymentContext10
		implements
			GeneratedRepoBean<MMMessageComponent> {
}