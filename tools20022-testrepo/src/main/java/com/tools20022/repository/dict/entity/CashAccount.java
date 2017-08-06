package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.CashAccountTypeCode;
import com.tools20022.repository.dict.codeset.AccountLevelCode;
import com.tools20022.repository.dict.codeset.CurrencyCode;

/**
 * Account to or from which a cash entry is made.
 */
public class CashAccount {

	private CashAccountTypeCode CashAccountType;
	private AccountLevelCode Level;
	private CurrencyCode SettlementCurrency;

	public CashAccountTypeCode getCashAccountType() {
		return CashAccountType;
	}

	public void setCashAccountType(CashAccountTypeCode CashAccountType) {
		this.CashAccountType = CashAccountType;
	}

	public AccountLevelCode getLevel() {
		return Level;
	}

	public void setLevel(AccountLevelCode Level) {
		this.Level = Level;
	}

	public CurrencyCode getSettlementCurrency() {
		return SettlementCurrency;
	}

	public void setSettlementCurrency(CurrencyCode SettlementCurrency) {
		this.SettlementCurrency = SettlementCurrency;
	}
}