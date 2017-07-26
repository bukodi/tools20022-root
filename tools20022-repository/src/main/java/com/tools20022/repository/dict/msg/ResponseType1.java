package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ResponseType2;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ResponseType5;

/**
 * Response of a requested service.
 */
@NextVersion(ResponseType2.class)
@NextVersion(ResponseType5.class)
public class ResponseType1 {
}