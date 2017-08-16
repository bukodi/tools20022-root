package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ProformaStatusReason1;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DisabledStatusReason1;
import com.tools20022.repository.dict.msg.AccountStatusUpdateInstructionReason1;

/**
 * Reason for an enabled status.
 */
@NextVersion(ProformaStatusReason1.class)
@NextVersion(DisabledStatusReason1.class)
@NextVersion(AccountStatusUpdateInstructionReason1.class)
public class EnabledStatusReason1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}