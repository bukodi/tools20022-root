package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AccountManagementStatusAndReason3;
import com.tools20022.core.repo.NextVersion;

/**
 * Status report of an account opening instruction or account modification
 * instruction that was previously received.
 */
@PreviousVersion(AccountManagementStatusAndReason1.class)
@NextVersion(AccountManagementStatusAndReason3.class)
public class AccountManagementStatusAndReason2 {
}