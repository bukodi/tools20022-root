package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SystemPartyRole;
import com.tools20022.repository.dict.entity.CashBalance;
import com.tools20022.repository.dict.codeset.MemberTypeCode;
import com.tools20022.repository.dict.entity.SystemStatus;
import com.tools20022.repository.dict.entity.RiskManagementLimit;
import com.tools20022.repository.dict.entity.Account;

/**
 * Information about the members of a system.
 */
public class SystemMemberRole extends SystemPartyRole {

	private CashBalance CashBalance;
	private MemberTypeCode Type;
	private SystemStatus MemberStatus;
	private RiskManagementLimit Limit;
	private Account Account;

	public CashBalance getCashBalance() {
		return CashBalance;
	}

	public void setCashBalance(CashBalance CashBalance) {
		this.CashBalance = CashBalance;
	}

	public MemberTypeCode getType() {
		return Type;
	}

	public void setType(MemberTypeCode Type) {
		this.Type = Type;
	}

	public SystemStatus getMemberStatus() {
		return MemberStatus;
	}

	public void setMemberStatus(SystemStatus MemberStatus) {
		this.MemberStatus = MemberStatus;
	}

	public RiskManagementLimit getLimit() {
		return Limit;
	}

	public void setLimit(RiskManagementLimit Limit) {
		this.Limit = Limit;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}
}