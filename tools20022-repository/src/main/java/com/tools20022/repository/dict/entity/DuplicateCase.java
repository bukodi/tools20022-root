package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestigationResolution;
import com.tools20022.repository.dict.entity.InvestigationCase;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;

/**
 * Outcome that results in closing a case as duplicate because the same issue
 * has been reported by another party.
 */
public class DuplicateCase extends InvestigationResolution {

	private InvestigationCase DuplicatedCase;
	private PaymentInvestigationCaseResolution RelatedCaseResolution;

	public InvestigationCase getDuplicatedCase() {
		return DuplicatedCase;
	}

	public void setDuplicatedCase(InvestigationCase DuplicatedCase) {
		this.DuplicatedCase = DuplicatedCase;
	}

	public PaymentInvestigationCaseResolution getRelatedCaseResolution() {
		return RelatedCaseResolution;
	}

	public void setRelatedCaseResolution(
			PaymentInvestigationCaseResolution RelatedCaseResolution) {
		this.RelatedCaseResolution = RelatedCaseResolution;
	}
}