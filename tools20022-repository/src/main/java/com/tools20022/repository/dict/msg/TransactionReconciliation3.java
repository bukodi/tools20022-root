package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.TransactionReconciliation2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionReconciliation4;
import com.tools20022.core.repo.NextVersion;

/**
 * Reconciliation transaction between an acceptor and an acquirer.
 */
@PreviousVersion(TransactionReconciliation2.class)
@NextVersion(TransactionReconciliation4.class)
public class TransactionReconciliation3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}