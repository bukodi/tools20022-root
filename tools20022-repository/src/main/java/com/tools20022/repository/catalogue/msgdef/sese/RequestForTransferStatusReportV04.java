package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.RequestForTransferStatusReportV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.RequestForTransferStatusReportV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference7;
import com.tools20022.repository.dict.msg.MarketPracticeVersion1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the RequestForTransferStatusReport to the
 * executing party, for example, a transfer agent to request the status of a
 * previously instructed transfer. Usage The RequestForTransferStatusReport is
 * used to request either: - the status of one or several transfer instructions
 * or, - the status of one or several transfer cancellation instructions.
 */
@PreviousVersion(RequestForTransferStatusReportV03.class)
@NextVersion(RequestForTransferStatusReportV05.class)
public class RequestForTransferStatusReportV04 {

	private MessageIdentification1 MessageIdentification;
	private MessageAndBusinessReference7 RequestDetails;
	private Optional<MarketPracticeVersion1> MarketPracticeVersion;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public MessageAndBusinessReference7 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference7 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return MarketPracticeVersion;
	}

	public void setMarketPracticeVersion(
			Optional<MarketPracticeVersion1> MarketPracticeVersion) {
		this.MarketPracticeVersion = MarketPracticeVersion;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}