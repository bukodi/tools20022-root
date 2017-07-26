package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.SignedData1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SignedData3;
import com.tools20022.core.repo.NextVersion;

/**
 * Digital signature of data, with an asymmetric key.
 */
@PreviousVersion(SignedData1.class)
@NextVersion(SignedData3.class)
public class SignedData2 {
}