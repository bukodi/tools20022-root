package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestigationResolution;
import com.tools20022.repository.dict.codeset.InvestigationExecutionConfirmationCode;
import com.tools20022.repository.dict.entity.DebitAuthorisation;
import com.tools20022.repository.dict.entity.CashSettlement;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.PaymentExecution;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseRejection;
import com.tools20022.repository.dict.entity.DuplicateCase;

/**
 * Specifies the status of an investigation case and the actions taken as a
 * result of this status.
 */
public class PaymentInvestigationCaseResolution extends InvestigationResolution {

	private InvestigationExecutionConfirmationCode InvestigationStatus;
	private DebitAuthorisation DebitAuthorisationConfirmation;
	private CashSettlement CoverCorrection;
	private CashEntry EntryCorrection;
	private Payment PaymentCorrection;
	private PaymentExecution PaymentExecutionCorrection;
	private PaymentInvestigationCaseRejection InvestigationCaseRejection;
	private DuplicateCase DuplicateCase;

	public InvestigationExecutionConfirmationCode getInvestigationStatus() {
		return InvestigationStatus;
	}

	public void setInvestigationStatus(
			InvestigationExecutionConfirmationCode InvestigationStatus) {
		this.InvestigationStatus = InvestigationStatus;
	}

	public DebitAuthorisation getDebitAuthorisationConfirmation() {
		return DebitAuthorisationConfirmation;
	}

	public void setDebitAuthorisationConfirmation(
			DebitAuthorisation DebitAuthorisationConfirmation) {
		this.DebitAuthorisationConfirmation = DebitAuthorisationConfirmation;
	}

	public CashSettlement getCoverCorrection() {
		return CoverCorrection;
	}

	public void setCoverCorrection(CashSettlement CoverCorrection) {
		this.CoverCorrection = CoverCorrection;
	}

	public CashEntry getEntryCorrection() {
		return EntryCorrection;
	}

	public void setEntryCorrection(CashEntry EntryCorrection) {
		this.EntryCorrection = EntryCorrection;
	}

	public Payment getPaymentCorrection() {
		return PaymentCorrection;
	}

	public void setPaymentCorrection(Payment PaymentCorrection) {
		this.PaymentCorrection = PaymentCorrection;
	}

	public PaymentExecution getPaymentExecutionCorrection() {
		return PaymentExecutionCorrection;
	}

	public void setPaymentExecutionCorrection(
			PaymentExecution PaymentExecutionCorrection) {
		this.PaymentExecutionCorrection = PaymentExecutionCorrection;
	}

	public PaymentInvestigationCaseRejection getInvestigationCaseRejection() {
		return InvestigationCaseRejection;
	}

	public void setInvestigationCaseRejection(
			PaymentInvestigationCaseRejection InvestigationCaseRejection) {
		this.InvestigationCaseRejection = InvestigationCaseRejection;
	}

	public DuplicateCase getDuplicateCase() {
		return DuplicateCase;
	}

	public void setDuplicateCase(DuplicateCase DuplicateCase) {
		this.DuplicateCase = DuplicateCase;
	}
}