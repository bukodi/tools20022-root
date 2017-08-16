package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KeyTransport1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.KeyTransport3;
import com.tools20022.core.repo.NextVersion;

/**
 * Key encryption key (KEK), encrypted with a previously distributed asymmetric
 * public key.
 */
@PreviousVersion(KeyTransport1.class)
@NextVersion(KeyTransport3.class)
public class KeyTransport2 implements GeneratedRepoBean<MMMessageComponent> {
}