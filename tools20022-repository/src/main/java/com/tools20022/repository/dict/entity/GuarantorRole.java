package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.GuaranteePartyRole;
import com.tools20022.repository.dict.datatype.positiveInteger;

/**
 * Legal entity, other than the issuer, who gives a guarantee. The guarantor
 * becomes liable in case of default.
 */
public class GuarantorRole extends GuaranteePartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private positiveInteger Position;

	public positiveInteger getPosition() {
		return Position;
	}

	public void setPosition(positiveInteger Position) {
		this.Position = Position;
	}
}