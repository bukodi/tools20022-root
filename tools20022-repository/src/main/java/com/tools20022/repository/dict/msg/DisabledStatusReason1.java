package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.EnabledStatusReason1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.PendingStatusReason14;
import com.tools20022.core.repo.NextVersion;

/**
 * Reason for a disabled status.
 */
@PreviousVersion(EnabledStatusReason1.class)
@NextVersion(PendingStatusReason14.class)
public class DisabledStatusReason1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}