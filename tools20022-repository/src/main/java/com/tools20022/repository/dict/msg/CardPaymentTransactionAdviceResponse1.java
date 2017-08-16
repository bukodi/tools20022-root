package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentTransactionAdviceResponse3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardPaymentTransactionAdviceResponse5;

/**
 * Card payment completion advice response from the acquirer.
 */
@NextVersion(CardPaymentTransactionAdviceResponse3.class)
@NextVersion(CardPaymentTransactionAdviceResponse5.class)
public class CardPaymentTransactionAdviceResponse1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}