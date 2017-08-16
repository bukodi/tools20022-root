package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerAccountReportV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.BankToCustomerAccountReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader42;
import com.tools20022.repository.dict.msg.AccountReport11;

/**
 * Scope The BankToCustomerAccountReport message is sent by the account servicer
 * to an account owner or to a party authorised by the account owner to receive
 * the message. It can be used to inform the account owner, or authorised party,
 * of the entries reported to the account, and/or to provide the owner with
 * balance information on the account at a given point in time. Usage The
 * BankToCustomerAccountReport message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.
 * It can be used to: - report pending and booked items; - provide balance
 * information. It can include underlying details of transactions that have been
 * included in the entry. It is possible that the receiver of the message is not
 * the account owner, but a party entitled by the account owner to receive the
 * account information (also known as recipient). For a statement, the
 * Bank-to-Customer Account Statement message should be used.
 */
@PreviousVersion(BankToCustomerAccountReportV01.class)
@NextVersion(BankToCustomerAccountReportV03.class)
public class BankToCustomerAccountReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader42 GroupHeader;
	private AccountReport11 Report;

	public GroupHeader42 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader42 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public AccountReport11 getReport() {
		return Report;
	}

	public void setReport(AccountReport11 Report) {
		this.Report = Report;
	}
}