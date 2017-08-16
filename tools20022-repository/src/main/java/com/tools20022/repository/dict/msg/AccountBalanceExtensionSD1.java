package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AccountBalanceExtensionSD2;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides additional information regarding account balance. Contains
 * transaction details of the stock loans, repurchase agreements (REPOs) and
 * undelivered trades (FAILs).
 */
@NextVersion(AccountBalanceExtensionSD2.class)
public class AccountBalanceExtensionSD1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}