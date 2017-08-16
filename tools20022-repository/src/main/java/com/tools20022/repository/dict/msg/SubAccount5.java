package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.SubAccount1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SubAccount6;
import com.tools20022.core.repo.NextVersion;

/**
 * Business relationship between two entities; one entity is the account owner,
 * the other entity is the account servicer.
 */
@PreviousVersion(SubAccount1.class)
@NextVersion(SubAccount6.class)
public class SubAccount5 implements GeneratedRepoBean<MMMessageComponent> {
}