package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.ReceivingPartiesAndAccount10;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReceivingPartiesAndAccount11;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 */
@NextVersion(ReceivingPartiesAndAccount10.class)
@NextVersion(ReceivingPartiesAndAccount11.class)
public class ReceivingPartiesAndAccount7 {
}