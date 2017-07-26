package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerAccountReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader23;
import com.tools20022.repository.dict.msg.AccountReport9;

/**
 * Scope The Bank-to-Customer Account Report message is sent by the account
 * servicer to an account owner or to a party authorised by the account owner to
 * receive the message. It can be used to inform the account owner, or
 * authorised party, of the entries reported to the account, and/or to provide
 * the owner with balance information on the account at a given point in time.
 * Usage The Bank-to-Customer Account Report message can contain reports for
 * more than 1 account. It provides information for cash management and/or
 * reconciliation. It can be used to : - report pending and booked items; -
 * provide balance information It can include underlying details of transactions
 * that have been included in the entry. It is possible that the receiver of the
 * message is not the account owner, but a party entitled by the account owner
 * to receive the account information (also known as recipient). For a statement
 * that is required due to local legal stipulations, the Bank-to-Customer
 * Account Statement message should be used.
 */
@NextVersion(BankToCustomerAccountReportV02.class)
public class BankToCustomerAccountReportV01 {

	private GroupHeader23 GroupHeader;
	private AccountReport9 Report;

	public GroupHeader23 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader23 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountReport9 getReport() {
		return Report;
	}

	public void setReport(AccountReport9 Report) {
		this.Report = Report;
	}
}