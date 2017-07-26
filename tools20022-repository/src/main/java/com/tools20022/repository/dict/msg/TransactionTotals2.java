package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.TransactionTotals1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionTotals3;
import com.tools20022.core.repo.NextVersion;

/**
 * Transaction totals during the reconciliation period, for a certain type of
 * transaction.
 */
@PreviousVersion(TransactionTotals1.class)
@NextVersion(TransactionTotals3.class)
public class TransactionTotals2 {
}