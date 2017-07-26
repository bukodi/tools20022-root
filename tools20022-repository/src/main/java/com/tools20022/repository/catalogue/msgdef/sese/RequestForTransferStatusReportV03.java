package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.RequestForTransferStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.RequestForTransferStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference6;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the RequestForTransferStatusReport to the
 * executing party, for example, a transfer agent to request the status of a
 * previously instructed transfer. Usage The RequestForTransferStatusReport is
 * used to request either: - the status of one or several transfer instructions
 * or, - the status of one or several transfer cancellation instructions.
 */
@PreviousVersion(RequestForTransferStatusReportV02.class)
@NextVersion(RequestForTransferStatusReportV04.class)
public class RequestForTransferStatusReportV03 {

	private MessageIdentification1 MessageIdentification;
	private MessageAndBusinessReference6 RequestDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public MessageAndBusinessReference6 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference6 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}