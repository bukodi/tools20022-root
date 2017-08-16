package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TransactionTotals2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionTotals4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTotals7;

/**
 * Transaction totals during the reconciliation period, for a certain type of
 * transaction.
 */
@PreviousVersion(TransactionTotals2.class)
@NextVersion(TransactionTotals4.class)
@NextVersion(TransactionTotals7.class)
public class TransactionTotals3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}