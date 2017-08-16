package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AccountBalanceSD7;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides additional information regarding account balance. Contains
 * transaction details of the stock loans, repurchase agreements (REPOs) and
 * undelivered trades (FAILs).
 */
@NextVersion(AccountBalanceSD7.class)
public class AccountBalanceSD5 implements GeneratedRepoBean<MMMessageComponent> {
}