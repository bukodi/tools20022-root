package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.ObligationFulfilment;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;

/**
 * Transaction is paired off and netted against one or more previous
 * transactions.
 */
public class PairOff extends ObligationFulfilment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesQuantity PairedOffQuantity;
	private SecuritiesSettlement RelatedSecuritiesSettlement;

	public SecuritiesQuantity getPairedOffQuantity() {
		return PairedOffQuantity;
	}

	public void setPairedOffQuantity(SecuritiesQuantity PairedOffQuantity) {
		this.PairedOffQuantity = PairedOffQuantity;
	}

	public SecuritiesSettlement getRelatedSecuritiesSettlement() {
		return RelatedSecuritiesSettlement;
	}

	public void setRelatedSecuritiesSettlement(
			SecuritiesSettlement RelatedSecuritiesSettlement) {
		this.RelatedSecuritiesSettlement = RelatedSecuritiesSettlement;
	}
}