package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.InvestigationCase;
import com.tools20022.repository.dict.entity.Status;

/**
 * Role played by a party in the context of an investigation process.
 */
public class InvestigationPartyRole extends Role {

	private InvestigationCase InvestigationCase;
	private Status Status;

	public InvestigationCase getInvestigationCase() {
		return InvestigationCase;
	}

	public void setInvestigationCase(InvestigationCase InvestigationCase) {
		this.InvestigationCase = InvestigationCase;
	}

	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status Status) {
		this.Status = Status;
	}
}