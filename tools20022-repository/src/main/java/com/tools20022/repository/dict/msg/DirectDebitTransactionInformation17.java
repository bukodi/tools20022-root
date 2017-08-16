package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation14;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation20;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
@PreviousVersion(DirectDebitTransactionInformation14.class)
@NextVersion(DirectDebitTransactionInformation20.class)
public class DirectDebitTransactionInformation17
		implements
			GeneratedRepoBean<MMMessageComponent> {
}