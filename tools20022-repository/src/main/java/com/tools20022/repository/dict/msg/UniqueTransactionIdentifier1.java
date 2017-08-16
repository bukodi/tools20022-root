package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.UniqueTransactionIdentifier2;
import com.tools20022.core.repo.NextVersion;

/**
 * Specifies the unique transaction identifier (UTI) that was created at the
 * time a transaction was first executed, shared with all registered entities
 * and counterparties involved in the transaction, and used to track that
 * particular transaction during its lifetime and optionally, the prior unique
 * transaction identifier (PUTI). These identifiers can also be known as the
 * Unique Swap Identifier (USI) or the Prior Unique Swap Identifier (PUSI).
 */
@NextVersion(UniqueTransactionIdentifier2.class)
public class UniqueTransactionIdentifier1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}