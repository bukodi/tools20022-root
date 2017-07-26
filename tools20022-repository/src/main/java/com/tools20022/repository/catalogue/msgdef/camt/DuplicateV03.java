package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.DuplicateV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.msg.ProprietaryData4;

/**
 * Scope The Duplicate message is used by financial institutions, with their own
 * offices, and/or with other financial institutions with which they have
 * established bilateral agreements. It allows to exchange duplicate payment
 * instructions. Usage This message must be sent in response to a Request For
 * Duplicate message. The Duplicate Data element must contain a well formed XML
 * document. This means XML special characters such as '&lt;' must be used in a
 * way that is consistent with XML well-formedness criteria.
 */
@NextVersion(DuplicateV04.class)
public class DuplicateV03 {

	private CaseAssignment2 Assignment;
	private Case2 Case;
	private ProprietaryData4 Duplicate;

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

	public ProprietaryData4 getDuplicate() {
		return Duplicate;
	}

	public void setDuplicate(ProprietaryData4 Duplicate) {
		this.Duplicate = Duplicate;
	}
}