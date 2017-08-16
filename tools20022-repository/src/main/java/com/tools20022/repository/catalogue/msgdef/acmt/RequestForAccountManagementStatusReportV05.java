package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.acmt.RequestForAccountManagementStatusReportV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AccountManagementMessageReference4;

/**
 * Scope The RequestForAccountManagementStatusReport message is sent by an
 * account owner, for example, an investor or its designated agent, to the
 * account servicer, for example, a registrar, transfer agent, custodian bank or
 * securities depository to request the status of an AccountOpeningInstruction,
 * GetAccountDetails or an AccountModificationInstruction. Usage The
 * RequestForAccountManagementStatusReport message is used to request the
 * processing status of a previously sent AccountOpeningInstruction,
 * GetAccountDetails or an AccountModificationInstruction message for which an
 * AccountDetailsConfirmation message has not yet been received.
 */
@PreviousVersion(RequestForAccountManagementStatusReportV04.class)
public class RequestForAccountManagementStatusReportV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private AccountManagementMessageReference4 RequestDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public AccountManagementMessageReference4 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(
			AccountManagementMessageReference4 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}
}