package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction8;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction15;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides details on the reference and status of the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 */
@PreviousVersion(OriginalPaymentInstruction8.class)
@NextVersion(OriginalPaymentInstruction15.class)
public class OriginalPaymentInstruction13
		implements
			GeneratedRepoBean<MMMessageComponent> {
}