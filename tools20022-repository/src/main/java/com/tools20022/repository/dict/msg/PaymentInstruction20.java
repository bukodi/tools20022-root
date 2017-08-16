package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentInstruction16;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentInstruction22;
import com.tools20022.core.repo.NextVersion;

/**
 * Characteristics that apply to the debit side of the payment transactions
 * included in the credit transfer initiation.
 */
@PreviousVersion(PaymentInstruction16.class)
@NextVersion(PaymentInstruction22.class)
public class PaymentInstruction20
		implements
			GeneratedRepoBean<MMMessageComponent> {
}