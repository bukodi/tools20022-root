package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ATMService2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ATMService3;

/**
 * Withdrawal service provided by the ATM inside the session.
 */
@NextVersion(ATMService2.class)
@NextVersion(ATMService3.class)
public class ATMService1 {
}