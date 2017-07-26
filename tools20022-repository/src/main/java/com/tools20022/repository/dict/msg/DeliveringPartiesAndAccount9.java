package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.DeliveringPartiesAndAccount8;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.DeliveringPartiesAndAccount13;
import com.tools20022.core.repo.NextVersion;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 */
@PreviousVersion(DeliveringPartiesAndAccount8.class)
@NextVersion(DeliveringPartiesAndAccount13.class)
public class DeliveringPartiesAndAccount9 {
}