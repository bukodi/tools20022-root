package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AcceptorRejection1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AcceptorRejection3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AcceptorRejection4;

/**
 * Reject of an exchange.
 */
@PreviousVersion(AcceptorRejection1.class)
@NextVersion(AcceptorRejection3.class)
@NextVersion(AcceptorRejection4.class)
public class AcceptorRejection2 {
}