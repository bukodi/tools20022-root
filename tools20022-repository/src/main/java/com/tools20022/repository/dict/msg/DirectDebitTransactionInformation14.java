package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation12;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation17;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
@PreviousVersion(DirectDebitTransactionInformation12.class)
@NextVersion(DirectDebitTransactionInformation17.class)
public class DirectDebitTransactionInformation14
		implements
			GeneratedRepoBean<MMMessageComponent> {
}