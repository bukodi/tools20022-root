package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AdditionalBalanceInformation9;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AdditionalBalanceInformation15;
import com.tools20022.core.repo.NextVersion;

/**
 * Subbalances providing additional information on a specific position but that
 * is not to be accounted for in the building of the aggregate balance, for
 * example, registered.
 */
@PreviousVersion(AdditionalBalanceInformation9.class)
@NextVersion(AdditionalBalanceInformation15.class)
public class AdditionalBalanceInformation11 {
}