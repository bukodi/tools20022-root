package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.InvestmentAccountModificationDetails;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.InvestmentAccountModification2;
import com.tools20022.core.repo.NextVersion;

/**
 * Provide information about the reason for the modification and about the
 * application request which triggered this modification.
 */
@PreviousVersion(InvestmentAccountModificationDetails.class)
@NextVersion(InvestmentAccountModification2.class)
public class InvestmentAccountModification1 {
}