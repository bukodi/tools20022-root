package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.dict.codeset.PaymentCancellationRejectionCode;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.CaseAssignmentRejectionCode;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.dict.codeset.InvestigationRejectionCode;

/**
 * Specifies the rejection of an activity linked to a payment. The rejected
 * activity may be the assignment of an investigation case, the cancellation or
 * the modification of a payment.
 */
public class PaymentInvestigationCaseRejection {

	private PaymentModificationRejectionV2Code RejectedModification;
	private PaymentCancellationRejectionCode RejectedCancellation;
	private Max140Text RejectedCancellationReason;
	private YesNoIndicator AssignmentCancellationConfirmation;
	private CaseAssignmentRejectionCode RejectionReason;
	private PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution;
	private InvestigationRejectionCode InvestigationRejection;

	public PaymentModificationRejectionV2Code getRejectedModification() {
		return RejectedModification;
	}

	public void setRejectedModification(
			PaymentModificationRejectionV2Code RejectedModification) {
		this.RejectedModification = RejectedModification;
	}

	public PaymentCancellationRejectionCode getRejectedCancellation() {
		return RejectedCancellation;
	}

	public void setRejectedCancellation(
			PaymentCancellationRejectionCode RejectedCancellation) {
		this.RejectedCancellation = RejectedCancellation;
	}

	public Max140Text getRejectedCancellationReason() {
		return RejectedCancellationReason;
	}

	public void setRejectedCancellationReason(
			Max140Text RejectedCancellationReason) {
		this.RejectedCancellationReason = RejectedCancellationReason;
	}

	public YesNoIndicator getAssignmentCancellationConfirmation() {
		return AssignmentCancellationConfirmation;
	}

	public void setAssignmentCancellationConfirmation(
			YesNoIndicator AssignmentCancellationConfirmation) {
		this.AssignmentCancellationConfirmation = AssignmentCancellationConfirmation;
	}

	public CaseAssignmentRejectionCode getRejectionReason() {
		return RejectionReason;
	}

	public void setRejectionReason(CaseAssignmentRejectionCode RejectionReason) {
		this.RejectionReason = RejectionReason;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return RelatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(
			PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution) {
		this.RelatedInvestigationCaseResolution = RelatedInvestigationCaseResolution;
	}

	public InvestigationRejectionCode getInvestigationRejection() {
		return InvestigationRejection;
	}

	public void setInvestigationRejection(
			InvestigationRejectionCode InvestigationRejection) {
		this.InvestigationRejection = InvestigationRejection;
	}
}