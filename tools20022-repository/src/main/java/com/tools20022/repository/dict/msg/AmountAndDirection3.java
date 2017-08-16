package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AmountAndDirection35;
import com.tools20022.core.repo.NextVersion;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 */
@NextVersion(AmountAndDirection35.class)
public class AmountAndDirection3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}