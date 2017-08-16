package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.AccountReportingRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.GroupHeader43;
import com.tools20022.repository.dict.msg.ReportingRequest2;

/**
 * Scope The AccountReportingRequest message is sent by the account owner,
 * either directly or through a forwarding agent, to one of its account
 * servicing institutions. It is used to ask the account servicing institution
 * to send a report on the account owner's account in a
 * BankToCustomerAccountReport (camt.052.001.02), a BankToCustomerStatement
 * (camt.053.001.02) or a BankToCustomerDebitCreditNotification
 * (camt.054.001.02). Usage The AccountReportingRequest message is used to
 * advise the account servicing institution of funds that the account owner
 * expects to have credited to its account. The message can be used in either a
 * direct or a relay scenario.
 */
@NextVersion(AccountReportingRequestV03.class)
public class AccountReportingRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private GroupHeader43 GroupHeader;
	private ReportingRequest2 ReportingRequest;

	public GroupHeader43 getGroupHeader() {
		return GroupHeader;
	}

	public void setGroupHeader(GroupHeader43 GroupHeader) {
		this.GroupHeader = GroupHeader;
	}

	public ReportingRequest2 getReportingRequest() {
		return ReportingRequest;
	}

	public void setReportingRequest(ReportingRequest2 ReportingRequest) {
		this.ReportingRequest = ReportingRequest;
	}
}