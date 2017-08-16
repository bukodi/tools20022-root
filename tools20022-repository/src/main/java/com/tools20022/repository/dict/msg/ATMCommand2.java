package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMCommand1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMCommand3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMCommand5;

/**
 * Result of a maintenance command performed by the ATM.
 */
@PreviousVersion(ATMCommand1.class)
@NextVersion(ATMCommand3.class)
@NextVersion(ATMCommand5.class)
public class ATMCommand2 implements GeneratedRepoBean<MMMessageComponent> {
}