package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AccountBalanceExtensionSD1;
import com.tools20022.core.repo.PreviousVersion;

/**
 * Provides additional information regarding account balance. Contains
 * transaction details of the stock loans, repurchase agreements (REPOs) and
 * undelivered trades (FAILs).
 */
@PreviousVersion(AccountBalanceExtensionSD1.class)
public class AccountBalanceExtensionSD2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}