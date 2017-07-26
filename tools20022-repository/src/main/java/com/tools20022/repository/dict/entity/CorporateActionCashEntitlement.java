package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.CorporateActionEntitlement;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.CurrencyExchange;

/**
 * Rights for cash entitled to the account owner based on the terms of the
 * corporate action event and the balance of underlying securities.
 */
public class CorporateActionCashEntitlement extends CorporateActionEntitlement {

	private CurrencyAndAmount GrossCashAmount;
	private CurrencyAndAmount NetCashAmount;
	private CurrencyAndAmount CashInLieuOfShare;
	private CurrencyAndAmount CapitalGain;
	private CurrencyAndAmount EntitledCashAmount;
	private CurrencyExchange ExchangeRate;

	public CurrencyAndAmount getGrossCashAmount() {
		return GrossCashAmount;
	}

	public void setGrossCashAmount(CurrencyAndAmount GrossCashAmount) {
		this.GrossCashAmount = GrossCashAmount;
	}

	public CurrencyAndAmount getNetCashAmount() {
		return NetCashAmount;
	}

	public void setNetCashAmount(CurrencyAndAmount NetCashAmount) {
		this.NetCashAmount = NetCashAmount;
	}

	public CurrencyAndAmount getCashInLieuOfShare() {
		return CashInLieuOfShare;
	}

	public void setCashInLieuOfShare(CurrencyAndAmount CashInLieuOfShare) {
		this.CashInLieuOfShare = CashInLieuOfShare;
	}

	public CurrencyAndAmount getCapitalGain() {
		return CapitalGain;
	}

	public void setCapitalGain(CurrencyAndAmount CapitalGain) {
		this.CapitalGain = CapitalGain;
	}

	public CurrencyAndAmount getEntitledCashAmount() {
		return EntitledCashAmount;
	}

	public void setEntitledCashAmount(CurrencyAndAmount EntitledCashAmount) {
		this.EntitledCashAmount = EntitledCashAmount;
	}

	public CurrencyExchange getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(CurrencyExchange ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}
}