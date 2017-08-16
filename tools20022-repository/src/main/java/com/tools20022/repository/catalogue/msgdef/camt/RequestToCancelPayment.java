package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.PaymentInstructionExtract;
import com.tools20022.repository.dict.msg.DebitAuthorisationDetails;

/**
 * Scope The Request To Cancel Payment message is sent by a case creator/case
 * assigner to a case assignee. This message is used to request the cancellation
 * of an original payment instruction. Usage The Request To Cancel Payment
 * message must be answered with a: - Resolution Of Investigation message with a
 * positive final outcome when the case assignee can perform the requested
 * cancellation - Resolution Of Investigation message with a negative final
 * outcome when the case assignee may perform the requested cancellation but
 * fails to do so (too late, irrevocable instruction, ...) - Reject Case
 * Assignment message when the case assignee is unable or not authorised to
 * perform the requested cancellation - Notification Of Case Assignment message
 * to indicate whether the case assignee will take on the case himself or
 * reassign the case to a subsequent party in the payment processing chain. A
 * Request To Cancel Payment message concerns one and only one original payment
 * instruction at a time. If several original payment instructions need to be
 * cancelled, then multiple Request To Cancel Payment messages must be sent.
 * When a case assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the Resolution Of Investigation message. The processing of a
 * request to cancel payment case may end with a Debit Authorisation Request
 * message sent to the creditor by its account servicing institution. The
 * Request To Cancel Payment message may be used to escalate a case after an
 * unsuccessful request to modify the payment. In this scenario, the case
 * identification remains the same as in the original Request To Modify Payment
 * message and the element ReopenCaseIndication is set to 'Yes' or 'true'.
 */
public class RequestToCancelPayment
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment Assignment;
	private Case Case;
	private PaymentInstructionExtract Underlying;
	private DebitAuthorisationDetails Justification;

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

	public DebitAuthorisationDetails getJustification() {
		return Justification;
	}

	public void setJustification(DebitAuthorisationDetails Justification) {
		this.Justification = Justification;
	}
}