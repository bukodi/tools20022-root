package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Acquirer1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Acquirer3;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Acquirer4;

/**
 * Acquirer involved in the card payment.
 */
@PreviousVersion(Acquirer1.class)
@NextVersion(Acquirer3.class)
@NextVersion(Acquirer4.class)
public class Acquirer2 {
}