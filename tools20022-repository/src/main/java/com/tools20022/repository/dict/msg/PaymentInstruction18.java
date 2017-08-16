package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentInstruction15;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentInstruction21;
import com.tools20022.core.repo.NextVersion;

/**
 * Characteristics that apply to the credit side of the payment transactions
 * included in the direct debit initiation.
 */
@PreviousVersion(PaymentInstruction15.class)
@NextVersion(PaymentInstruction21.class)
public class PaymentInstruction18
		implements
			GeneratedRepoBean<MMMessageComponent> {
}