package com.tools20022.repository.catalogue.msgdef.cain;

import com.tools20022.repository.dict.msg.Header19;
import com.tools20022.repository.dict.msg.AcceptorRejection4;

/**
 * The AcquirerRejection message is sent by any party, to reject an Acquirer to
 * Issuer message.
 */
public class AcquirerRejection {

	private Header19 Header;
	private AcceptorRejection4 Reject;

	public Header19 getHeader() {
		return Header;
	}

	public void setHeader(Header19 Header) {
		this.Header = Header;
	}

	public AcceptorRejection4 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection4 Reject) {
		this.Reject = Reject;
	}
}