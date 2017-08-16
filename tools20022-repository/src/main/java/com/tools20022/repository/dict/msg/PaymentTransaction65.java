package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.PaymentTransaction50;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PaymentTransaction76;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details on the reference and status on the original
 * transactions, included in the original instruction, to which the return
 * message applies.
 */
@PreviousVersion(PaymentTransaction50.class)
@NextVersion(PaymentTransaction76.class)
public class PaymentTransaction65
		implements
			GeneratedRepoBean<MMMessageComponent> {
}