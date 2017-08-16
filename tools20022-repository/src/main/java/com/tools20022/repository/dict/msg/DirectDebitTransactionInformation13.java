package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation11;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation18;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
@PreviousVersion(DirectDebitTransactionInformation11.class)
@NextVersion(DirectDebitTransactionInformation18.class)
public class DirectDebitTransactionInformation13
		implements
			GeneratedRepoBean<MMMessageComponent> {
}