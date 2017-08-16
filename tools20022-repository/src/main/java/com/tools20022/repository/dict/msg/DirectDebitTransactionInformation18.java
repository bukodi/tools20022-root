package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation13;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DirectDebitTransactionInformation19;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides further details specific to the individual direct debit
 * transaction(s) included in the message.
 */
@PreviousVersion(DirectDebitTransactionInformation13.class)
@NextVersion(DirectDebitTransactionInformation19.class)
public class DirectDebitTransactionInformation18
		implements
			GeneratedRepoBean<MMMessageComponent> {
}