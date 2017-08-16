package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Amount of money deducted from a price or an amount due.
 */
public class Allowance extends Adjustment
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CurrencyAndAmount TotalAllowance;
	private CurrencyAndAmount NetPriceAllowance;

	public CurrencyAndAmount getTotalAllowance() {
		return TotalAllowance;
	}

	public void setTotalAllowance(CurrencyAndAmount TotalAllowance) {
		this.TotalAllowance = TotalAllowance;
	}

	public CurrencyAndAmount getNetPriceAllowance() {
		return NetPriceAllowance;
	}

	public void setNetPriceAllowance(CurrencyAndAmount NetPriceAllowance) {
		this.NetPriceAllowance = NetPriceAllowance;
	}
}