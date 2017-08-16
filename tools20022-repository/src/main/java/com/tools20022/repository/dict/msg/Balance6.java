package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Balance1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.Balance8;
import com.tools20022.core.repo.NextVersion;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 */
@PreviousVersion(Balance1.class)
@NextVersion(Balance8.class)
public class Balance6 implements GeneratedRepoBean<MMMessageComponent> {
}