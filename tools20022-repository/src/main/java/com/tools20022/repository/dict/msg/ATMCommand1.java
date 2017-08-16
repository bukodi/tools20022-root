package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMCommand2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMCommand4;

/**
 * Maintenance command to perform on an ATM.
 */
@NextVersion(ATMCommand2.class)
@NextVersion(ATMCommand4.class)
public class ATMCommand1 implements GeneratedRepoBean<MMMessageComponent> {
}