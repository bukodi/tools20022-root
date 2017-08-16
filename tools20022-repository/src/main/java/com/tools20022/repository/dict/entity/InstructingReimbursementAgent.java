package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CashSettlementInstructionPartyRole;

/**
 * Specifies the agent through which the instructing agent will reimburse the
 * instructed agent. Usage: If the instructing and instructed agents have the
 * same reimbursement agent, then only InstructingReimbursementAgent must be
 * used.
 */
public class InstructingReimbursementAgent
		extends
			CashSettlementInstructionPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {
}