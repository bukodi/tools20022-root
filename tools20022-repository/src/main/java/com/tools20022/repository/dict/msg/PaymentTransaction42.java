package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentTransaction35;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentTransaction56;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the reversal
 * message applies.
 */
@PreviousVersion(PaymentTransaction35.class)
@NextVersion(PaymentTransaction56.class)
public class PaymentTransaction42
		implements
			GeneratedRepoBean<MMMessageComponent> {
}