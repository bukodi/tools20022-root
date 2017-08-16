package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.StructuredRemittanceInformation9;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StructuredRemittanceInformation12;
import com.tools20022.core.repo.NextVersion;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 */
@PreviousVersion(StructuredRemittanceInformation9.class)
@NextVersion(StructuredRemittanceInformation12.class)
public class StructuredRemittanceInformation10
		implements
			GeneratedRepoBean<MMMessageComponent> {
}