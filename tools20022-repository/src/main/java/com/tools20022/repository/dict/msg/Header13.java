package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Header9;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header20;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header26;

/**
 * Set of characteristics related to the protocol after a rejection.
 */
@PreviousVersion(Header9.class)
@NextVersion(Header20.class)
@NextVersion(Header26.class)
public class Header13 {
}