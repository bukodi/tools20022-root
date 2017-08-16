package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KEK2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.KEK4;
import com.tools20022.core.repo.NextVersion;

/**
 * Key encryption key (KEK), using previously distributed symmetric key.
 */
@PreviousVersion(KEK2.class)
@NextVersion(KEK4.class)
public class KEK3 implements GeneratedRepoBean<MMMessageComponent> {
}