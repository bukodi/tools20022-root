package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.codeset.AccountStatusCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.AccountManagementStatusCode;
import com.tools20022.repository.dict.codeset.EntryStatusCode;
import com.tools20022.repository.dict.codeset.BalanceStatusCode;
import com.tools20022.repository.dict.codeset.ReasonBlockedCode;

/**
 * Specifies the status of an account or the status of the processing of the
 * actions linked to the management of an account.
 */
public class AccountStatus extends Status {

	private Account Account;
	private AccountStatusCode Status;
	private YesNoIndicator Blocked;
	private AccountManagementStatusCode ManagementStatus;
	private EntryStatusCode EntryStatus;
	private BalanceStatusCode BalanceStatus;
	private ReasonBlockedCode BlockedReason;

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public AccountStatusCode getStatus() {
		return Status;
	}

	public void setStatus(AccountStatusCode Status) {
		this.Status = Status;
	}

	public YesNoIndicator getBlocked() {
		return Blocked;
	}

	public void setBlocked(YesNoIndicator Blocked) {
		this.Blocked = Blocked;
	}

	public AccountManagementStatusCode getManagementStatus() {
		return ManagementStatus;
	}

	public void setManagementStatus(AccountManagementStatusCode ManagementStatus) {
		this.ManagementStatus = ManagementStatus;
	}

	public EntryStatusCode getEntryStatus() {
		return EntryStatus;
	}

	public void setEntryStatus(EntryStatusCode EntryStatus) {
		this.EntryStatus = EntryStatus;
	}

	public BalanceStatusCode getBalanceStatus() {
		return BalanceStatus;
	}

	public void setBalanceStatus(BalanceStatusCode BalanceStatus) {
		this.BalanceStatus = BalanceStatus;
	}

	public ReasonBlockedCode getBlockedReason() {
		return BlockedReason;
	}

	public void setBlockedReason(ReasonBlockedCode BlockedReason) {
		this.BlockedReason = BlockedReason;
	}
}