package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.PaymentPartyRole;
import com.tools20022.repository.dict.entity.IntermediaryAgentRole;
import com.tools20022.repository.dict.datatype.Number;

/**
 * Agent between the debtor's agent and the creditor's agent. There can be
 * several intermediary agents specified for the execution of a payment.
 */
public class IntermediaryAgentRole extends PaymentPartyRole {

	private IntermediaryAgentRole IntermediaryAgentRole;
	private IntermediaryAgentRole NextParty;
	private Number Position;

	public IntermediaryAgentRole getIntermediaryAgentRole() {
		return IntermediaryAgentRole;
	}

	public void setIntermediaryAgentRole(
			IntermediaryAgentRole IntermediaryAgentRole) {
		this.IntermediaryAgentRole = IntermediaryAgentRole;
	}

	public IntermediaryAgentRole getNextParty() {
		return NextParty;
	}

	public void setNextParty(IntermediaryAgentRole NextParty) {
		this.NextParty = NextParty;
	}

	public Number getPosition() {
		return Position;
	}

	public void setPosition(Number Position) {
		this.Position = Position;
	}
}