package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentInstruction13;
import com.tools20022.core.repo.NextVersion;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 */
@NextVersion(PaymentInstruction13.class)
public class PaymentInstruction3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}