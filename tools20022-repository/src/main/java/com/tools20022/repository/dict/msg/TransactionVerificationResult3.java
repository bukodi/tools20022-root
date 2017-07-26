package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.TransactionVerificationResult2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionVerificationResult4;
import com.tools20022.core.repo.NextVersion;

/**
 * Result of performed verifications for the transaction.
 */
@PreviousVersion(TransactionVerificationResult2.class)
@NextVersion(TransactionVerificationResult4.class)
public class TransactionVerificationResult3 {
}