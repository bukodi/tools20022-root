package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.SettlementParties40;
import com.tools20022.core.repo.NextVersion;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 */
@NextVersion(SettlementParties40.class)
public class SettlementParties13
		implements
			GeneratedRepoBean<MMMessageComponent> {
}