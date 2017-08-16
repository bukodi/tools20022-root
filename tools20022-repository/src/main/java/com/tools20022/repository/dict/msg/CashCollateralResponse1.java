package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.OtherCollateralResponse1;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SecuritiesCollateralResponse1;
import com.tools20022.repository.dict.msg.CashCollateralResponse2;

/**
 * Provides more details on the response such as the response type, the
 * collateral identification, and optionally further details in case of
 * rejection.
 */
@NextVersion(OtherCollateralResponse1.class)
@NextVersion(SecuritiesCollateralResponse1.class)
@NextVersion(CashCollateralResponse2.class)
public class CashCollateralResponse1
		implements
			GeneratedRepoBean<MMMessageComponent> {
}