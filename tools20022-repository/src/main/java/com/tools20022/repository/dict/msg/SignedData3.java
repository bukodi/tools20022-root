package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.SignedData2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SignedData4;
import com.tools20022.core.repo.NextVersion;

/**
 * Digital signature of data, with an asymmetric key.
 */
@PreviousVersion(SignedData2.class)
@NextVersion(SignedData4.class)
public class SignedData3 {
}