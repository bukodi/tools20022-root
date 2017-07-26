package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.CashClearingSystem;
import com.tools20022.repository.dict.codeset.CurrencyCode;
import com.tools20022.repository.dict.entity.CurrencyExchange;
import com.tools20022.repository.dict.entity.CashManagementService;
import com.tools20022.repository.dict.entity.CashSettlement;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing and settlement.
 */
public class TransactionAdministrator extends SystemPartyRole {

	private CashClearingSystem CashClearingSystem;
	private CurrencyCode Currency;
	private CurrencyExchange CurrencyExchange;
	private CashManagementService CashManagementService;
	private CashSettlement SettlementInstruction;

	public CashClearingSystem getCashClearingSystem() {
		return CashClearingSystem;
	}

	public void setCashClearingSystem(CashClearingSystem CashClearingSystem) {
		this.CashClearingSystem = CashClearingSystem;
	}

	public CurrencyCode getCurrency() {
		return Currency;
	}

	public void setCurrency(CurrencyCode Currency) {
		this.Currency = Currency;
	}

	public CurrencyExchange getCurrencyExchange() {
		return CurrencyExchange;
	}

	public void setCurrencyExchange(CurrencyExchange CurrencyExchange) {
		this.CurrencyExchange = CurrencyExchange;
	}

	public CashManagementService getCashManagementService() {
		return CashManagementService;
	}

	public void setCashManagementService(
			CashManagementService CashManagementService) {
		this.CashManagementService = CashManagementService;
	}

	public CashSettlement getSettlementInstruction() {
		return SettlementInstruction;
	}

	public void setSettlementInstruction(CashSettlement SettlementInstruction) {
		this.SettlementInstruction = SettlementInstruction;
	}
}