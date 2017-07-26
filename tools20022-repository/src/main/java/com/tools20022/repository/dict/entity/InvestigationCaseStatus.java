package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.CaseStatusCode;
import com.tools20022.repository.dict.entity.InvestigationCase;

/**
 * Status of an investigation case.
 */
public class InvestigationCaseStatus extends Status {

	private CaseStatusCode CaseStatus;
	private InvestigationCase InvestigationCase;

	public CaseStatusCode getCaseStatus() {
		return CaseStatus;
	}

	public void setCaseStatus(CaseStatusCode CaseStatus) {
		this.CaseStatus = CaseStatus;
	}

	public InvestigationCase getInvestigationCase() {
		return InvestigationCase;
	}

	public void setInvestigationCase(InvestigationCase InvestigationCase) {
		this.InvestigationCase = InvestigationCase;
	}
}