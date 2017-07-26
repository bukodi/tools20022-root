package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.References11;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.References20;
import com.tools20022.core.repo.NextVersion;

/**
 * Reference to the transaction identifier issued by the counterparty. Building
 * block may also be used to reference a previous transaction, or tie a set of
 * messages together.
 */
@PreviousVersion(References11.class)
@NextVersion(References20.class)
public class References15 {
}