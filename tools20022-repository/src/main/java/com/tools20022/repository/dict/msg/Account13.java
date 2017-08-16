package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Account11;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Account18;
import com.tools20022.core.repo.NextVersion;

/**
 * Business relationship between two entities; one entity is the account owner,
 * the other entity is the account servicer.
 */
@PreviousVersion(Account11.class)
@NextVersion(Account18.class)
public class Account13 implements GeneratedRepoBean<MMMessageComponent> {
}