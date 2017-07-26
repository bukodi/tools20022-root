package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.OriginalPaymentInstruction4;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction13;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides details on the reference and status of the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 */
@PreviousVersion(OriginalPaymentInstruction4.class)
@NextVersion(OriginalPaymentInstruction13.class)
public class OriginalPaymentInstruction8 {
}