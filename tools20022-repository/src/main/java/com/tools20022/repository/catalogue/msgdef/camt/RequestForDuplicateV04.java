package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.RequestForDuplicateV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
@PreviousVersion(RequestForDuplicateV03.class)
public class RequestForDuplicateV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

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