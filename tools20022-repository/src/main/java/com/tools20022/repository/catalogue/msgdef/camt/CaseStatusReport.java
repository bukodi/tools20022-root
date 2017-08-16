package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ReportHeader;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.CaseStatus;
import com.tools20022.repository.dict.msg.CaseAssignment;
import java.util.Optional;

/**
 * Scope The Case Status Report message is sent by a case assignee to a case
 * creator or case assigner. This message is used to report on the status of a
 * case. Usage A Case Status Report message is sent in reply to a Case Status
 * Report Request message. This message - covers one and only one case at a
 * time. (If a case assignee needs to report on several cases, then multiple
 * Case Status Report messages must be sent.) - may be forwarded to subsequent
 * case assigner(s) until it reaches the end point - is able to indicate the
 * fact that a case has been assigned to a party downstream in the payment
 * processing chain - may not be used in place of a Resolution Of Investigation
 * (except for the condition given in the next bullet point) or Notification Of
 * Case Assignment message - may be skipped and replaced by a Resolution Of
 * Investigation message if at the moment when the request for a investigation
 * status arrives, the assignee has obtained a solution. (In this case a
 * Resolution Of Investigation message can be sent in lieu of a Case Status
 * Report and the case may be closed.)
 */
public class CaseStatusReport implements GeneratedRepoBean<MMMessageDefinition> {

	private ReportHeader Header;
	private Case Case;
	private CaseStatus Status;
	private Optional<CaseAssignment> NewAssignment;

	public ReportHeader getHeader() {
		return Header;
	}

	public void setHeader(ReportHeader Header) {
		this.Header = Header;
	}

	public Case getCase() {
		return Case;
	}

	public void setCase(Case Case) {
		this.Case = Case;
	}

	public CaseStatus getStatus() {
		return Status;
	}

	public void setStatus(CaseStatus Status) {
		this.Status = Status;
	}

	public Optional<CaseAssignment> getNewAssignment() {
		return NewAssignment;
	}

	public void setNewAssignment(Optional<CaseAssignment> NewAssignment) {
		this.NewAssignment = NewAssignment;
	}
}