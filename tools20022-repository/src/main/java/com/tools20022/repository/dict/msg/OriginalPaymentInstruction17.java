package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction10;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction22;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides the details on the reference and status of the original
 * transactions, included in the original instruction, to which the cancellation
 * request message applies.
 */
@PreviousVersion(OriginalPaymentInstruction10.class)
@NextVersion(OriginalPaymentInstruction22.class)
public class OriginalPaymentInstruction17
		implements
			GeneratedRepoBean<MMMessageComponent> {
}