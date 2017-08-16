package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.Balance4;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Balance6;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 */
@NextVersion(Balance4.class)
@NextVersion(Balance6.class)
public class Balance1 implements GeneratedRepoBean<MMMessageComponent> {
}