package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.codeset.WarrantStyleCode;
import com.tools20022.repository.dict.entity.QuantityRatio;

/**
 * Financial instrument that gives the holder the right to purchase shares or
 * bonds at a given price within a specified time.
 */
public class Warrant extends Security
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesPricing SubscriptionPrice;
	private BaseOneRate Multiplier;
	private WarrantStyleCode Style;
	private QuantityRatio WarrantParity;

	public SecuritiesPricing getSubscriptionPrice() {
		return SubscriptionPrice;
	}

	public void setSubscriptionPrice(SecuritiesPricing SubscriptionPrice) {
		this.SubscriptionPrice = SubscriptionPrice;
	}

	public BaseOneRate getMultiplier() {
		return Multiplier;
	}

	public void setMultiplier(BaseOneRate Multiplier) {
		this.Multiplier = Multiplier;
	}

	public WarrantStyleCode getStyle() {
		return Style;
	}

	public void setStyle(WarrantStyleCode Style) {
		this.Style = Style;
	}

	public QuantityRatio getWarrantParity() {
		return WarrantParity;
	}

	public void setWarrantParity(QuantityRatio WarrantParity) {
		this.WarrantParity = WarrantParity;
	}
}