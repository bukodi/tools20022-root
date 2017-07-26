package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SettlementPartyRole;
import com.tools20022.repository.dict.entity.CashAccount;
import com.tools20022.repository.dict.entity.CashSettlement;

/**
 * Role played by a party in cash settlement.
 */
public class CashSettlementInstructionPartyRole extends SettlementPartyRole {

	private CashAccount CashAccount;
	private CashSettlement SettlementInstruction;

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}

	public CashSettlement getSettlementInstruction() {
		return SettlementInstruction;
	}

	public void setSettlementInstruction(CashSettlement SettlementInstruction) {
		this.SettlementInstruction = SettlementInstruction;
	}
}