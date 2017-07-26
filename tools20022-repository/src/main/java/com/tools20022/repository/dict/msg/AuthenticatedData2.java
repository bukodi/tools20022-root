package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AuthenticatedData1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AuthenticatedData3;
import com.tools20022.core.repo.NextVersion;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 */
@PreviousVersion(AuthenticatedData1.class)
@NextVersion(AuthenticatedData3.class)
public class AuthenticatedData2 {
}