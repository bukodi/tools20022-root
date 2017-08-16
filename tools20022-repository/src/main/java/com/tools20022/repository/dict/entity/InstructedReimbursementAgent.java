package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CashSettlementInstructionPartyRole;

/**
 * Agent at which the instructed agent will be reimbursed. Usage: If the
 * instructing and instructed agents have the same reimbursement agent, then
 * only InstructedReimbursementAgent is not allowed. Usage: If
 * InstructedReimbursementAgent contains a branch of the instructed agent, then
 * the instructed agent will claim reimbursement from that branch/will be paid
 * by that branch.
 */
public class InstructedReimbursementAgent
		extends
			CashSettlementInstructionPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}