package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMTransaction1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMTransaction4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMTransaction10;
import com.tools20022.repository.dict.msg.ATMTransaction3;

/**
 * Response to the withdrawal transaction request.
 */
@PreviousVersion(ATMTransaction1.class)
@NextVersion(ATMTransaction4.class)
@NextVersion(ATMTransaction10.class)
@NextVersion(ATMTransaction3.class)
public class ATMTransaction2 implements GeneratedRepoBean<MMMessageComponent> {
}