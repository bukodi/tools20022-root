package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TransactionVerificationResult1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionVerificationResult3;
import com.tools20022.core.repo.NextVersion;

/**
 * Result of the verifications performed by the issuer to deliver or decline the
 * authorisation.
 */
@PreviousVersion(TransactionVerificationResult1.class)
@NextVersion(TransactionVerificationResult3.class)
public class TransactionVerificationResult2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}