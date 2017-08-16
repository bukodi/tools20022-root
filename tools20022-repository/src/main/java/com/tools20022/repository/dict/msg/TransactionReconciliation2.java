package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TransactionReconciliation1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionReconciliation3;
import com.tools20022.core.repo.NextVersion;

/**
 * Reconciliation transaction between an acceptor and an acquirer.
 */
@PreviousVersion(TransactionReconciliation1.class)
@NextVersion(TransactionReconciliation3.class)
public class TransactionReconciliation2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}