package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.RequestForOrderStatusReportV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference2;

/**
 * Scope The RequestForOrderStatusReport is sent by an instructing party, eg, an
 * investment manager or its authorised representative, to the executing party,
 * eg, a transfer agent. There may be one or more intermediary parties between
 * the instructing party and the executing party. This message requests the
 * status of one or several order instruction or order cancellation messages.
 * Usage The RequestForOrderStatusReport message is used to request the status
 * of: - one or several order messages, - one or several cancellation messages,
 * - one or several individual orders within a bulk or multiple order message.
 * If the RequestForOrderStatusReport message is used to request the status of
 * several messages, then the instructing party will receive several reply
 * messages from the executing party, ie, several OrderInstructionStatusReport
 * messages and/or OrderCancellationStatusReport messages. The number of reply
 * messages will match the number of references stated in the
 * RequestForOrderStatusReport message. The RequestForOrderStatusReport message
 * may not be used to request the status of an investment account, a transfer or
 * the status of a financial instrument.
 */
@NextVersion(RequestForOrderStatusReportV03.class)
public class RequestForOrderStatusReportV02 {

	private MessageAndBusinessReference2 RequestDetails;

	public MessageAndBusinessReference2 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference2 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}
}