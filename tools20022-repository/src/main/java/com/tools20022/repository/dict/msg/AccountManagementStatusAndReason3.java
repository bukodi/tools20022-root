package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason4;
import com.tools20022.core.repo.NextVersion;

/**
 * Status report of an account opening instruction or account modification
 * instruction that was previously received.
 */
@PreviousVersion(AccountManagementStatusAndReason2.class)
@NextVersion(AccountManagementStatusAndReason4.class)
public class AccountManagementStatusAndReason3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}