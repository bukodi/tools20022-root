package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentTransaction38;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentTransaction55;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides reference and status information on the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 */
@PreviousVersion(PaymentTransaction38.class)
@NextVersion(PaymentTransaction55.class)
public class PaymentTransaction48
		implements
			GeneratedRepoBean<MMMessageComponent> {
}