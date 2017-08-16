package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.CardPaymentTransaction12;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardPaymentTransaction23;

/**
 * Transaction information in the authorisation response.
 */
@NextVersion(CardPaymentTransaction12.class)
@NextVersion(CardPaymentTransaction23.class)
public class CardPaymentTransaction2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}