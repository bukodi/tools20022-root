package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.SubAccount4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SubAccount5;

/**
 * Business relationship between two entities; one entity is the account owner,
 * the other entity is the account servicer.
 */
@NextVersion(SubAccount4.class)
@NextVersion(SubAccount5.class)
public class SubAccount1 implements GeneratedRepoBean<MMMessageComponent> {
}