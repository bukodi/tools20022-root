package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentComplementaryInformation4;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentComplementaryInformation6;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further additional details on the underlying payment instruction
 * that cannot be transferred in a regular statement message.
 */
@PreviousVersion(PaymentComplementaryInformation4.class)
@NextVersion(PaymentComplementaryInformation6.class)
public class PaymentComplementaryInformation5
		implements
			GeneratedRepoBean<MMMessageComponent> {
}