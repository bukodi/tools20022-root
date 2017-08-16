package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.choice.InvestigationStatusChoice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.PaymentInstructionExtract;

/**
 * Scope The Resolution Of Investigation message is sent by a case assignee to a
 * case creator/case assigner. This message is used to inform of the resolution
 * of a case, and optionally provides details about . - the corrective action
 * undertaken by the case assignee - information on the return where applicable
 * Usage The Resolution Of Investigation message is used by the case assignee to
 * inform a case creator or case assigner about the resolution of a: - request
 * to cancel payment case - request to modify payment case - unable to apply
 * case - claim non receipt case The Resolution Of Investigation message covers
 * one and only one case at a time. If the case assignee needs to communicate
 * about several cases, then several Resolution Of Investigation messages must
 * be sent. The Resolution Of Investigation message provides: - the final
 * outcome of the case, whether positive or negative - optionally, the details
 * of the corrective action undertaken by the case assignee and the information
 * of the return Whenever a payment instruction has been generated to solve the
 * case under investigation, the optional CorrectionTransaction component
 * present in the message must be completed. Whenever the action of modifying or
 * cancelling a payment results in funds being returned, an investigating agent
 * may attached some details in this message. These details facilitates the
 * account reconciliations at the initiating bank and the intermediaries. It
 * must be stressed that returning of funds is outside the scope of this
 * Exceptions and Investigation service. The features given here is only meant
 * to transmit the information of returns when it is available. The Resolution
 * Of Investigation message must - be forwarded by all subsequent case
 * assignee(s) until it reaches the case creator - not be used in place of a
 * Reject Case Assignment or Case Status Report or Notification Of Case
 * Assignment message. Take note of an exceptional rule that allows the use of
 * Resolution Of Investigation in lieu of a Case Status Report. Case Status
 * Report is a response-message to a Case Status Report Request. The latter
 * which is sent when the assigner has waited too long (by his standard) for an
 * answer. However it may happen that when the Request arrives, the
 * investigating agent has just obtained a resolution. In such a situation, it
 * would be redundant to send a Case Status Report when then followed
 * immediately by a Resolution Of Investigation. It is therefore quite
 * acceptable for the investigating agent, the assignee, to skip the Case Status
 * Report and send the Resolution Of Investigation message directly.
 */
public class ResolutionOfInvestigation
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment Assignment;
	private Case ResolvedCase;
	private Optional<InvestigationStatusChoice> Status;
	private Optional<PaymentInstructionExtract> CorrectionTransaction;

	public CaseAssignment getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment Assignment) {
		this.Assignment = Assignment;
	}

	public Case getResolvedCase() {
		return ResolvedCase;
	}

	public void setResolvedCase(Case ResolvedCase) {
		this.ResolvedCase = ResolvedCase;
	}

	public Optional<InvestigationStatusChoice> getStatus() {
		return Status;
	}

	public void setStatus(Optional<InvestigationStatusChoice> Status) {
		this.Status = Status;
	}

	public Optional<PaymentInstructionExtract> getCorrectionTransaction() {
		return CorrectionTransaction;
	}

	public void setCorrectionTransaction(
			Optional<PaymentInstructionExtract> CorrectionTransaction) {
		this.CorrectionTransaction = CorrectionTransaction;
	}
}