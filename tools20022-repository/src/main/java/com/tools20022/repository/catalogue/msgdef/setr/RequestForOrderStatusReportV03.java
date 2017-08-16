package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RequestForOrderStatusReportV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.RequestForOrderStatusReportV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference4;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the RequestForOrderStatusReport to the
 * executing party, for example, a transfer agent, to request the status of one
 * or more order instruction or order cancellation request messages. Usage The
 * RequestForOrderStatusReport message is used to request the status of: - one
 * or several individual order instructions, or, - one or several order
 * messages, or - one or several individual order cancellation requests, or, -
 * one or several order cancellation request messages. The response to a
 * RequestForOrderStatusReport message is the OrderInstructionStatusReport
 * message or OrderCancellationStatusReport message. If the
 * RequestForOrderStatusReport message is used to request the status of several
 * individual order instructions or one or more order instruction messages, then
 * the instructing party may receive several OrderInstructionStatusReport
 * messages from the executing party. If the RequestForOrderStatusReport message
 * is used to request the status of several individual order cancellation
 * requests or one or more order cancellation messages, then the instructing
 * party may receive several OrderCancellationStatusReport messages from the
 * executing party. When the RequestForOrderStatusReport is used to request the
 * status of one or more individual orders or order cancellations, each
 * individual order is identified with its order reference. The investment
 * account and/or financial instrument related to the order can also be
 * identified. The message identification of the message in which the individual
 * order was conveyed may also be quoted in PreviousReference. When the
 * RequestForOrderStatusReport is used to request the status of an order message
 * or an order cancellations request message, then the message identification of
 * the order or cancellation message is identified in PreviousReference. The
 * RequestForOrderStatusReport message may not be used to request the status of
 * an investment account, a transfer or the status of a financial instrument.
 */
@PreviousVersion(RequestForOrderStatusReportV02.class)
@NextVersion(RequestForOrderStatusReportV04.class)
public class RequestForOrderStatusReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private MessageAndBusinessReference4 RequestDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public MessageAndBusinessReference4 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference4 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}