package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.RequestForTransferStatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference1;

/**
 * Scope The RequestForTransferStatusReport is sent by an instructing party to
 * the executing party. This message requests the status of a transfer
 * instruction or the status of a transfer cancellation instruction. Usage The
 * RequestForTransferStatusReport is sent by an instructing party to the
 * executing party to request - the status of one or several transfer
 * instructions or - the status of one or several transfer cancellation
 * instructions.
 */
@NextVersion(RequestForTransferStatusReportV02.class)
public class RequestForTransferStatusReport {

	private MessageAndBusinessReference1 RequestDetails;

	public MessageAndBusinessReference1 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference1 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}
}