package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.InvestmentAccount22;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.InvestmentAccount54;
import com.tools20022.core.repo.NextVersion;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 */
@PreviousVersion(InvestmentAccount22.class)
@NextVersion(InvestmentAccount54.class)
public class InvestmentAccount40
		implements
			GeneratedRepoBean<MMMessageComponent> {
}