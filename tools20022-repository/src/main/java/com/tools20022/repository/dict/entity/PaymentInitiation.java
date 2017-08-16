package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.PaymentExecution;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction is the first of the series of instructions
 * which may be used to execute a payment. It is normally sent by the initiating
 * party to the forwarding agent or to the debtor's agent.
 */
public class PaymentInitiation extends PaymentExecution
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}