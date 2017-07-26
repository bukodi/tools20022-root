package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.RequestForAccountManagementStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.RequestForAccountManagementStatusReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AccountManagementMessageReference3;

/**
 * Scope An account owner, for example, an investor or its designated agent,
 * sends the RequestForAccountManagementStatusReport message to the account
 * servicer, for example, a registrar, transfer agent, custodian bank or
 * securities depository to request the status of an AccountOpeningInstruction,
 * GetAccountDetails or an AccountModificationInstruction. Usage The
 * RequestForAccountManagementStatusReport message is used to request the
 * processing status of a previously sent AccountOpeningInstruction message or
 * AccountModificationInstruction message for which a AccountDetailsConfirmation
 * message has not yet been received.
 */
@PreviousVersion(RequestForAccountManagementStatusReportV03.class)
@NextVersion(RequestForAccountManagementStatusReportV05.class)
public class RequestForAccountManagementStatusReportV04 {

	private MessageIdentification1 MessageIdentification;
	private AccountManagementMessageReference3 RequestDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public AccountManagementMessageReference3 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(
			AccountManagementMessageReference3 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}
}