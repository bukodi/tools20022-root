package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.InvestmentAccount42;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.InvestmentAccount58;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 */
@NextVersion(InvestmentAccount42.class)
@NextVersion(InvestmentAccount58.class)
public class InvestmentAccount21
		implements
			GeneratedRepoBean<MMMessageComponent> {
}