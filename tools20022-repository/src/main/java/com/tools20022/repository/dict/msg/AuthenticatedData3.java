package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.AuthenticatedData2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AuthenticatedData4;
import com.tools20022.core.repo.NextVersion;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 */
@PreviousVersion(AuthenticatedData2.class)
@NextVersion(AuthenticatedData4.class)
public class AuthenticatedData3
		implements
			GeneratedRepoBean<MMMessageComponent> {
}