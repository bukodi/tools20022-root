package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.PaymentPeriod2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentPeriod4;
import com.tools20022.core.repo.NextVersion;

/**
 * Specifies the payment terms by means of a code and a period.
 */
@PreviousVersion(PaymentPeriod2.class)
@NextVersion(PaymentPeriod4.class)
public class PaymentPeriod3 {
}