package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesPartyRole;
import com.tools20022.repository.dict.codeset.PledgeeTypeCode;
import com.tools20022.repository.dict.entity.SecuritiesBalance;

/**
 * Organisation used as the pledgee for the securities.
 */
public class Pledgee extends SecuritiesPartyRole
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PledgeeTypeCode PledgeeType;
	private SecuritiesBalance SecuritiesBalance;

	public PledgeeTypeCode getPledgeeType() {
		return PledgeeType;
	}

	public void setPledgeeType(PledgeeTypeCode PledgeeType) {
		this.PledgeeType = PledgeeType;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}
}