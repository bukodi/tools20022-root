package com.tools20022.repository.catalogue.msgdef.tsin;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.OriginalRequestInformation1;
import com.tools20022.repository.dict.msg.FinancingInformationAndStatus1;
import java.util.Optional;

/**
 * Scope The InvoiceFinancingRequestStatus message is sent by the First Agent to
 * the Financing Requestor, alternatively through an Intermediary Agent (relay
 * scenario). It is used to inform the Financing Requestor about the positive or
 * negative status of a financing request or a financing cancellation request.
 * Usage The InvoiceFinancingRequestStatus message flows from the First Agent to
 * the Financing Requestor (alternatively through an Intermediary Agent) to
 * provide status information about a request previously sent. Its usage will
 * always be governed by a bilateral agreement between the First Agent and the
 * Financing Requestor. The InvoiceFinancingRequestStatus message can be used
 * two fold: - to provide information about the reception status (eg rejection,
 * acceptance) of a request message. In this case the status message is the
 * result of a technical validation performed by the First Agent on the request
 * message received; - to inform the Financing Requestor about the business
 * status of the financing process initiated. In this case the First Agent can:
 * communicate that a single financing request has been granted, is pending or
 * has not been granted at all; inform that a financing cancellation request has
 * been allowed or denied. Note. If the Financing Requestor requests financing
 * for more than one instalment related to the same invoice, the First Agent can
 * decide to finance only some of the instalments. In such case the status
 * message contains details and status of every single instalment (financed, not
 * financed). The message can be used in a direct or in a relay scenario: - In a
 * direct scenario, the message is sent directly by the First Agent to the
 * Financing Requestor; - In a relay scenario, the message is sent first by the
 * First Agent to the Intermediary Agent, who forwards it to the Financing
 * Requestor. The InvoiceFinancingRequestStatus message refers to the original
 * request(s) by means of references and a set of data elements included into
 * the original request.
 */
public class InvoiceFinancingRequestStatusV01 {

	private MessageIdentification1 StatusIdentification;
	private OriginalRequestInformation1 OriginalRequestInformationAndStatus;
	private Optional<FinancingInformationAndStatus1> FinancingInformationAndStatus;

	public MessageIdentification1 getStatusIdentification() {
		return StatusIdentification;
	}

	public void setStatusIdentification(
			MessageIdentification1 StatusIdentification) {
		this.StatusIdentification = StatusIdentification;
	}

	public OriginalRequestInformation1 getOriginalRequestInformationAndStatus() {
		return OriginalRequestInformationAndStatus;
	}

	public void setOriginalRequestInformationAndStatus(
			OriginalRequestInformation1 OriginalRequestInformationAndStatus) {
		this.OriginalRequestInformationAndStatus = OriginalRequestInformationAndStatus;
	}

	public Optional<FinancingInformationAndStatus1> getFinancingInformationAndStatus() {
		return FinancingInformationAndStatus;
	}

	public void setFinancingInformationAndStatus(
			Optional<FinancingInformationAndStatus1> FinancingInformationAndStatus) {
		this.FinancingInformationAndStatus = FinancingInformationAndStatus;
	}
}