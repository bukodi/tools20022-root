package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.InvestmentAccount44;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.InvestmentAccount52;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 */
@NextVersion(InvestmentAccount44.class)
@NextVersion(InvestmentAccount52.class)
public class InvestmentAccount29
		implements
			GeneratedRepoBean<MMMessageComponent> {
}