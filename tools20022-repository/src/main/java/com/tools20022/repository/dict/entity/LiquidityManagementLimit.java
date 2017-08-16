package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.CashManagementService;
import com.tools20022.repository.dict.codeset.LiquidityLimitTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;

/**
 * Cash management feature limiting the amount of liquidity needed to perform
 * clearing and settlement operations. At any point in time during the process,
 * the limit imposes the maximum amount of liquidity available for operations
 * concerning the system or other managed elements, for example, transaction
 * amount or counterparty.
 */
public class LiquidityManagementLimit extends Limit
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private PercentageRate VolatilityMargin;
	private CurrencyExchange CurrencyExchange;
	private CashManagementService RelatedCashServices;
	private LiquidityLimitTypeCode LiquidityLimitType;
	private CurrencyAndAmount RequiredAmount;

	public PercentageRate getVolatilityMargin() {
		return VolatilityMargin;
	}

	public void setVolatilityMargin(PercentageRate VolatilityMargin) {
		this.VolatilityMargin = VolatilityMargin;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public CashManagementService getRelatedCashServices() {
		return RelatedCashServices;
	}

	public void setRelatedCashServices(CashManagementService RelatedCashServices) {
		this.RelatedCashServices = RelatedCashServices;
	}

	public LiquidityLimitTypeCode getLiquidityLimitType() {
		return LiquidityLimitType;
	}

	public void setLiquidityLimitType(LiquidityLimitTypeCode LiquidityLimitType) {
		this.LiquidityLimitType = LiquidityLimitType;
	}

	public CurrencyAndAmount getRequiredAmount() {
		return RequiredAmount;
	}

	public void setRequiredAmount(CurrencyAndAmount RequiredAmount) {
		this.RequiredAmount = RequiredAmount;
	}
}