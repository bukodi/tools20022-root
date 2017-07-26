package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.core.repo.NextVersion;

/**
 * Posting of an item to a cash account, in the context of a cash transaction,
 * that results in an increase or decrease to the balance of the account.
 */
@PreviousVersion(AmountAndDirection2.class)
@NextVersion(AmountAndDirection46.class)
public class AmountAndDirection36 {
}