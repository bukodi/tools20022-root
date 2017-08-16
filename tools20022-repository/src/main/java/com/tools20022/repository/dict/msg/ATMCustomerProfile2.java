package com.tools20022.repository.dict.msg;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.dict.msg.ATMCustomerProfile1;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ATMCustomerProfile3;
import com.tools20022.core.repo.NextVersion;

/**
 * Profile of the customer selected by an ATM.
 */
@PreviousVersion(ATMCustomerProfile1.class)
@NextVersion(ATMCustomerProfile3.class)
public class ATMCustomerProfile2
		implements
			GeneratedRepoBean<MMMessageComponent> {
}