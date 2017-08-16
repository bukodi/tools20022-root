package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.MaintenanceDelegation2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MaintenanceDelegation3;

/**
 * Information on the delegation of a maintenance action or maintenance
 * function.
 */
@NextVersion(MaintenanceDelegation2.class)
@NextVersion(MaintenanceDelegation3.class)
public class MaintenanceDelegation1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}