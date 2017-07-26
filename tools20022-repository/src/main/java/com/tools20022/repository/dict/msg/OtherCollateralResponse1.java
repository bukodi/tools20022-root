package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.CashCollateralResponse1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.OtherCollateralResponse2;
import com.tools20022.core.repo.NextVersion;

/**
 * Provides more details on the response such as the response type, the
 * collateral identification, and optionally further details in case of
 * rejection.
 */
@PreviousVersion(CashCollateralResponse1.class)
@NextVersion(OtherCollateralResponse2.class)
public class OtherCollateralResponse1 {
}