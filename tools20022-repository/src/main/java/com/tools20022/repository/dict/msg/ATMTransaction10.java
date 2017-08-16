package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMTransaction2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMTransaction12;
import com.tools20022.core.repo.NextVersion;

/**
 * Response to the PIN management transaction. request.
 */
@PreviousVersion(ATMTransaction2.class)
@NextVersion(ATMTransaction12.class)
public class ATMTransaction10 implements GeneratedRepoBean<MMMessageComponent> {
}