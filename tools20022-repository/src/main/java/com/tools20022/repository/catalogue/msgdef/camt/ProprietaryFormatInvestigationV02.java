package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.ProprietaryFormatInvestigationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.msg.ProprietaryData4;

/**
 * Scope The Proprietary Format Investigation message type is used by financial
 * institutions, with their own offices, and/or with other financial
 * institutions with which they have established bilateral agreements. Usage The
 * user should ensure that an existing standard message cannot be used before
 * using the proprietary message. As defined in the scope, this
 * ProprietaryFormatInvestigation message may only be used when bilaterally
 * agreed. It is used as an envelope for a non standard message and provides
 * means to manage an exception or investigation which falls outside the scope
 * or capability of any other formatted message.
 */
@NextVersion(ProprietaryFormatInvestigationV03.class)
public class ProprietaryFormatInvestigationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment2 Assignment;
	private Case2 Case;
	private ProprietaryData4 ProprietaryData;

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

	public ProprietaryData4 getProprietaryData() {
		return ProprietaryData;
	}

	public void setProprietaryData(ProprietaryData4 ProprietaryData) {
		this.ProprietaryData = ProprietaryData;
	}
}