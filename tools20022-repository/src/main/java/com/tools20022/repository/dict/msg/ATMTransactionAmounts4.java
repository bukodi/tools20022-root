package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMTransactionAmounts2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMTransactionAmounts5;
import com.tools20022.core.repo.NextVersion;

/**
 * Withdrawal limits for the account.
 */
@PreviousVersion(ATMTransactionAmounts2.class)
@NextVersion(ATMTransactionAmounts5.class)
public class ATMTransactionAmounts4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}