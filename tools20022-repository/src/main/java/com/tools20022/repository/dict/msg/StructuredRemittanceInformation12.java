package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.StructuredRemittanceInformation10;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.StructuredRemittanceInformation13;
import com.tools20022.core.repo.NextVersion;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 */
@PreviousVersion(StructuredRemittanceInformation10.class)
@NextVersion(StructuredRemittanceInformation13.class)
public class StructuredRemittanceInformation12 {
}