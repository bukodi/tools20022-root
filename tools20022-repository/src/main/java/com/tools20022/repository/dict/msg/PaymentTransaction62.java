package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentTransaction55;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentTransaction75;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides reference and status information on the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 */
@PreviousVersion(PaymentTransaction55.class)
@NextVersion(PaymentTransaction75.class)
public class PaymentTransaction62
		implements
			GeneratedRepoBean<MMMessageComponent> {
}