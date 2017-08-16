package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Asset;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.entity.Trade;

/**
 * Separate transactions which combined together form a trade.
 */
public class Leg extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Asset RelatedAsset;
	private PercentageRate RatioQuantity;
	private CurrencyCode Currency;
	private Max35Text SwapType;
	private Number Pool;
	private Trade Trade;

	public Asset getRelatedAsset() {
		return RelatedAsset;
	}

	public void setRelatedAsset(Asset RelatedAsset) {
		this.RelatedAsset = RelatedAsset;
	}

	public PercentageRate getRatioQuantity() {
		return RatioQuantity;
	}

	public void setRatioQuantity(PercentageRate RatioQuantity) {
		this.RatioQuantity = RatioQuantity;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public Max35Text getSwapType() {
		return SwapType;
	}

	public void setSwapType(Max35Text SwapType) {
		this.SwapType = SwapType;
	}

	public Number getPool() {
		return Pool;
	}

	public void setPool(Number Pool) {
		this.Pool = Pool;
	}

	public Trade getTrade() {
		return Trade;
	}

	public void setTrade(Trade Trade) {
		this.Trade = Trade;
	}
}