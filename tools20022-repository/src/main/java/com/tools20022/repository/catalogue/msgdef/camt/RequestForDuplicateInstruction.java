package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.dict.msg.CaseAssignment;
import com.tools20022.repository.dict.msg.Case;

/**
 * Scope The Request For Duplicate message is sent by the case assignee to the
 * case creator or case assigner. This message is used to request a copy of the
 * original payment instruction considered in the case. Usage The Request For
 * Duplicate message: - must be answered with a Duplicate message - must be used
 * when a case assignee requests a copy of the original payment instruction.
 * This occurs, for example, when the case assignee cannot trace the payment
 * instruction based on the elements mentioned in the case assignment message -
 * covers one and only one instruction at a time. If several payment instruction
 * copies are needed by the case assignee, then multiple Request For Duplicate
 * messages must be sent - must be used exclusively between the case assignee
 * and its case creator/case assigner
 */
public class RequestForDuplicateInstruction {

	private CaseAssignment Assignment;
	private Case Case;

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
}