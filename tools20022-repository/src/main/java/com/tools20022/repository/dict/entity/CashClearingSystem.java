package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ClearingSystem;
import com.tools20022.repository.dict.codeset.CashClearingSystemCode;
import com.tools20022.repository.dict.entity.TransactionAdministrator;
import com.tools20022.repository.dict.entity.SettlementInstructionSystemRole;
import com.tools20022.repository.dict.codeset.CashSystemTypeCode;
import com.tools20022.repository.dict.codeset.CashSettlementSystemCode;

/**
 * Clearing system that processes only cash transfers.
 */
public class CashClearingSystem extends ClearingSystem {

	private CashClearingSystemCode Identification;
	private TransactionAdministrator TransactionAdministrator;
	private SettlementInstructionSystemRole SystemRole;
	private CashSystemTypeCode Type;
	private CashSettlementSystemCode CashSettlementSystem;

	public CashClearingSystemCode getIdentification() {
		return Identification;
	}

	public void setIdentification(CashClearingSystemCode Identification) {
		this.Identification = Identification;
	}

	public TransactionAdministrator getTransactionAdministrator() {
		return TransactionAdministrator;
	}

	public void setTransactionAdministrator(
			TransactionAdministrator TransactionAdministrator) {
		this.TransactionAdministrator = TransactionAdministrator;
	}

	public SettlementInstructionSystemRole getSystemRole() {
		return SystemRole;
	}

	public void setSystemRole(SettlementInstructionSystemRole SystemRole) {
		this.SystemRole = SystemRole;
	}

	public CashSystemTypeCode getType() {
		return Type;
	}

	public void setType(CashSystemTypeCode Type) {
		this.Type = Type;
	}

	public CashSettlementSystemCode getCashSettlementSystem() {
		return CashSettlementSystem;
	}

	public void setCashSettlementSystem(
			CashSettlementSystemCode CashSettlementSystem) {
		this.CashSettlementSystem = CashSettlementSystem;
	}
}