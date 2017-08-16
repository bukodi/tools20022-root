package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.DuplicateV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.msg.ProprietaryData4;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Duplicate message is used by financial institutions, with their own
 * offices, and/or with other financial institutions with which they have
 * established bilateral agreements. It allows to exchange duplicate payment
 * instructions. Usage This message must be sent in response to a Request For
 * Duplicate message. The Duplicate Data element must contain a well formed XML
 * document. This means XML special characters such as '&lt;' must be used in a
 * way that is consistent with XML well-formedness criteria.
 */
@PreviousVersion(DuplicateV03.class)
public class DuplicateV04 implements GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private ProprietaryData4 Duplicate;
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

	public ProprietaryData4 getDuplicate() {
		return Duplicate;
	}

	public void setDuplicate(ProprietaryData4 Duplicate) {
		this.Duplicate = Duplicate;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}