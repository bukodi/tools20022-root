package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.EnvelopedData1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.EnvelopedData3;
import com.tools20022.core.repo.NextVersion;

/**
 * Encrypted data with encryption key.
 */
@PreviousVersion(EnvelopedData1.class)
@NextVersion(EnvelopedData3.class)
public class EnvelopedData2 {
}