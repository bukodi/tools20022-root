package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ResponseType1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ResponseType3;
import com.tools20022.core.repo.NextVersion;

/**
 * Response of a requested service.
 */
@PreviousVersion(ResponseType1.class)
@NextVersion(ResponseType3.class)
public class ResponseType2 {
}