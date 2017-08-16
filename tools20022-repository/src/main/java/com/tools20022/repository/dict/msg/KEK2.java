package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.KEK1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.KEK3;
import com.tools20022.core.repo.NextVersion;

/**
 * Key encryption key (KEK), using previously distributed symmetric key.
 */
@PreviousVersion(KEK1.class)
@NextVersion(KEK3.class)
public class KEK2 implements GeneratedRepoBean<MMMessageComponent> {
}