package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation18;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation22;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
@PreviousVersion(DirectDebitTransactionInformation18.class)
@NextVersion(DirectDebitTransactionInformation22.class)
public class DirectDebitTransactionInformation19
		implements
			GeneratedRepoBean<MMMessageComponent> {
}