package com.tools20022.repository.catalogue.msgdef.acmt;

import com.tools20022.repository.catalogue.msgdef.acmt.RequestForAccountManagementStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.acmt.RequestForAccountManagementStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AccountManagementMessageReference2;

/**
 * Scope An account owner, for example, an investor or its designated agent,
 * sends the RequestForAccountManagementStatusReport message to the account
 * servicer, for example, a registrar, transfer agent or custodian bank to
 * request the status of an AccountOpeningInstruction or an
 * AccountModificationInstruction. Usage The
 * RequestForAccountManagementStatusReport message is used to request the
 * processing status of a previously sent AccountOpeningInstruction message or
 * AccountModificationInstruction message for which a AccountDetailsConfirmation
 * message has not yet been received.
 */
@PreviousVersion(RequestForAccountManagementStatusReportV02.class)
@NextVersion(RequestForAccountManagementStatusReportV04.class)
public class RequestForAccountManagementStatusReportV03 {

	private MessageIdentification1 MessageIdentification;
	private AccountManagementMessageReference2 RequestDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public AccountManagementMessageReference2 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(
			AccountManagementMessageReference2 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}
}