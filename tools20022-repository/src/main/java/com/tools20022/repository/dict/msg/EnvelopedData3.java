package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.EnvelopedData2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.EnvelopedData4;
import com.tools20022.core.repo.NextVersion;

/**
 * Encrypted data with encryption key.
 */
@PreviousVersion(EnvelopedData2.class)
@NextVersion(EnvelopedData4.class)
public class EnvelopedData3 implements GeneratedRepoBean<MMMessageComponent> {
}