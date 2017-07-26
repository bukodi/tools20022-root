package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.PaymentInstruction11;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentInstruction19;
import com.tools20022.core.repo.NextVersion;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 */
@PreviousVersion(PaymentInstruction11.class)
@NextVersion(PaymentInstruction19.class)
public class PaymentInstruction17 {
}