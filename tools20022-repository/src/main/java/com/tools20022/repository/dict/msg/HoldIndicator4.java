package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.HoldIndicator2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.HoldIndicator6;
import com.tools20022.core.repo.NextVersion;

/**
 * Specifies whether the transaction is on hold/blocked/frozen.
 */
@PreviousVersion(HoldIndicator2.class)
@NextVersion(HoldIndicator6.class)
public class HoldIndicator4 {
}