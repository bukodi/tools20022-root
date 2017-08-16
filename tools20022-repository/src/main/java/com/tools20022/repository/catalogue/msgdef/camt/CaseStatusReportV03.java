package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.CaseStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReportHeader2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.msg.CaseStatus2;
import com.tools20022.repository.dict.msg.CaseAssignment2;
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
 * Investigation message when the request for a investigation status is received
 * at the time the assigner has resolved the case. (In this case a Resolution Of
 * Investigation message can be sent instead of a Case Status Report and the
 * case may be closed.)
 */
@NextVersion(CaseStatusReportV04.class)
public class CaseStatusReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportHeader2 Header;
	private Case2 Case;
	private CaseStatus2 Status;
	private Optional<CaseAssignment2> NewAssignment;

	public ReportHeader2 getHeader() {
		return Header;
	}

	public void setHeader(ReportHeader2 Header) {
		this.Header = Header;
	}

	public Case2 getCase() {
		return Case;
	}

	public void setCase(Case2 Case) {
		this.Case = Case;
	}

	public CaseStatus2 getStatus() {
		return Status;
	}

	public void setStatus(CaseStatus2 Status) {
		this.Status = Status;
	}

	public Optional<CaseAssignment2> getNewAssignment() {
		return NewAssignment;
	}

	public void setNewAssignment(Optional<CaseAssignment2> NewAssignment) {
		this.NewAssignment = NewAssignment;
	}
}