package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Fee charged when the conditions of a contract are not met.
 */
public class Penalty extends Adjustment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount PenaltyBasisAmount;

	public CurrencyAndAmount getPenaltyBasisAmount() {
		return PenaltyBasisAmount;
	}

	public void setPenaltyBasisAmount(CurrencyAndAmount PenaltyBasisAmount) {
		this.PenaltyBasisAmount = PenaltyBasisAmount;
	}
}