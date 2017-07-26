package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.RejectInvestigationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.InvestigationRejectionJustification1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Reject Investigation message is sent by a case assignee to a case
 * creator or case assigner to reject a case given to him. Usage The Reject
 * Investigation message is used to notify the case creator or case assigner the
 * rejection of an assignment by the case assignee in a: - request to cancel
 * payment case - request to modify payment case - unable to apply case - claim
 * non receipt case Rejecting a case assignment occurs when: - the case assignee
 * is unable to trace the original payment instruction - the case assignee is
 * unable, or does not have authority, to process the assigned case (indicate
 * "You have by-passed a party", - the case assignee has received a non expected
 * message, and rejects the message with a wrong message indicator - the case
 * assignee has not yet received the Resolution Of Investigation message and the
 * case has already been reopened - the case assignee has rejects an non-cash
 * related query The Reject Investigation message covers one and only one case
 * at a time. If the case assignee needs to reject several case assignments,
 * then multiple Reject Investigation messages must be sent. The Reject
 * Investigation message must be forwarded by all subsequent case assignee(s)
 * until it reaches the case assigner and must not be used in place of a
 * Resolution Of Investigation or Case Status Report message.
 */
@PreviousVersion(RejectInvestigationV03.class)
public class RejectInvestigationV04 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private InvestigationRejectionJustification1 Justification;
	private Optional<SupplementaryData1> SupplementaryData;

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public Case3 getCase() {
		return Case;
	}

	public void setCase(Case3 Case) {
		this.Case = Case;
	}

	public InvestigationRejectionJustification1 getJustification() {
		return Justification;
	}

	public void setJustification(
			InvestigationRejectionJustification1 Justification) {
		this.Justification = Justification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}