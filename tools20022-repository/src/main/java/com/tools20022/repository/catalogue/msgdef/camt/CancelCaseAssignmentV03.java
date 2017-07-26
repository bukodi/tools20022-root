package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.CancelCaseAssignmentV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Cancel Case Assignment message is sent by a case creator or case
 * assigner to a case assignee. This message is used to request the cancellation
 * of a case. Usage The Cancel Case Assignment message is used to stop the
 * processing of a case at a case assignee when a case assignment is incorrect
 * or when the root cause for the case disappears (such as the account owner was
 * able to reconcile after sending a Claim Non Receipt message). The Cancel Case
 * Assignment message can be used to stop the processing of a: - request to
 * cancel payment case - request to modify payment case - unable to apply case -
 * claim non receipt case The Cancel Case Assignment message covers one and only
 * one case at a time. If several case assignments need to be cancelled, then
 * multiple Cancel Case Assignment messages must be sent. The Cancel Case
 * Assignment message must be forwarded by all subsequent case assignee(s) in
 * the case processing chain until it reaches the end point. When an agent
 * re-assigns the Cancel Case Assignment to a subsequent case assignee, this
 * agent must send a Notification Of Case Assignment message to its assigner.
 * When the Cancel Case Assignment instruction has been acted upon by the
 * relevant case assignee, a Resolution Of Investigation message is sent to the
 * case assigner or case creator, in reply. The Cancel Case Assignment message
 * must not be used for other purposes. If, for example, a request to modify
 * payment fails, and the case creator requests the cancellation of the payment,
 * then a Customer or FIToFI Payment Cancellation Request message must be used,
 * with the case identification of the original Request To Modify Payment
 * message. In this context it is incorrect to use the Cancel Case Assignment
 * message.
 */
@PreviousVersion(CancelCaseAssignmentV02.class)
public class CancelCaseAssignmentV03 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}