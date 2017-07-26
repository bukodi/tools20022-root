package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Header13;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Header22;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header21;

/**
 * Information related to the protocol management on a segment of the path from
 * the ATM to the acquirer.
 */
@PreviousVersion(Header13.class)
@NextVersion(Header22.class)
@NextVersion(Header21.class)
public class Header20 {
}