package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.PaymentPartyRole;

/**
 * Financial institution that receives the instruction from the initiating party
 * and forwards it to the next agent in the payment chain for execution.
 */
public class ForwardingAgentRole extends PaymentPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}