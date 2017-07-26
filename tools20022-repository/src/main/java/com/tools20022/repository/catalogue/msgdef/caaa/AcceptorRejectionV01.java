package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header1;
import com.tools20022.repository.dict.msg.AcceptorRejection1;

/**
 * Scope The AcceptorRejection message is used by the acquirer to reject a
 * message received from the card acceptor. The acquirer uses this message as a
 * substitute to a response or an advice response message sent to the card
 * acceptor. Usage The AcceptorRejection message is used to indicate that the
 * received message could not be processed by the acquirer (for example, unable
 * to read or process the message, security error, duplicate message).
 */
@NextVersion(AcceptorRejectionV02.class)
public class AcceptorRejectionV01 {

	private Header1 Header;
	private AcceptorRejection1 Reject;

	public Header1 getHeader() {
		return Header;
	}

	public void setHeader(Header1 Header) {
		this.Header = Header;
	}

	public AcceptorRejection1 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection1 Reject) {
		this.Reject = Reject;
	}
}