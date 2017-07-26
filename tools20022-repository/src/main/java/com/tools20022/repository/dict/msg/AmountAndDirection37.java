package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AmountAndDirection32;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AmountAndDirection45;
import com.tools20022.core.repo.NextVersion;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 */
@PreviousVersion(AmountAndDirection32.class)
@NextVersion(AmountAndDirection45.class)
public class AmountAndDirection37 {
}