package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Role;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Settlement;

/**
 * Role played by a party in a settlement process.
 */
public class SettlementPartyRole extends Role {

	private Account SettlementAccount;
	private Settlement Settlement;

	public Account getSettlementAccount() {
		return SettlementAccount;
	}

	public void setSettlementAccount(Account SettlementAccount) {
		this.SettlementAccount = SettlementAccount;
	}

	public Settlement getSettlement() {
		return Settlement;
	}

	public void setSettlement(Settlement Settlement) {
		this.Settlement = Settlement;
	}
}