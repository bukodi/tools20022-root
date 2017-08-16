package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.RequestedModification3;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.RequestedModification5;
import com.tools20022.core.repo.NextVersion;

/**
 * Provide further details on the requested modifications of the underlying
 * payment instruction.
 */
@PreviousVersion(RequestedModification3.class)
@NextVersion(RequestedModification5.class)
public class RequestedModification4
		implements
			GeneratedRepoBean<MMMessageComponent> {
}