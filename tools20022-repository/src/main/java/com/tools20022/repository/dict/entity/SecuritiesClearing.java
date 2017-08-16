package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Clearing;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.BuyIn;
import com.tools20022.repository.dict.entity.Novation;
import com.tools20022.repository.dict.entity.Netting;

/**
 * Process of settling securities through a central system.
 */
public class SecuritiesClearing extends Clearing
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesSettlement SecuritiesSettlement;
	private BuyIn BuyIn;
	private Novation Novation;
	private Netting Netting;

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public BuyIn getBuyIn() {
		return BuyIn;
	}

	public void setBuyIn(BuyIn BuyIn) {
		this.BuyIn = BuyIn;
	}

	public Novation getNovation() {
		return Novation;
	}

	public void setNovation(Novation Novation) {
		this.Novation = Novation;
	}

	public Netting getNetting() {
		return Netting;
	}

	public void setNetting(Netting Netting) {
		this.Netting = Netting;
	}
}