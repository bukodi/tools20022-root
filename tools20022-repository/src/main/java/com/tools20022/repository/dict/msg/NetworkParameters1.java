package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.NetworkParameters2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.NetworkParameters3;

/**
 * Configuration parameters to communicate with a host.
 */
@NextVersion(NetworkParameters2.class)
@NextVersion(NetworkParameters3.class)
public class NetworkParameters1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}