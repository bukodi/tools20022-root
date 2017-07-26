package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.CaseAssignmentRejectionJustification;

/**
 * Scope The Reject Case Assignment message is sent by a case assignee to a case
 * creator or case assigner to reject a case given to him. Usage The Reject Case
 * Assignment message is used to notify the case creator or case assigner the
 * rejection of an assignment by the case assignee in a: - request to cancel
 * payment case - request to modify payment case - unable to apply case - claim
 * non receipt case Rejecting a case assignment occurs when the case assignee is
 * unable to trace the original payment instruction or when the case assignee is
 * unable, or does not have authority, to process the assigned case. The Reject
 * Case Assignment message covers one and only one case at a time. If the case
 * assignee needs to reject several case assignments, then multiple Reject Case
 * Assignment messages must be sent. The Reject Case Assignment message must be
 * forwarded by all subsequent case assignee(s) until it reaches the case
 * assigner. The Reject Case Assignment message must not be used in place of a
 * Resolution Of Investigation or Case Status Report message.
 */
public class RejectCaseAssignment {

	private CaseAssignment Assignment;
	private Case Case;
	private CaseAssignmentRejectionJustification Justification;

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

	public CaseAssignmentRejectionJustification getJustification() {
		return Justification;
	}

	public void setJustification(
			CaseAssignmentRejectionJustification Justification) {
		this.Justification = Justification;
	}
}