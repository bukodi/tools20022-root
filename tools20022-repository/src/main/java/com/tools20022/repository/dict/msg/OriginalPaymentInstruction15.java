package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction13;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction20;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides details on the reference and status of the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 */
@PreviousVersion(OriginalPaymentInstruction13.class)
@NextVersion(OriginalPaymentInstruction20.class)
public class OriginalPaymentInstruction15
		implements
			GeneratedRepoBean<MMMessageComponent> {
}