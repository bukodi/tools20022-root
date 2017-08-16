package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentInstruction3;
import com.tools20022.core.repo.PreviousVersion;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 */
@PreviousVersion(PaymentInstruction3.class)
public class PaymentInstruction13
		implements
			GeneratedRepoBean<MMMessageComponent> {
}