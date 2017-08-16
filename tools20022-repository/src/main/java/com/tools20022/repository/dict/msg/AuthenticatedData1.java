package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AuthenticatedData2;
import com.tools20022.core.repo.NextVersion;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 */
@NextVersion(AuthenticatedData2.class)
public class AuthenticatedData1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}