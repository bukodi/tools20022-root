package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ATMTransaction2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMTransaction5;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMTransaction11;

/**
 * Withdrawal transaction for which the completion is sent.
 */
@PreviousVersion(ATMTransaction2.class)
@NextVersion(ATMTransaction5.class)
@NextVersion(ATMTransaction11.class)
public class ATMTransaction3 {
}