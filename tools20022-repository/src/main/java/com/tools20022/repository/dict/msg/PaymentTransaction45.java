package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.PaymentTransaction36;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentTransaction51;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the reversal
 * message applies.
 */
@PreviousVersion(PaymentTransaction36.class)
@NextVersion(PaymentTransaction51.class)
public class PaymentTransaction45 {
}