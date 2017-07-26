package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.DetailedAmount9;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DetailedAmount11;
import com.tools20022.core.repo.NextVersion;

/**
 * Additional amounts from the processor or the issuer without financial impacts
 * on the transaction amount.
 */
@PreviousVersion(DetailedAmount9.class)
@NextVersion(DetailedAmount11.class)
public class DetailedAmount10 {
}