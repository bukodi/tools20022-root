package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentComplementaryInformation3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentComplementaryInformation5;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further additional details on the underlying payment instruction
 * that cannot be transferred in a regular statement message.
 */
@PreviousVersion(PaymentComplementaryInformation3.class)
@NextVersion(PaymentComplementaryInformation5.class)
public class PaymentComplementaryInformation4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}