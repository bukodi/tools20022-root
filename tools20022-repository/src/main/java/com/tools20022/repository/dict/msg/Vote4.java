package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Vote8;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Vote6;

/**
 * Decision of the voting party for one resolution. Several types of decisions
 * can be indicated to allow for split vote specification.
 */
@NextVersion(Vote8.class)
@NextVersion(Vote6.class)
public class Vote4 {
}