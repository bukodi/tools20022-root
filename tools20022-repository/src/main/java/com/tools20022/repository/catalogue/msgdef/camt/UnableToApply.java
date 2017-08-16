package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.PaymentInstructionExtract;
import com.tools20022.repository.dict.choice.UnableToApplyJustificationChoice;

/**
 * Scope The Unable To Apply message is sent by a case creator or a case
 * assigner to a case assignee. This message is used to initiate an
 * investigation of a payment instruction that cannot be executed or reconciled.
 * Usage The Unable To Apply case occurs in two situations: - an agent cannot
 * execute the payment instruction due to missing or incorrect information - a
 * creditor cannot reconcile the payment entry as it is received unexpectedly,
 * or missing or incorrect information prevents reconciliation The Unable To
 * Apply message: - always follows the reverse route of the original payment
 * instruction - must be forwarded to the preceding agents in the payment
 * processing chain, where appropriate - covers one and only one payment
 * instruction (or payment entry) at a time; if several payment instructions
 * cannot be executed or several payment entries cannot be reconciled, then
 * multiple Unable To Apply messages must be sent. Depending on what stage the
 * payment is and what has been done to it, for example incorrect routing,
 * errors/omissions when processing the instruction or even the absence of any
 * error, the unable to apply case may lead to a: - Additional Payment
 * Information message, sent to the case creator/case assigner, if a truncation
 * or omission in a payment instruction prevented reconciliation. - Request To
 * Cancel Payment message, sent to the subsequent agent in the payment
 * processing chain, if the original payment instruction has been incorrectly
 * routed through the chain of agents (this also entails a new corrected payment
 * instruction being issued). Prior to sending the payment cancellation request,
 * the agent should first send a resolution indicating that a cancellation will
 * follow (CWFW). - Request To Modify Payment message, sent to the subsequent
 * agent in the payment processing chain, if a truncation or omission has
 * occurred during the processing of the original payment instruction. Prior to
 * sending the modify payment request, the agent should first send a resolution
 * indicating that a modification will follow (MWFW). - Debit Authorisation
 * Request message, sent to the case creator/case assigner, if the payment
 * instruction has reached an incorrect creditor.
 */
public class UnableToApply implements GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment Assignment;
	private Case Case;
	private PaymentInstructionExtract Underlying;
	private UnableToApplyJustificationChoice Justification;

	public CaseAssignment getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment Assignment) {
		this.Assignment = Assignment;
	}

	public Case getCase() {
		return Case;
	}

	public void setCase(Case Case) {
		this.Case = Case;
	}

	public PaymentInstructionExtract getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(PaymentInstructionExtract Underlying) {
		this.Underlying = Underlying;
	}

	public UnableToApplyJustificationChoice getJustification() {
		return Justification;
	}

	public void setJustification(UnableToApplyJustificationChoice Justification) {
		this.Justification = Justification;
	}
}