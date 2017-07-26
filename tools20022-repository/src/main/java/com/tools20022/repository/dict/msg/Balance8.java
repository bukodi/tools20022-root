package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.Balance6;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Balance9;
import com.tools20022.core.repo.NextVersion;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 */
@PreviousVersion(Balance6.class)
@NextVersion(Balance9.class)
public class Balance8 {
}