package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.InvestigationResolution;
import com.tools20022.repository.dict.codeset.CaseForwardingNotificationCode;
import com.tools20022.repository.dict.entity.InvestigationCase;

/**
 * Action that consists in forwarding an investigation case assignment to
 * another party which becomes the new assignee.
 */
public class Reassignment extends InvestigationResolution {

	private CaseForwardingNotificationCode Justification;
	private InvestigationCase ReassignedCase;

	public CaseForwardingNotificationCode getJustification() {
		return Justification;
	}

	public void setJustification(CaseForwardingNotificationCode Justification) {
		this.Justification = Justification;
	}

	public InvestigationCase getReassignedCase() {
		return ReassignedCase;
	}

	public void setReassignedCase(InvestigationCase ReassignedCase) {
		this.ReassignedCase = ReassignedCase;
	}
}