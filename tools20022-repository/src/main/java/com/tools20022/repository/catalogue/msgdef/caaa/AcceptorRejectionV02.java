package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header5;
import com.tools20022.repository.dict.msg.AcceptorRejection1;

/**
 * The AcceptorRejection message is sent by the acquirer (or its agent) to
 * reject a message request or advice sent by an acceptor (or its agent), to
 * indicate that the received message could not be processed.
 */
@PreviousVersion(AcceptorRejectionV01.class)
@NextVersion(AcceptorRejectionV03.class)
public class AcceptorRejectionV02 {

	private Header5 Header;
	private AcceptorRejection1 Reject;

	public Header5 getHeader() {
		return Header;
	}

	public void setHeader(Header5 Header) {
		this.Header = Header;
	}

	public AcceptorRejection1 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection1 Reject) {
		this.Reject = Reject;
	}
}