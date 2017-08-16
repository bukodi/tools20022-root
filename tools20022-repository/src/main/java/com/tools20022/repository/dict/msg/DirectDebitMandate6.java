package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.DirectDebitMandate4;
import com.tools20022.core.repo.PreviousVersion;

/**
 * Instruction, initiated by the creditor, to debit a debtor's account in favour
 * of the creditor. A direct debit can be pre-authorised or not. In most
 * countries, authorisation is in the form of a mandate between the debtor and
 * creditor.
 */
@PreviousVersion(DirectDebitMandate4.class)
public class DirectDebitMandate6
		implements
			GeneratedRepoBean<MMMessageComponent> {
}