package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.CancellationRequestInformation1;

/**
 * Scope The InvoiceFinancingCancellationRequest message is sent by the
 * Financing Requestor to the Intermediary Agent (relay scenario) or First Agent
 * (direct scenario). It is used to request the cancellation of a previously
 * sent financing request. Usage The InvoiceFinancingCancellationRequest message
 * is used by the Financing Requestor to request the cancellation of a
 * previously sent financing request. It is not possible to send a cancellation
 * request for a single invoice contained in a bulk invoice financing request.
 * The InvoiceFinancingCancellationRequest message contains references (original
 * group identification and original creation date and time) of the original
 * financing request message to which is referred. As for
 * InvoiceFinancingRequest, the message can be used in a direct or a relay
 * scenario: - In a direct scenario, the message is sent directly to the First
 * Agent. The First Agent is the account servicer of the Financing Requestor. -
 * In a relay scenario, the message is sent to an Intermediary Agent. The
 * Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to
 * the First Agent.
 */
public class InvoiceFinancingCancellationRequestV01 {

	private MessageIdentification1 CancellationRequestIdentification;
	private CancellationRequestInformation1 CancellationRequestInformation;

	public MessageIdentification1 getCancellationRequestIdentification() {
		return CancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(
			MessageIdentification1 CancellationRequestIdentification) {
		this.CancellationRequestIdentification = CancellationRequestIdentification;
	}

	public CancellationRequestInformation1 getCancellationRequestInformation() {
		return CancellationRequestInformation;
	}

	public void setCancellationRequestInformation(
			CancellationRequestInformation1 CancellationRequestInformation) {
		this.CancellationRequestInformation = CancellationRequestInformation;
	}
}