package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.NotificationOfCaseAssignmentV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.ReportHeader4;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.CaseForwardingNotification3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
 * Investigation or a Case Status Report message When the assignee does not
 * reassign the case to another party (that is responding with a Notification Of
 * Case Assignment message with notification MINE - The case is processed by the
 * assignee), the case assignment should contain the case assignment elements as
 * received in the original query.
 */
@PreviousVersion(NotificationOfCaseAssignmentV03.class)
public class NotificationOfCaseAssignmentV04 {

	private ReportHeader4 Header;
	private Case3 Case;
	private CaseAssignment3 Assignment;
	private CaseForwardingNotification3 Notification;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportHeader4 getHeader() {
		return Header;
	}

	public void setHeader(ReportHeader4 Header) {
		this.Header = Header;
	}

	public Case3 getCase() {
		return Case;
	}

	public void setCase(Case3 Case) {
		this.Case = Case;
	}

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public CaseForwardingNotification3 getNotification() {
		return Notification;
	}

	public void setNotification(CaseForwardingNotification3 Notification) {
		this.Notification = Notification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}