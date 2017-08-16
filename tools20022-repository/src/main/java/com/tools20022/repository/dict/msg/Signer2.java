package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Signer1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Signer3;
import com.tools20022.core.repo.NextVersion;

/**
 * Entity who has signed the data and its digital signature.
 */
@PreviousVersion(Signer1.class)
@NextVersion(Signer3.class)
public class Signer2 implements GeneratedRepoBean<MMMessageComponent> {
}