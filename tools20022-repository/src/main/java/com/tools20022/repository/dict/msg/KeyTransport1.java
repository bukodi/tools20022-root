package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KeyTransport2;
import com.tools20022.core.repo.NextVersion;

/**
 * Key encryption key (KEK), encrypted previously distributed symmetric key.
 */
@NextVersion(KeyTransport2.class)
public class KeyTransport1 implements GeneratedRepoBean<MMMessageComponent> {
}