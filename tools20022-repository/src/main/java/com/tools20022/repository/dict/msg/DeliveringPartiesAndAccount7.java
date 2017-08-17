package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DeliveringPartiesAndAccount10;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DeliveringPartiesAndAccount11;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 */
@NextVersion(DeliveringPartiesAndAccount10.class)
@NextVersion(DeliveringPartiesAndAccount11.class)
public class DeliveringPartiesAndAccount7
		implements
			GeneratedRepoBean<MMMessageComponent> {
}