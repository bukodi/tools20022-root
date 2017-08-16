package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.RequestForDuplicateV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;

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
@NextVersion(RequestForDuplicateV04.class)
public class RequestForDuplicateV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment2 Assignment;
	private Case2 Case;

	public CaseAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Case2 getCase() {
		return Case;
	}

	public void setCase(Case2 Case) {
		this.Case = Case;
	}
}