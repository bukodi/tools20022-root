package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.OriginalPaymentInstruction3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OriginalPaymentInstruction17;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides the details on the reference and status of the original
 * transactions, included in the original instruction, to which the cancellation
 * request message applies.
 */
@PreviousVersion(OriginalPaymentInstruction3.class)
@NextVersion(OriginalPaymentInstruction17.class)
public class OriginalPaymentInstruction10 {
}