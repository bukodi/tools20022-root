package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.FailingReason1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.FailingReason5;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.FailingReason8;

/**
 * The status of an instruction, advice or request.
 */
@PreviousVersion(FailingReason1.class)
@NextVersion(FailingReason5.class)
@NextVersion(FailingReason8.class)
public class FailingReason3 {
}