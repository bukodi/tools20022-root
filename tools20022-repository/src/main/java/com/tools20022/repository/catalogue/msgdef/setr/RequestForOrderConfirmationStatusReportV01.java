package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RequestForOrderConfirmationStatusReportV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.MessageAndBusinessReference5;
import com.tools20022.repository.dict.msg.Extension1;
import java.util.Optional;

/**
 * Scope An executing party, for example, a transfer agent, send the
 * RequestForOrderConfirmationStatusReport message to the instructing party, for
 * example, an investment manager or its authorised representative, to request
 * the status of one or several order confirmations. Usage The
 * RequestForOrderConfirmationStatusReport message is used to request the status
 * of either: - one or several individual order confirmations, or, - one or
 * several order confirmation messages. The response to a
 * RequestForOrderConfirmationStatusReport message is the
 * OrderConfirmationStatusReport message. When the
 * RequestForOrderConfirmationStatusReport message is used to request the status
 * of several individual order confirmations or one or more order confirmation
 * messages, the executing party may receive several
 * OrderConfirmationStatusReport messages from the instructing party. When the
 * RequestForOrderConfirmationStatusReport is used to request the status of one
 * or more individual order confirmations, each individual order confirmation is
 * identified with its order reference. The message identification of the
 * message in which the individual order confirmation was conveyed may also be
 * quoted in PreviousReference. When the RequestForOrderConfirmationStatusReport
 * is used to request the status of an order confirmation message, then the
 * message identification of the order confirmation message is identified in
 * PreviousReference.
 */
@NextVersion(RequestForOrderConfirmationStatusReportV02.class)
public class RequestForOrderConfirmationStatusReportV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private MessageAndBusinessReference5 RequestDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public MessageAndBusinessReference5 getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(MessageAndBusinessReference5 RequestDetails) {
		this.RequestDetails = RequestDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}