package com.tools20022.repository.catalogue.msgdef.caaa;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.caaa.AcceptorRejectionV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.Header9;
import com.tools20022.repository.dict.msg.AcceptorRejection2;

/**
 * The AcceptorRejection message is sent by the acquirer (or its agent) to
 * reject a message request or advice sent by an acceptor (or its agent), to
 * indicate that the received message could not be processed.
 */
@PreviousVersion(AcceptorRejectionV02.class)
@NextVersion(AcceptorRejectionV04.class)
public class AcceptorRejectionV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Header9 Header;
	private AcceptorRejection2 Reject;

	public Header9 getHeader() {
		return Header;
	}

	public void setHeader(Header9 Header) {
		this.Header = Header;
	}

	public AcceptorRejection2 getReject() {
		return Reject;
	}

	public void setReject(AcceptorRejection2 Reject) {
		this.Reject = Reject;
	}
}