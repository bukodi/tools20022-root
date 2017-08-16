package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KEKIdentifier1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.KEKIdentifier3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.KEKIdentifier5;

/**
 * Identification of a key encryption key (KEK), using previously distributed
 * symmetric key.
 */
@PreviousVersion(KEKIdentifier1.class)
@NextVersion(KEKIdentifier3.class)
@NextVersion(KEKIdentifier5.class)
public class KEKIdentifier2 implements GeneratedRepoBean<MMMessageComponent> {
}