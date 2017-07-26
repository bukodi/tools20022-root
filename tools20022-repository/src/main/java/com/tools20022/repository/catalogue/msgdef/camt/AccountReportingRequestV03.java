package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.AccountReportingRequestV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.GroupHeader59;
import com.tools20022.repository.dict.msg.ReportingRequest3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The AccountReportingRequest message is sent by the account owner,
 * either directly or through a forwarding agent, to one of its account
 * servicing institutions. It is used to ask the account servicing institution
 * to send a report on the account owner's account in a
 * BankToCustomerAccountReport (camt.052.001.03), a BankToCustomerStatement
 * (camt.053.001.03) or a BankToCustomerDebitCreditNotification
 * (camt.054.001.03). Usage The AccountReportingRequest message is used to
 * advise the account servicing institution of funds that the account owner
 * expects to have credited to its account. The message can be used in either a
 * direct or a relay scenario.
 */
@PreviousVersion(AccountReportingRequestV02.class)
public class AccountReportingRequestV03 {

	private GroupHeader59 GroupHeader;
	private ReportingRequest3 ReportingRequest;
	private Optional<SupplementaryData1> SupplementaryData;

	public GroupHeader59 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader59 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public ReportingRequest3 getReportingRequest() {
		return ReportingRequest;
	}

	public void setReportingRequest(ReportingRequest3 ReportingRequest) {
		this.ReportingRequest = ReportingRequest;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}