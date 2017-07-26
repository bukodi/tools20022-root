package com.tools20022.repository.dict.msg;

import com.tools20022.repository.dict.msg.DirectDebitMandate5;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DirectDebitMandate6;

/**
 * Instruction, initiated by the creditor, to debit a debtor's account in favour
 * of the creditor. A direct debit can be pre-authorised or not. In most
 * countries, authorisation is in the form of a mandate between the debtor and
 * creditor.
 */
@NextVersion(DirectDebitMandate5.class)
@NextVersion(DirectDebitMandate6.class)
public class DirectDebitMandate4 {
}