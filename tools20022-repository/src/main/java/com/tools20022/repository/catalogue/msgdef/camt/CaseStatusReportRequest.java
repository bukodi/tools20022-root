package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.CaseStatusReportRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.ReportHeader;
import com.tools20022.repository.dict.msg.Case;

/**
 * Scope The Case Status Report Request message is sent by a case creator or
 * case assigner to a case assignee. This message is used to request the status
 * of a case. Usage The Case Status Report Request message must be answered with
 * a Case Status Report message. It can be used to request the status of a: -
 * request to cancel payment case - request to modify payment case - unable to
 * apply case - claim non receipt case The Case Status Report Request message
 * covers one and only one case at a time. If a case creator or case assigner
 * needs the status of several cases, then multiple Case Status Report Request
 * messages must be sent. The Case Status Report Request message may be
 * forwarded to subsequent case assignee(s) in the case processing chain. The
 * processing of a case generates Notification Of Case Assignment and/or
 * Resolution Of Investigation messages to the case creator/case assigner. They
 * alone should provide collaborating parties sufficient information about the
 * progress of the investigation. The Case Status Report Request must therefore
 * only be used when no information has been received from the case assignee
 * within the expected time frame. An agent may suspense an investigation by
 * classifying it as overdue if he, after sending the request for status, does
 * not receive any response after a long time. Agents may set their individual
 * threshold wait-time.
 */
@NextVersion(CaseStatusReportRequestV02.class)
public class CaseStatusReportRequest
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportHeader RequestHeader;
	private Case Case;

	public ReportHeader getRequestHeader() {
		return RequestHeader;
	}

	public void setRequestHeader(ReportHeader RequestHeader) {
		this.RequestHeader = RequestHeader;
	}

	public Case getCase() {
		return Case;
	}

	public void setCase(Case Case) {
		this.Case = Case;
	}
}