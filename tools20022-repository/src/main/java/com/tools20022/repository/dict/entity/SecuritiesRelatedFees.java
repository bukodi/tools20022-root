package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Charges;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Fees related to securities trades.
 */
public class SecuritiesRelatedFees extends Charges
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Security Security;
	private CurrencyAndAmount PostageFeeAmount;
	private CurrencyAndAmount RegulatoryFeesAmount;
	private CurrencyAndAmount ShippingFeesAmount;

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public CurrencyAndAmount getPostageFeeAmount() {
		return PostageFeeAmount;
	}

	public void setPostageFeeAmount(CurrencyAndAmount PostageFeeAmount) {
		this.PostageFeeAmount = PostageFeeAmount;
	}

	public CurrencyAndAmount getRegulatoryFeesAmount() {
		return RegulatoryFeesAmount;
	}

	public void setRegulatoryFeesAmount(CurrencyAndAmount RegulatoryFeesAmount) {
		this.RegulatoryFeesAmount = RegulatoryFeesAmount;
	}

	public CurrencyAndAmount getShippingFeesAmount() {
		return ShippingFeesAmount;
	}

	public void setShippingFeesAmount(CurrencyAndAmount ShippingFeesAmount) {
		this.ShippingFeesAmount = ShippingFeesAmount;
	}
}