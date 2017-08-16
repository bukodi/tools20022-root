package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KeyTransport2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.KeyTransport4;
import com.tools20022.core.repo.NextVersion;

/**
 * Key encryption key (KEK), encrypted with a previously distributed asymmetric
 * public key.
 */
@PreviousVersion(KeyTransport2.class)
@NextVersion(KeyTransport4.class)
public class KeyTransport3 implements GeneratedRepoBean<MMMessageComponent> {
}