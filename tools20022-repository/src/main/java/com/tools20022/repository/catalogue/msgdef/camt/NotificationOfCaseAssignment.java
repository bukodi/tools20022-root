package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ReportHeader;
import com.tools20022.repository.dict.msg.Case;
import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.CaseForwardingNotification;

/**
 * Scope The Notification Of Case Assignment message is sent by a case assignee
 * to a case creator/case assigner. This message is used to inform the case
 * assigner that: - the assignee is reassigning the case to the next agent in
 * the transaction processing chain for further action - the assignee will work
 * on the case himself, without re-assigning it to another party, and therefore
 * indicating that the re-assignment has reached its end-point Usage The
 * Notification Of Case Assignment message is used to notify the case creator or
 * case assigner of further action undertaken by the case assignee in a: -
 * request to cancel payment case - request to modify payment case - unable to
 * apply case - claim non receipt case The Notification Of Case Assignment
 * message - covers one and only one case at a time. If the case assignee needs
 * to inform a case creator or case assigner about several cases, then multiple
 * Notification Of Case Assignment messages must be sent - except in the case
 * where it is used to indicate that an agent is doing the correction himself,
 * this message must be forwarded by all subsequent case assigner(s) until it
 * reaches the case creator - must not be used in place of a Resolution Of
 * Investigation or a Case Status Report message.
 */
public class NotificationOfCaseAssignment
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportHeader Header;
	private Case Case;
	private CaseAssignment Assignment;
	private CaseForwardingNotification Notification;

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

	public CaseAssignment getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment Assignment) {
		this.Assignment = Assignment;
	}

	public CaseForwardingNotification getNotification() {
		return Notification;
	}

	public void setNotification(CaseForwardingNotification Notification) {
		this.Notification = Notification;
	}
}