package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.TransactionTotals3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionTotals5;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTotals6;

/**
 * Totals of the reconciliation.
 */
@PreviousVersion(TransactionTotals3.class)
@NextVersion(TransactionTotals5.class)
@NextVersion(TransactionTotals6.class)
public class TransactionTotals4 {
}