package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.PaymentProcessing;
import com.tools20022.repository.dict.entity.PaymentInvestigationCase;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;
import com.tools20022.repository.dict.entity.PaymentInstruction;
import com.tools20022.repository.dict.entity.CurrencyExchange;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 */
public class PaymentExecution extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DebitCreditCode CreditDebitIndicator;
	private ISODateTime CreationDate;
	private ISODateTime AcceptanceDateTime;
	private Payment Payment;
	private PaymentProcessing ProcessingInstructions;
	private ISODateTime RequestedExecutionDate;
	private PaymentInvestigationCase RelatedInvestigationCase;
	private PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution;
	private PaymentInstruction Next;
	private CurrencyExchange CurrencyExchange;

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public ISODateTime getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(ISODateTime CreationDate) {
		this.CreationDate = CreationDate;
	}

	public ISODateTime getAcceptanceDateTime() {
		return AcceptanceDateTime;
	}

	public void setAcceptanceDateTime(ISODateTime AcceptanceDateTime) {
		this.AcceptanceDateTime = AcceptanceDateTime;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment Payment) {
		this.Payment = Payment;
	}

	public PaymentProcessing getProcessingInstructions() {
		return ProcessingInstructions;
	}

	public void setProcessingInstructions(
			PaymentProcessing ProcessingInstructions) {
		this.ProcessingInstructions = ProcessingInstructions;
	}

	public ISODateTime getRequestedExecutionDate() {
		return RequestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODateTime RequestedExecutionDate) {
		this.RequestedExecutionDate = RequestedExecutionDate;
	}

	public PaymentInvestigationCase getRelatedInvestigationCase() {
		return RelatedInvestigationCase;
	}

	public void setRelatedInvestigationCase(
			PaymentInvestigationCase RelatedInvestigationCase) {
		this.RelatedInvestigationCase = RelatedInvestigationCase;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return RelatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(
			PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution) {
		this.RelatedInvestigationCaseResolution = RelatedInvestigationCaseResolution;
	}

	public PaymentInstruction getNext() {
		return Next;
	}

	public void setNext(PaymentInstruction Next) {
		this.Next = Next;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}
}