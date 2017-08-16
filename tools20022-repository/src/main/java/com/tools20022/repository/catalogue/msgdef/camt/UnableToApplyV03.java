package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.UnableToApplyV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.dict.choice.UnableToApplyJustification2Choice;

/**
 * Scope The Unable To Apply message is sent by a case creator or a case
 * assigner to a case assignee. This message is used to initiate an
 * investigation of a payment instruction that cannot be executed or reconciled.
 * Usage The Unable To Apply case occurs in two situations: - an agent cannot
 * execute the payment instruction due to missing or incorrect information - a
 * creditor cannot reconcile the payment entry as it is received unexpectedly,
 * or missing or incorrect information prevents reconciliation The Unable To
 * Apply message - always follows the reverse route of the original payment
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
 * instruction has reached an incorrect creditor. The UnableToApply message has
 * the following main characteristics: - Case Identification and Reason Code:
 * The case creator (the instructed party/creditor of a payment instruction)
 * assigns a unique case identification and optionally the reason code for the
 * Unable To Apply message. This information will be passed unchanged to all
 * subsequent case assignees. - Underlying Payment Instruction Identification:
 * The case creator specifies the identification of the underlying payment
 * instruction. This identification needs to be updated by the subsequent case
 * assigner(s) in order to match the one used with their case assignee(s). -
 * Unable To Apply Justification: The Unable To Apply Justification element
 * allows the assigner to indicate whether a specific element causes the unable
 * to apply situation (incorrect element and/or mismatched element can be
 * listed) or whether any supplementary information needs to be forwarded.
 */
@NextVersion(UnableToApplyV04.class)
public class UnableToApplyV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment2 Assignment;
	private Case2 Case;
	private UnderlyingTransaction1Choice Underlying;
	private UnableToApplyJustification2Choice Justification;

	public CaseAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Case2 getCase() {
		return Case;
	}

	public void setCase(Case2 Case) {
		this.Case = Case;
	}

	public UnderlyingTransaction1Choice getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction1Choice Underlying) {
		this.Underlying = Underlying;
	}

	public UnableToApplyJustification2Choice getJustification() {
		return Justification;
	}

	public void setJustification(UnableToApplyJustification2Choice Justification) {
		this.Justification = Justification;
	}
}