package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.CardPaymentDataSetTransaction1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CardPaymentDataSetTransaction4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CardPaymentDataSetTransaction7;

/**
 * Cancelled card payment transaction to be captured in a batch.
 */
@PreviousVersion(CardPaymentDataSetTransaction1.class)
@NextVersion(CardPaymentDataSetTransaction4.class)
@NextVersion(CardPaymentDataSetTransaction7.class)
public class CardPaymentDataSetTransaction3 {
}