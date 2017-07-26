package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Acquirer6;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Acquirer8;
import com.tools20022.core.repo.NextVersion;

/**
 * Acquirer of the withdrawal transaction, in charge of the funds settlement
 * with the issuer.
 */
@PreviousVersion(Acquirer6.class)
@NextVersion(Acquirer8.class)
public class Acquirer7 {
}