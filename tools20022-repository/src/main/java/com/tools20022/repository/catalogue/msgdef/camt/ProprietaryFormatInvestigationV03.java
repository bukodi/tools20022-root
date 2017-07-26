package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.ProprietaryFormatInvestigationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.ProprietaryData4;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Proprietary Format Investigation message type is used by financial
 * institutions, with their own offices, and/or with other financial
 * institutions with which they have established bilateral agreements. Usage The
 * user should ensure that an existing standard message cannot be used before
 * using the proprietary message. As defined in the scope, this
 * ProprietaryFormatInvestigation message may only be used when bilaterally
 * agreed. It is used as an envelope for a non standard message and provides
 * means to manage an exception or investigation which falls outside the scope
 * or capability of any other formatted message. The ProprietaryData element
 * must contain a well formed XML document. This means XML special characters
 * such as '&lt;' must be used in a way that is consistent with XML
 * well-formedness criteria.
 */
@PreviousVersion(ProprietaryFormatInvestigationV02.class)
public class ProprietaryFormatInvestigationV03 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private ProprietaryData4 ProprietaryData;
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

	public ProprietaryData4 getProprietaryData() {
		return ProprietaryData;
	}

	public void setProprietaryData(ProprietaryData4 ProprietaryData) {
		this.ProprietaryData = ProprietaryData;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}