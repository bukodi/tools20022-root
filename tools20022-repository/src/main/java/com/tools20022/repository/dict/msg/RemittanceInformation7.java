package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.RemittanceInformation8;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.RemittanceInformation10;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system.
 */
@NextVersion(RemittanceInformation8.class)
@NextVersion(RemittanceInformation10.class)
public class RemittanceInformation7 {
}