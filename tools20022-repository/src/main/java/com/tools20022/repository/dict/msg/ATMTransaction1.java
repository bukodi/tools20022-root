package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMTransaction2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMTransaction8;
import com.tools20022.repository.dict.msg.ATMTransaction6;
import com.tools20022.repository.dict.msg.ATMTransaction7;

/**
 * Withdrawal transaction for which an authorisation is requested.
 */
@NextVersion(ATMTransaction2.class)
@NextVersion(ATMTransaction8.class)
@NextVersion(ATMTransaction6.class)
@NextVersion(ATMTransaction7.class)
public class ATMTransaction1 implements GeneratedRepoBean<MMMessageComponent> {
}