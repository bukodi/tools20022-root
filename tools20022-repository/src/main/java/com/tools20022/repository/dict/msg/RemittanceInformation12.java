package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.RemittanceInformation8;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.RemittanceInformation13;
import com.tools20022.core.repo.NextVersion;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system.
 */
@PreviousVersion(RemittanceInformation8.class)
@NextVersion(RemittanceInformation13.class)
public class RemittanceInformation12
		implements
			GeneratedRepoBean<MMMessageComponent> {
}